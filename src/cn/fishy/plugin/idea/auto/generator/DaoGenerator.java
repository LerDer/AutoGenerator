package cn.fishy.plugin.idea.auto.generator;

import cn.fishy.plugin.idea.auto.domain.Column;

public interface DaoGenerator {
    public String generate(String doClassName, String queryClassName, String daoClassName, Column primaryKeyColumn);
}
