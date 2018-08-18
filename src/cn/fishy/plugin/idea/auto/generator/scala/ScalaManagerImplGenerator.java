package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaManagerImplGenerator;

public class ScalaManagerImplGenerator extends JavaManagerImplGenerator {
    @Override
    public Code getCode() {
        return Code.SCALA;
    }

}
