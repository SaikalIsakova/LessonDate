package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd.MM.yyyy");
        String dateOfExam="18.04.2022";
        Date date;
        try {
            date = dateFormat.parse(dateOfExam);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Введите дату");
        String inputDates=sc.next();
        Date inputDate;
        try {
            inputDate = dateFormat.parse(inputDates);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        int a= inputDate.compareTo(date);
        switch (a){
            case -1:
                long l =(date.getTime()-inputDate.getTime())/(1000*60*60*24);
                int dayBefore=(int)l;
                System.out.printf("Экзамен через %s дней ",dayBefore);
                break;
            case 0:
                System.out.println("Экзамен сегодня");
                break;
            case 1:
                long l2 =(inputDate.getTime()-date.getTime())/(1000*60*60*24);
                int dayAfter=(int)l2;
                System.out.printf("Экзамен был %s дней назад",dayAfter);
        }
    }
}
