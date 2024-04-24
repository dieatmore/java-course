package com.homework06.one.entity;

/*
提供以下可直接使用的User类，直接使用getter/setter方法。

编写测试类主函数，模拟创建5个用户，分属3个不同城市

创建Set集合，添加以上元素对象。思考，为什么使用Set集合？
 */

public class User {
    private int id;
    private String name;
    private String city;

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
