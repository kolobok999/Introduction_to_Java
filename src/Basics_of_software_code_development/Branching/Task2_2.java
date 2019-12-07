package Basics_of_software_code_development.Branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Найти max(min(a,b)) и min(c,d)
public class Task2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
