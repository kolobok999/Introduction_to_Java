package Algorithmization.Single_Dimension_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        int [] A = new int[n];
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            A[i - 1] = i;
            if ((i % k) == 0) sum += i;
        }

        System.out.println(sum);
    }
}
