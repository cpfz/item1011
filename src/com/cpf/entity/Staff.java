package com.cpf.entity;

import java.util.Date;

/**
 * ‘±π§¿‡
 * Created by Administrator on 2018/10/15 0015.
 */
public class Staff {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String academic;
    private String tal;
    private String email;
    private Date dateTime;
    private String departmentName;
    private String positionName;
    private int uId;

    public Staff(int id, String positionName) {
        this.id = id;
        this.positionName = positionName;
    }

    public Staff(int id, String departmentName, int uId) {
        this.id = id;
        this.departmentName = departmentName;
        this.uId = uId;
    }

    public Staff() {
    }

    public Staff(int id, String name, String sex, int age, String academic, String tal, String email, Date dateTime, String departmentName, String positionName, int uId) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.academic = academic;
        this.tal = tal;
        this.email = email;
        this.dateTime = dateTime;
        this.departmentName = departmentName;
        this.positionName = positionName;
        this.uId = uId;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
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

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }


    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", academic='" + academic + '\'' +
                ", tal='" + tal + '\'' +
                ", email='" + email + '\'' +
                ", dateTime=" + dateTime +
                ", departmentName='" + departmentName + '\'' +
                ", positionName='" + positionName + '\'' +
                ", uId=" + uId +
                '}';
    }
}
