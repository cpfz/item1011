package com.cpf.test;

import com.cpf.dao.AttendanceDao;
import com.cpf.dao.CultivateDao;
import com.cpf.entity.Attendance;
import com.cpf.entity.Cult;
import com.cpf.entity.Position;
import com.cpf.service.CultivateService;
import com.cpf.service.PositionService;
import com.cpf.service.ResumeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class Test1 {
    @Autowired
    private PositionService positionService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private CultivateDao cultivateDao;
    @Autowired
    private CultivateService cultivateService;
    @Autowired
    private AttendanceDao attendanceDao;
    @Test
    public void getPosit(){
        List<Position> positions = positionService.queryByDeptId(1);
        System.out.println(positions);
    }

    @Test
    public void savePosit(){
        Position position=new Position(0,"JJ",new Date(),1);
        positionService.savePosition(position);
    }
    @Test
    public void queryCult(){
        Date date=new Date();

        attendanceDao.saveAttendance(new Attendance(0,"123",date,null,8));
    }

}
