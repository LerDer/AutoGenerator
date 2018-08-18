package cn.fishy.plugin.idea.auto.generator;

import cn.fishy.plugin.idea.auto.constant.GenerateType;
import cn.fishy.plugin.idea.auto.constant.ImportMapHolder;
import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.domain.Column;
import cn.fishy.plugin.idea.auto.domain.Setting;
import cn.fishy.plugin.idea.auto.domain.TemplateConfig;
import cn.fishy.plugin.idea.auto.storage.SettingManager;
import cn.fishy.plugin.idea.auto.util.PathHolder;
import cn.fishy.plugin.idea.auto.util.TemplateUtil;
import org.apache.commons.httpclient.util.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseGenerator {

    protected static List<String> deleteKeyList = new ArrayList<>();

    static {
        deleteKeyList.add("is_delete");
        deleteKeyList.add("is_deleted");
        deleteKeyList.add("deleted");
    }

    public String generate() {
        Map<String, Object> map = initMap();
        return generate(getTemplate(), map);
    }

    private String getTemplate() {
        return TemplateConfig.getTemplate(getCode(), generateType());
    }

    public String generate(Map<String, Object> map) {
        return generate(getTemplate(), map);
    }

    public String generate(String tpl, Map<String, Object> map) {
        return TemplateUtil.parseByVm(tpl, map);
    }

    public abstract Code getCode();

    public abstract GenerateType generateType();

    protected List<String> getImportList(List<Column> columnList, boolean objectClass) {
        return getImportList(columnList, objectClass, false);
    }

    protected List<String> getImportList(List<Column> columnList, boolean objectClass, boolean addList) {
        List<String> importList = new ArrayList<>();
        if (objectClass) {
            importList.add("java.io.Serializable");
        }
        if (columnList != null && columnList.size() > 0) {
            for (Column c : columnList) {
                if (c != null) {
                    String i = ImportMapHolder.getImport(c.getType(), getCode());
                    if (i != null && !importList.contains(i)) {
                        importList.add(i);
                    }
                }
            }
        }
        if (addList) {
            if (Code.JAVA.equals(getCode())) {
                importList.add("java.util.List");
                if (GenerateType.Transfer.equals(generateType())) {
                    importList.add("java.util.ArrayList");
                }
            } else {
                importList.add("java.util");
            }
        }
        return importList;
    }

    public List<String> getImportList(Column column, boolean objectClass) {
        return getImportList(column, objectClass, false);
    }

    protected List<String> getImportList(Column column, boolean objectClass, boolean addList) {
        List<Column> l = new ArrayList<>();
        l.add(column);
        return getImportList(l, objectClass, addList);
    }

    public Map<String, Object> initMap() {
        Map<String, Object> map = new HashMap<>();
        Setting setting = SettingManager.get();
        map.put("user", setting.getAuthor());
        map.put("autoName", "auto" + generateType().getName());
        map.put("today", DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
        map.put("package", PathHolder.pkg(generateType()));
        return map;
    }

}
