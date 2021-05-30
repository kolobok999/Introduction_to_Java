package Algorithmization.Tasks_Arrays_of_Arrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task2_12 {
    public static void main(String[] args) {
        Task2_12 task = new Task2_12();
        task.go();

    }

    void go() {
        int [][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        printMatrix(matrix);
        System.out.println("__________________________________");

        for (int [] arr : matrix) {
            SelectionSort.sortAsc(arr);
        }

        printMatrix(matrix);
        System.out.println("__________________________________");

        for (int [] arr : matrix) {
            SelectionSort.sortDesc(arr);
        }

        printMatrix(matrix);
    }

    void printMatrix(int[][] mtx) {
        for (int[] ints : mtx) {
            for (int j = 0; j < mtx[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

}

class SelectionSort {
    public static void sortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {            //i - номер текущего шага
            int pos = i;
            int min = array[i];
//          Цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }

    public static void sortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {            //i - номер текущего шага
            int pos = i;
            int max = array[i];
//          Цикл выбора наибольшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    pos = j;
                    max = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = max;
        }
    }
}