package com.cpf.entity;

/**
 * 简历
 * Created by Administrator on 2018/10/12 0012.
 */
public class Resume {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String academic;//学历
    private String tal;
    private String email;
    private int departmentId;//部门ID
    private int positionId;//岗位ID
    private String status;//政治面貌
    private String oldJob;//上一份工作
    private String experience;//经验
    private String salary;//薪资
    private String hobby;//爱好
    private int userId;

    public Resume(int id, String name, String sex, int age, String academic, String tal, String email, int departmentId, int positionId, String status, String oldJob, String experience, String salary, String hobby, int userId) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.academic = academic;
        this.tal = tal;
        this.email = email;
        this.departmentId = departmentId;
        this.positionId = positionId;
        this.status = status;
        this.oldJob = oldJob;
        this.experience = experience;
        this.salary = salary;
        this.hobby = hobby;
        this.userId = userId;
    }

    public Resume() {
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

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOldJob() {
        return oldJob;
    }

    public void setOldJob(String oldJob) {
        this.oldJob = oldJob;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", academic='" + academic + '\'' +
                ", tal='" + tal + '\'' +
                ", email='" + email + '\'' +
                ", departmentId=" + departmentId +
                ", positionId=" + positionId +
                ", status='" + status + '\'' +
                ", oldJob='" + oldJob + '\'' +
                ", experience='" + experience + '\'' +
                ", salary='" + salary + '\'' +
                ", hobby='" + hobby + '\'' +
                ", userId=" + userId +
                '}';
    }
}
