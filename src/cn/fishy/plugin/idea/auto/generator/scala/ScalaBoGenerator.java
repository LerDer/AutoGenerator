package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.constant.GenerateType;

public class ScalaBoGenerator extends ScalaDoGenerator {
    @Override
    public GenerateType generateType() {
        return GenerateType.BO;
    }
}
