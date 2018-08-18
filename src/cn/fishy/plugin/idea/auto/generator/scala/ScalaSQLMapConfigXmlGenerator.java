package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaSQLMapConfigXmlGenerator;


public class ScalaSQLMapConfigXmlGenerator  extends JavaSQLMapConfigXmlGenerator {
    @Override
    public Code getCode() {
        return Code.SCALA;
    }

}
