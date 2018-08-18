package cn.fishy.plugin.idea.auto.generator;

import cn.fishy.plugin.idea.auto.domain.Column;

import java.util.List;

public interface BoGenerator {
    public String generate(String boClassName, List<Column> columnList);
}
