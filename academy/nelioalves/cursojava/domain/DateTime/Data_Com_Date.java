package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.DateTime;

import java.util.Date;

public class Data_Com_Date {
    public static void main(String[] args) {
        Date date = new Date(1621585828675L);
        date.setTime(date.getTime() + 3_600_00);
        System.out.println(date);
    }
}
