//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//        чисел несколько, то определить наименьшее из них.
package Algorithmization.Single_Dimension_Arrays;

public class Task1_9 {
    public static void main(String[] args) {
        Task1_9 task = new Task1_9();
        task.go();
    }

    void go() {
        int[] array = new int[100];
        int [] buffer = new int[200];
        int maxi;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
            System.out.print(array[i] + " ");
            buffer[array[i] + 100]++;
        }

        maxi = max(buffer);
        System.out.println();
        int min = 200;
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] == maxi) {
                if (min > i) {
                    min = i;
                }
            }
        }
        min -= 100;
        System.out.println("\nНаиболее часто встречающееся число = " + min );
    }

    int max(int[] a) {
        int max = 0;
        for (int j : a) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }


}
