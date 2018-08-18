package cn.fishy.plugin.idea.auto.constant;

import cn.fishy.plugin.idea.auto.domain.Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportMapHolder {
    private static Map<String, String> importMap = new HashMap<>();
    private static List<String> javaIgnoreTypeList = new ArrayList<>();

    static {
        importMap.put("Date", "java.util.Date");
        importMap.put("Long", "java.lang.Long");
        importMap.put("Integer", "java.lang.Integer");
        importMap.put("BigDecimal", "java.math.BigDecimal");
        javaIgnoreTypeList.add("Long");
        javaIgnoreTypeList.add("Integer");
    }

    public static String getImport(String type, Code code) {
        String r = importMap.get(type);
        if (code.equals(Code.JAVA) && javaIgnoreTypeList.contains(type)) {
            return null;
        }
        return r;
    }

}
