package net.zakoduj.library.model;

public enum Cover {

    SOFT("miękka"), HARD("twarda");

    private String name;

    Cover(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
