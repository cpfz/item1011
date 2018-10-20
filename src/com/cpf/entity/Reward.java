package com.cpf.entity;

import java.util.Date;

/**
 * Ω±…Õ¿‡
 * Created by Administrator on 2018/10/18 0018.
 */
public class Reward {
    private int id;
    private String name;
    private int bonus;
    private Date dateTime;
    private String sName;

    public Reward() {
    }

    public Reward(int id, String name, int bonus, Date dateTime, String sName) {
        this.id = id;
        this.name = name;
        this.bonus = bonus;
        this.dateTime = dateTime;
        this.sName = sName;
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

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bonus=" + bonus +
                ", dateTime=" + dateTime +
                ", sName='" + sName + '\'' +
                '}';
    }
}
