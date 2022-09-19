package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task2 {

    public static void main(String[] args) {
        String start_date = "09/24/2021";
        String end_date = "10/17/2021";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM/dd/yyyy");
        Date date1;


            try {
                date1 = simpleDateFormat.parse(start_date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }


        Date date2;


            try {
                date2 = simpleDateFormat.parse(end_date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            System.out.println(simpleDateFormat.format(date1) + "  " + simpleDateFormat.format(date2));

            long l =Math.abs(date1.getTime()-date2.getTime())/(1000*60*60*24);
            int countOfDays=(int)l;
            System.out.println("Количество дней между датами = "+countOfDays);
        }
    }
