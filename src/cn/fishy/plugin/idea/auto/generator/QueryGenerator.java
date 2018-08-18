package cn.fishy.plugin.idea.auto.generator;

import cn.fishy.plugin.idea.auto.domain.Column;

import java.util.List;

public interface QueryGenerator {
    public String generate(String queryClassName, List<Column> columnQueryList);
}
