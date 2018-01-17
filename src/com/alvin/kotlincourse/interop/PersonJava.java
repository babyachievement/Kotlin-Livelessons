package com.alvin.kotlincourse.interop;

public class PersonJava {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonJava{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
