package com.cpf.entity;

/**
 * 招聘信息实体类
 * Created by Administrator on 2018/10/11 0011.
 */
public class Recruit {
    private int id;
    private String dept;
    private String function;
    private String price;

    public Recruit() {
    }

    public Recruit(int id, String dept, String function, String price) {
        this.id = id;
        this.dept = dept;
        this.function = function;
        this.price = price;
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

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", dept='" + dept + '\'' +
                ", function='" + function + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
