package Basics_of_software_code_development.Сycles;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task3_8 {
    public static void main(String[] args) {
        int a = 456, b = 568;
        digit(a);
        digit(b);
    }

    static private void digit(int x) {
        int rez = x;
        do {
            System.out.println(rez % 10);
            rez = rez / 10;
        } while (rez > 0);
    }
}
