package Basics_of_software_code_development.LinearPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        SimpleDateFormat df = new SimpleDateFormat("HH 'ч' MM 'мин' SS 'с'");
        Calendar c = new GregorianCalendar(0,0,0);
        c.set(Calendar.SECOND, T);

        System.out.println(df.format(c.getTime()));
        System.out.println(c.get(Calendar.HOUR) + "ч " + c.get(Calendar.MINUTE) + "мин " + c.get(Calendar.SECOND) + "с ");
    }
}
