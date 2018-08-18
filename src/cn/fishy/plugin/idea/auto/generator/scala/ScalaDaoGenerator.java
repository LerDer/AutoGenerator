package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaDaoGenerator;

public class ScalaDaoGenerator extends JavaDaoGenerator {

    @Override
    public Code getCode() {
        return Code.SCALA;
    }
}
