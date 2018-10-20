package com.cpf.entity;

/**
 * 招聘信息实体类
 * Created by Administrator on 2018/10/11 0011.
 */
public class Recruit {
    private int id;
    private String dept;
    private String post;
    private String function;
    private String price;
    private String site;

    public Recruit() {
    }

    public Recruit(int id, String dept, String post, String function, String price, String site) {
        this.id = id;
        this.dept = dept;
        this.post = post;
        this.function = function;
        this.price = price;
        this.site = site;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", dept='" + dept + '\'' +
                ", post='" + post + '\'' +
                ", function='" + function + '\'' +
                ", price='" + price + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
