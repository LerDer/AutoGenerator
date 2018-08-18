package cn.fishy.plugin.idea.auto.generator;

import cn.fishy.plugin.idea.auto.domain.Column;

import java.util.List;

public interface DoGenerator {
    public String generate(String className, List<Column> columnList);
}
