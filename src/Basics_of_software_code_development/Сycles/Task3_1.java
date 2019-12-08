package Basics_of_software_code_development.Сycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
public class Task3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int sum = 0;

        for (int i = 1; i <= a; i++) sum += i;
        System.out.println(sum);
    }
}
