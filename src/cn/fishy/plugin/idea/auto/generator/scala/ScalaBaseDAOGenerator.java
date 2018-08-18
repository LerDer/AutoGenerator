package cn.fishy.plugin.idea.auto.generator.scala;

import cn.fishy.plugin.idea.auto.domain.Code;
import cn.fishy.plugin.idea.auto.generator.java.JavaBaseDAOGenerator;

public class ScalaBaseDAOGenerator extends JavaBaseDAOGenerator {

    @Override
    public Code getCode() {
        return Code.SCALA;
    }

}
