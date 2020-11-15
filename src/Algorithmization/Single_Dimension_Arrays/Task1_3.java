package Algorithmization.Single_Dimension_Arrays;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//        положительных и нулевых элементов.

public class Task1_3 {
    public static void main(String[] args) {
        int positiveElement = 0;
        int negativeElement = 0;
        int zeroElement = 0;
        int n = (int) (Math.random() * 100);
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 200  - 100;
        }

        for (double a : array) {
            System.out.println(a);
            if (a == 0.00) {
                zeroElement++;
            } else if (a < 0) {
                negativeElement++;
            } else {
                positiveElement++;
            }
        }

        System.out.println("Отрицательных элементов - " + negativeElement);
        System.out.println("Положительный элементов - " + positiveElement);
        System.out.println("Нулевых элементов - " + zeroElement);
    }
}
