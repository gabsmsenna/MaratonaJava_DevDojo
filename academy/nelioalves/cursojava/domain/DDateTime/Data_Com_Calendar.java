package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.DDateTime;

import java.util.Calendar;
import java.util.Date;

public class Data_Com_Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR, 12);

        Date date = c.getTime();
        System.out.println(date);
    }
}
