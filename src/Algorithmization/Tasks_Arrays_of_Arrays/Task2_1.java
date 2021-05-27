package Algorithmization.Tasks_Arrays_of_Arrays;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task2_1 {
    public static void main(String[] args) {
        int [][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < matrix[0].length; j +=2) {
            System.out.println("____________________________________");
            if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                for (int[] ints : matrix) {
                    System.out.println(ints[j]);
                }
            }
        }
    }
}
