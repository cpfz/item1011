package com.cpf.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/14 0014.
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
//      ת�������������ʽ
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(date);
        Date parse = dateFormat.parse(format);
        System.out.println(parse);
    }
}
