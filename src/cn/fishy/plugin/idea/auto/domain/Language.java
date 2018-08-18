package cn.fishy.plugin.idea.auto.domain;

public enum Language {
    CHS("Chinese"), EN("English");
    private String name;

    Language(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
