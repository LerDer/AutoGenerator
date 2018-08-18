package cn.fishy.plugin.idea.auto.util;

import cn.fishy.plugin.idea.auto.storage.Env;

public class FileEncoder{

    private static byte[] getBytes(String content){
        return content.getBytes(Env.encodeFrom);
    }

    public static String encode(String content){
        byte[] bytes = getBytes(content);
        return new String(bytes,Env.encodeTo);
    }
}
