package Basics_of_software_code_development.Сycles;

import java.math.BigInteger;

//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task3_4 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= 200; i++){

            BigInteger t = new BigInteger(String.valueOf(i * i));
            System.out.println(i + "*" + i + "=" + t);
            result = result.multiply(t);

        }
        System.out.println(result);
    }
}
