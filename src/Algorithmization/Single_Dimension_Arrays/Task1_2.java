package Algorithmization.Single_Dimension_Arrays;


//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//        числом. Подсчитать количество замен.
public class Task1_2 {
    public static void main(String... args) {
        int n = (int) (Math.random() * 100);
        double z = Math.random() * (200 + 1) - 100;
        int rez = 0;
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * (200 + 1) - 100;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                rez++;
            }
        }

        for (double a: array) {
            System.out.println(a);
        }
        System.out.println("Заменяемое число - " + z);
        System.out.println("Количество замен = " + rez);
    }
}
