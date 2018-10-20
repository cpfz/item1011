package com.cpf.service.impl;

import com.cpf.dao.AttendanceDao;
import com.cpf.entity.Attendance;
import com.cpf.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/19 0019.
 */
@Service
public class AttendanceServiceImpl implements AttendanceService{
    @Autowired
    private AttendanceDao attendanceDao;

    @Override
    public void saveAttendance(Attendance attendance) {
        attendanceDao.saveAttendance(attendance);
    }

    @Override
    public List<Attendance> queryByOfficeTime(String date) {
        return attendanceDao.queryByOfficeTime(date);
    }

    @Override
    public List<Attendance> queryBySId(int sId) {
        return attendanceDao.queryBySId(sId);
    }

    @Override
    public void updateAttendClosingTime(Attendance attendance) {
        attendanceDao.updateAttendClosingTime(attendance);
    }
}
