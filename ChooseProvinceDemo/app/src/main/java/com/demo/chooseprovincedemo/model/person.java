package com.demo.chooseprovincedemo.model;

import java.io.Serializable;

/**
 * Created by mengwei on 2017/5/10.
 */

public class person implements Serializable {
    private String name;
    private int id;

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
