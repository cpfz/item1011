package com.cpf.dao;
import com.cpf.entity.Attendance;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/19 0019.
 */
@Repository
public interface AttendanceDao {
    public void saveAttendance(Attendance attendance);
    public List<Attendance> queryByOfficeTime(String date);
    public List<Attendance> queryBySId(int sId);
    public void updateAttendClosingTime(Attendance attendance);
}
