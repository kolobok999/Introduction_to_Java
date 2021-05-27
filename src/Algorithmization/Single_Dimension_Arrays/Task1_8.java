//Дана последовательность целых чисел a1, a2,..., an. Образовать новую последовательность, выбросив из
//        исходной те члены, которые равны min(a1, a2,..., an).

package Algorithmization.Single_Dimension_Arrays;

public class Task1_8 {

    public static void main(String[] args) {
        Task1_8 task = new Task1_8();
        task.go();
    }

    public void go() {
        int[] array = new int[100];
        int[] arrayWithoutMin = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = array[0];
        for (int j : array) {
            min = Math.min(min, j);
        }
        System.out.println(min);
        for (int i = 0, k = 0; i < array.length; i++) {
            if (array[i] != min) {
                arrayWithoutMin[k] = array[i];
                System.out.print(arrayWithoutMin[k] + " ");
                k++;
            }
        }
    }
}
