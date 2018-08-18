package cn.fishy.plugin.idea.auto.generator;

import cn.fishy.plugin.idea.auto.domain.Column;

public interface ManagerGenerator {
    public String generate(String objClassName, String queryClassName, String managerClassName, Column primaryKeyColumn);
}
