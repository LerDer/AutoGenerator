package cn.fishy.plugin.idea.auto.constant;

public enum TypePath {
    SRC("src"), RESOURCES("resources");
    private String path;

    TypePath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public boolean isSrc() {
        return this.path.equals("src");
    }

    public boolean isResources() {
        return this.path.equals("resources");
    }
}