package cn.fishy.plugin.idea.auto.util;

public class CharsetChanger {
    /**
     * 7位ASCII字符，也叫作ISO646-US、Unicode字符集的基本拉丁块
     */
    private static final String US_ASCII = "US-ASCII";

    /**
     * ISO 拉丁字母表 No.1，也叫作 ISO-LATIN-1
     */
    private static final String ISO_8859_1 = "ISO-8859-1";

    /**
     * 8 位 UCS 转换格式
     */
    private static final String UTF_8 = "UTF-8";

    /**
     * 16 位 UCS 转换格式，Big Endian（最低地址存放高位字节）字节顺序
     */
    private static final String UTF_16BE = "UTF-16BE";

    /**
     * 16 位 UCS 转换格式，Little-endian（最高地址存放低位字节）字节顺序
     */
    private static final String UTF_16LE = "UTF-16LE";

    /**
     * 16 位 UCS 转换格式，字节顺序由可选的字节顺序标记来标识
     */
    private static final String UTF_16 = "UTF-16";

    /**
     * 中文超大字符集
     */
    private static final String GBK = "GBK";

    /**
     * 将字符编码转换成US-ASCII码
     */
    public String toASCII(String str) throws Exception {
        return this.changeCharset(str, US_ASCII);
    }

    /**
     * 将字符编码转换成ISO-8859-1码
     */
    private String toISO_8859_1(String str) throws Exception {
        return this.changeCharset(str, ISO_8859_1);
    }

    /**
     * 将字符编码转换成UTF-8码
     */
    private String toUTF_8(String str) throws Exception {
        return this.changeCharset(str, UTF_8);
    }

    /**
     * 将字符编码转换成UTF-16BE码
     */
    private String toUTF_16BE(String str) throws Exception {
        return this.changeCharset(str, UTF_16BE);
    }

    /**
     * 将字符编码转换成UTF-16LE码
     */
    private String toUTF_16LE(String str) throws Exception {
        return this.changeCharset(str, UTF_16LE);
    }

    /**
     * 将字符编码转换成UTF-16码
     */
    private String toUTF_16(String str) throws Exception {
        return this.changeCharset(str, UTF_16);
    }

    /**
     * 将字符编码转换成GBK码
     */
    private String toGBK(String str) throws Exception {
        return this.changeCharset(str, GBK);
    }

    /**
     * 将字符编码转换成US-ASCII码
     */
    private String toASCII(String str, String from) throws Exception {
        return this.changeCharset(str, from, US_ASCII);
    }

    /**
     * 将字符编码转换成ISO-8859-1码
     */
    public String toISO_8859_1(String str, String from) throws Exception {
        return this.changeCharset(str, from, ISO_8859_1);
    }

    /**
     * 将字符编码转换成UTF-8码
     */
    public String toUTF_8(String str, String from) throws Exception {
        return this.changeCharset(str, from, UTF_8);
    }

    /**
     * 将字符编码转换成UTF-16BE码
     */
    public String toUTF_16BE(String str, String from) throws Exception {
        return this.changeCharset(str, from, UTF_16BE);
    }

    /**
     * 将字符编码转换成UTF-16LE码
     */
    public String toUTF_16LE(String str, String from) throws Exception {
        return this.changeCharset(str, UTF_16LE);
    }

    /**
     * 将字符编码转换成UTF-16码
     */
    public String toUTF_16(String str, String from) throws Exception {
        return this.changeCharset(str, from, UTF_16);
    }

    /**
     * 将字符编码转换成GBK码
     */
    public String toGBK(String str, String from) throws Exception {
        return this.changeCharset(str, from, GBK);
    }

    /**
     * 字符串编码转换的实现方法
     *
     * @param str        待转换编码的字符串
     * @param newCharset 目标编码
     */
    private String changeCharset(String str, String newCharset)
            throws Exception {
        if (str != null) {
            //用默认字符编码解码字符串。
            byte[] bs = str.getBytes();
            //用新的字符编码生成字符串
            return new String(bs, newCharset);
        }
        return null;
    }

    /**
     * 字符串编码转换的实现方法
     *
     * @param str        待转换编码的字符串
     * @param oldCharset 原编码
     * @param newCharset 目标编码
     */
    private String changeCharset(String str, String oldCharset, String newCharset)
            throws Exception {
        if (str != null) {
            //用旧的字符编码解码字符串。解码可能会出现异常。
            byte[] bs = str.getBytes(oldCharset);
            //用新的字符编码生成字符串
            return new String(bs, newCharset);
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        CharsetChanger test = new CharsetChanger();
        String str = "This is a 中文的 String!";
        System.out.println("str: " + str);
        String gbk = test.toGBK(str);
        System.out.println("转换成GBK码: " + gbk);
        System.out.println();
        String ascii = test.toASCII(str, CharsetChanger.UTF_8);
        System.out.println("转换成US-ASCII码: " + ascii);
        gbk = test.changeCharset(ascii, CharsetChanger.US_ASCII, CharsetChanger.UTF_8);
        System.out.println("再把ASCII码的字符串转换成UTF_8码: " + gbk);
        System.out.println();
        String iso88591 = test.toISO_8859_1(str);
        System.out.println("转换成ISO-8859-1码: " + iso88591);
        gbk = test.changeCharset(iso88591, CharsetChanger.ISO_8859_1, CharsetChanger.UTF_8);
        System.out.println("再把ISO-8859-1码的字符串转换成UTF_8码: " + gbk);
        System.out.println();
        String utf8 = test.toUTF_8(str);
        System.out.println("转换成UTF-8码: " + utf8);
        gbk = test.changeCharset(utf8, CharsetChanger.UTF_8, CharsetChanger.UTF_8);
        System.out.println("再把UTF-8码的字符串转换成UTF_8码: " + gbk);
        System.out.println();
        String utf16be = test.toUTF_16BE(str);
        System.out.println("转换成UTF-16BE码:" + utf16be);
        gbk = test.changeCharset(utf16be, CharsetChanger.UTF_16BE, CharsetChanger.UTF_8);
        System.out.println("再把UTF-16BE码的字符串转换成UTF_8码: " + gbk);
        System.out.println();
        String utf16le = test.toUTF_16LE(str);
        System.out.println("转换成UTF-16LE码:" + utf16le);
        gbk = test.changeCharset(utf16le, CharsetChanger.UTF_16LE, CharsetChanger.UTF_8);
        System.out.println("再把UTF-16LE码的字符串转换成UTF_8码: " + gbk);
        System.out.println();
        String utf16 = test.toUTF_16(str);
        System.out.println("转换成UTF-16码:" + utf16);
        gbk = test.changeCharset(utf16, CharsetChanger.UTF_16, CharsetChanger.UTF_8);
        System.out.println("再把UTF-16码的字符串转换成UTF_8码: " + gbk);
        String s = new String("中文".getBytes("UTF-8"), "UTF-8");
        System.out.println(s);
    }
}
