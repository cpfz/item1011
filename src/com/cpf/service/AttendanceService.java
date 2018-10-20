package com.cpf.service;

import com.cpf.entity.Attendance;

import java.util.List;

/**
 * Created by Administrator on 2018/10/19 0019.
 */
public interface AttendanceService {
    public void saveAttendance(Attendance attendance);
    public List<Attendance> queryByOfficeTime(String date);
    public List<Attendance> queryBySId(int sId);
    public void updateAttendClosingTime(Attendance attendance);
}
