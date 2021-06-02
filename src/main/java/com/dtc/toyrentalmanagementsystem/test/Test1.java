package com.dtc.toyrentalmanagementsystem.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-27 11:40
 */
public class Test1 {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));
    }
}
