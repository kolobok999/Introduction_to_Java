package Algorithmization.Tasks_Arrays_of_Arrays;
//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task2_9 {
    public static void main(String[] args) {
        int [][] matrix = new int[10][10];
        int [] temp = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 90 + 10);
                temp[j] += matrix[i][j];
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("________________________________________");
        int max = 0;                                    //максимальная сумма
        int t = 0;                                      //столбец с максимальной суммой
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
                t = i;
            }
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        System.out.println(t + 1 + "-й столбец содержит максимальную сумму, равную " + max);
    }
}
