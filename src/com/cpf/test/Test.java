package com.cpf.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/14 0014.
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        int hour = c.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
    }
}
