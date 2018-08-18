package cn.fishy.plugin.idea.auto.generator;

import cn.fishy.plugin.idea.auto.domain.Column;

import java.util.List;

public interface TransferGenerator {
    public String generate(String doClassName, String boClassName, String transferClassName, List<Column> columnList);
}
