package com.cpf.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public class Department {
    private int id;
    private String name;
    private Date dateTime;

    public Department() {
    }

    public Department(int id, String name, Date dateTime) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
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

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
