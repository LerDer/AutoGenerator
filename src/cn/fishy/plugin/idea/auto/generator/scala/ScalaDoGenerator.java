package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaDoGenerator;

public class ScalaDoGenerator extends JavaDoGenerator {
    @Override
    public Code getCode() {
        return Code.SCALA;
    }

}
