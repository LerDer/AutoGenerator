package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.constant.GenerateType;

public class ScalaQueryGenerator extends ScalaDoGenerator{
    @Override
    public GenerateType generateType() {
        return GenerateType.Query;
    }
}
