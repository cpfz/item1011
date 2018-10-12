package com.cpf.entity;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int genre;//判断是管理员0 员工1 还是游客2

    public User() {
    }

    public User(int id, String name, String password, int genre) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.genre = genre;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", genre=" + genre +
                '}';
    }
}
