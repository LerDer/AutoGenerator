package cn.fishy.plugin.idea.auto.generator.java;

import cn.fishy.plugin.idea.auto.constant.GenerateType;

public class JavaBoGenerator extends JavaDoGenerator {

    @Override
    public GenerateType generateType() {
        return GenerateType.BO;
    }
}
