package cn.fishy.plugin.idea.auto.util;

import cn.fishy.plugin.idea.auto.constant.GenerateType;
import org.apache.commons.lang.StringUtils;

public class NameUtil {
    private static String toWords(String name) {
        return name.replaceAll("_", " ");
    }

    private static String formatName(String name) {
        return upFirstAll(toWords(name.toLowerCase())).replaceAll(" ", "");
    }

    private static String upFirstAll(String s) {
        s = s.trim().replaceAll("\\s", " ");
        String[] sa = s.split(" ");
        StringBuilder r = new StringBuilder();
        for (String o : sa) {
            if (StringUtils.isNotBlank(o)) {
                r.append(upFirst(o));
            }
        }
        return r.toString();
    }

    public static String upFirst(String o) {
        return o.replaceFirst(o.substring(0, 1), o.substring(0, 1).toUpperCase());
    }

    public static String lowFirst(String o) {
        return o.replaceFirst(o.substring(0, 1), o.substring(0, 1).toLowerCase());
    }

    public static String propertyName(String s) {
        return lowFirst(formatName(s));
    }

    public static String name(String s, GenerateType generateType){
        if(generateType.equals(GenerateType.BaseDAO) || generateType.equals(GenerateType.BaseQuery)){
            return generateType.getSuffix();
        }else{
            return formatName(s) + generateType.getSuffix();
        }
    }

}
