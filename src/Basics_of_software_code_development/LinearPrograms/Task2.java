package Basics_of_software_code_development.LinearPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c, z;
        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        c = Double.parseDouble(reader.readLine());

        z = (b + Math.sqrt((b * b + 4 * a * c))) / (2 * a) - (Math.cbrt(a) * c) + Math.pow(b, -2);

        System.out.println(z);

    }
}
