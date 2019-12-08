package Basics_of_software_code_development.Branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
public class Task2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());

        //в расчет взяты только случаи паралельного или перпендикулярного расположения ребер кирпича к отверстию
        if (((a >= x) && (b >= y)) || ((a >= y) && (b >= x))
                || ((a >= x) && (b >= z)) || ((a >= z) && (b >= x))
                || ((a >= z) && (b >= y)) || ((a >= y) && (b >= z))) {
            System.out.println("Пройдет");
        } else System.out.println("Не пройдет");
    }
}
