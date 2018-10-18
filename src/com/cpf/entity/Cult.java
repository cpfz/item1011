package com.cpf.entity;

import java.util.Date;

/**
 * ≈‡—µ¿‡
 * Created by Administrator on 2018/10/17 0017.
 */
public class Cult {
    private int id;
    private String name;
    private Date dateTime;
    private String departmentName;

    public Cult() {
    }

    public Cult(int id, String name, Date dateTime, String departmentName) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.departmentName = departmentName;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Cult{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
