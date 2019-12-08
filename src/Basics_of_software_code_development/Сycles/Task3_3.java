package Basics_of_software_code_development.Сycles;

//Найти сумму квадратов первых ста чисел
public class Task3_3 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <=100; i++) {
            sum += i*i;
        }

        System.out.println(sum);
    }
}
