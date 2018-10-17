package com.cpf.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public class Position {
    private int id;
    private String name;
    private Date dateTime;
    private int departmentId;

    public Position() {
    }

    public Position(String name, Date dateTime, int departmentId) {
        this.name = name;
        this.dateTime = dateTime;
        this.departmentId = departmentId;
    }

    public Position(int id, String name, Date dateTime, int departmentId) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.departmentId = departmentId;
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

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", departmentId=" + departmentId +
                '}';
    }
}
