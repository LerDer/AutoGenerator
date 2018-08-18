package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaPersistenceXmlGenerator;


public class ScalaPersistenceXmlGenerator extends JavaPersistenceXmlGenerator {

    @Override
    public Code getCode() {
        return Code.SCALA;
    }

}
