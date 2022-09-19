package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Date date = new Date();
        Date []dates=new Date[3];
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < dates.length; i++) {
            String inputDates = sc.next();
            Date inputDate;
            try {
                inputDate = dateFormat.parse(inputDates);

            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            dates[i] = inputDate;
        }

        for (int i = 0; i < dates.length; i++) {
            dateFormat.format(dates[i]);
            System.out.println(dateFormat.format(dates[i]));
        }

        Date min = dates[0];
        for (int i = 0; i < dates.length; i++) {
            if (min.before(dates[i])) {
                min=dates[i];
            }
        }
                System.out.println("Наименьшая дата в списке "+ dateFormat.format(min));

    }

}
