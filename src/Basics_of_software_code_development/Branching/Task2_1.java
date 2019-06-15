package Basics_of_software_code_development.Branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if ((a + b) < 180) {
            if (a == 90 || b == 90 || (a + b == 90)) {
                System.out.println("Существует. Прямоугольный");
            } else {
                System.out.println("Существует. Не прямоугольный");
            }
        } else  {
            System.out.println("Не существует");
        }
    }
}
