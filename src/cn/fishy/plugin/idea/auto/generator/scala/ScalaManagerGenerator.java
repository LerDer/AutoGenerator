package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaManagerGenerator;

public class ScalaManagerGenerator extends JavaManagerGenerator {

    @Override
    public Code getCode() {
        return Code.SCALA;
    }

}
