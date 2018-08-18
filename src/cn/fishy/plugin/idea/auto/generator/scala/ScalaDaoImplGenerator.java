package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaDaoImplGenerator;

public class ScalaDaoImplGenerator extends JavaDaoImplGenerator {

    @Override
    public Code getCode() {
        return Code.SCALA;
    }

}
