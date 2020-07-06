package com.chenhl.springbootdemo.domain;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
public class User {

    private Long id;

    private String name;

    private Cat cat;

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}
