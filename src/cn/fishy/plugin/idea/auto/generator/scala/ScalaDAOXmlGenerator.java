package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaDAOXmlGenerator;


public class ScalaDAOXmlGenerator extends JavaDAOXmlGenerator {

    @Override
    public Code getCode() {
        return Code.SCALA;
    }

}
