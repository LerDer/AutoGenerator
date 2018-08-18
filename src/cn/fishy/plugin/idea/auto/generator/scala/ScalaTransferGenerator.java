package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaTransferGenerator;

public class ScalaTransferGenerator extends JavaTransferGenerator {
    @Override
    public Code getCode() {
        return Code.SCALA;
    }

}
