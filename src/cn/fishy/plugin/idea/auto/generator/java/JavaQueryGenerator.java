package cn.fishy.plugin.idea.auto.generator.java;

import cn.fishy.plugin.idea.auto.constant.GenerateType;

public class JavaQueryGenerator extends JavaDoGenerator {
    @Override
    public GenerateType generateType() {
        return GenerateType.Query;
    }
}
