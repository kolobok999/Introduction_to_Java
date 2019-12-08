package Basics_of_software_code_development.Сycles;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е.
public class Task3_5 {
    public static void main(String[] args) {
        double e = 0.005;
        double sum = 0;
        double an;
        int i = 1;

        do {
            an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (e > an) break;
            i++;
            sum += an;
        } while (Math.abs(an) >= e);

        System.out.println(sum);
    }
}
