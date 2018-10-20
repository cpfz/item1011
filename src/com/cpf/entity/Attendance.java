package com.cpf.entity;

import java.util.Date;

/**
 * ¿¼ÇÚÀà
 * Created by Administrator on 2018/10/19 0019.
 */
public class Attendance {
    private int id;
    private String sName;
    private Date officeTime;
    private Date closingTime;
    private int sId;

    public Attendance() {
    }

    public Attendance(int id, String sName, Date officeTime, Date closingTime, int sId) {
        this.id = id;
        this.sName = sName;
        this.officeTime = officeTime;
        this.closingTime = closingTime;
        this.sId = sId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Date getOfficeTime() {
        return officeTime;
    }

    public void setOfficeTime(Date officeTime) {
        this.officeTime = officeTime;
    }

    public Date getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", officeTime=" + officeTime +
                ", closingTime=" + closingTime +
                ", sId=" + sId +
                '}';
    }
}
