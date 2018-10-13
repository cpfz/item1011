package com.cpf.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public class Employ {
    private int id;
    private String applicantName;//ӦƸ������
    private Date deliverTime;//Ͷ��ʱ��
    private Date interviewTime;//����ʱ��
    private String departmentName;//ӦƸ�Ĳ���
    private String positionName;//ӦƸ�ĸ�λ
    private String status;//�鿴״̬
    private String interview;//����״̬
    private String hire;//¼��״̬

    public Employ() {
    }

    public Date getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(Date interviewTime) {
        this.interviewTime = interviewTime;
    }

    public Employ(int id, String applicantName, Date deliverTime, Date interviewTime, String departmentName, String positionName, String status, String interview, String hire) {
        this.id = id;
        this.applicantName = applicantName;
        this.deliverTime = deliverTime;
        this.interviewTime = interviewTime;
        this.departmentName = departmentName;
        this.positionName = positionName;
        this.status = status;
        this.interview = interview;
        this.hire = hire;
    }

    public Employ(int id, String applicantName, Date deliverTime, String departmentName, String positionName, String status, String interview, String hire) {
        this.id = id;
        this.applicantName = applicantName;
        this.deliverTime = deliverTime;
        this.departmentName = departmentName;
        this.positionName = positionName;
        this.status = status;
        this.interview = interview;
        this.hire = hire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInterview() {
        return interview;
    }

    public void setInterview(String interview) {
        this.interview = interview;
    }

    public String getHire() {
        return hire;
    }

    public void setHire(String hire) {
        this.hire = hire;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "id=" + id +
                ", applicantName='" + applicantName + '\'' +
                ", deliverTime=" + deliverTime +
                ", interviewTime=" + interviewTime +
                ", departmentName='" + departmentName + '\'' +
                ", positionName='" + positionName + '\'' +
                ", status='" + status + '\'' +
                ", interview='" + interview + '\'' +
                ", hire='" + hire + '\'' +
                '}';
    }
}
