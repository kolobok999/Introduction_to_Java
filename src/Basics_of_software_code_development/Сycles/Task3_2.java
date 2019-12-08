package Basics_of_software_code_development.Сycles;

//
public class Task3_2 {
    public static void main(String[] args) {
        int a = -6;
        int b = 8;
        int h = 3;

        for (int x = a; x <= b; x += h) {
            if (x <= 2) System.out.println(-x);
            else System.out.println(x);
        }
    }
}
