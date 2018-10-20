package com.cpf.entity;

import java.util.Date;

/**
 * ≥Õ∑£¿‡
 * Created by Administrator on 2018/10/18 0018.
 */
public class Punish {
    private int id;
    private String name;
    private int forfeit;
    private Date dateTime;
    private String sName;

    public Punish() {
    }

    public Punish(int id, String name, int forfeit, Date dateTime, String sName) {
        this.id = id;
        this.name = name;
        this.forfeit = forfeit;
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

    public int getForfeit() {
        return forfeit;
    }

    public void setForfeit(int forfeit) {
        this.forfeit = forfeit;
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
        return "Punish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", forfeit=" + forfeit +
                ", dateTime=" + dateTime +
                ", sName='" + sName + '\'' +
                '}';
    }
}
