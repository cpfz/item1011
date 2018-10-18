package com.cpf.entity;

/**
 * 离职员工类
 * Created by Administrator on 2018/10/17 0017.
 */
public class Leave {
    private int id;
    private String name;
    private String tal;
    private String email;

    public Leave() {
    }

    public Leave(int id, String name, String tal, String email) {
        this.id = id;
        this.name = name;
        this.tal = tal;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTal() {
        return tal;
    }

    public void setTal(String tal) {
        this.tal = tal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tal='" + tal + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
