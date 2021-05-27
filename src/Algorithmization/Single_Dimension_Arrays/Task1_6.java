//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 //являются простыми числами.

package Algorithmization.Single_Dimension_Arrays;

public class Task1_6 {
    public static void main(String[] args) {
         Task1_6 task = new Task1_6();
         task.go();
    }

    public void go() {
        double[] array = new double[50];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100 - 200;
            if (isPrime(i)) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }

    boolean isPrime(int k) {
        if ((k % 2) == 0) return false;
        for (int i = 3; i <= Math.sqrt(k); i++) {
            if ((k % i) == 0) return false;
        }
        return true;
    }
}
