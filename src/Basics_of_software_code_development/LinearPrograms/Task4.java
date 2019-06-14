package Basics_of_software_code_development.LinearPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal R = new BigDecimal(reader.readLine());
        BigDecimal a = R.setScale(0, BigDecimal.ROUND_DOWN);
        BigDecimal x = R.subtract(a);
        System.out.println(x.multiply(BigDecimal.valueOf(1000)).add(a.divide(BigDecimal.valueOf(1000))));
    }
}
