package Algorithmization.Tasks_Arrays_of_Arrays;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

public class Task2_14 {
    public static void main(String[] args) {
        int m = 10;
        int n = 8;
        int [][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            int k = i;
            for (int j = 0; j < matrix[0].length; j++) {
                if (k <= j) {
                    matrix[i][j] = 1;
                    k++;
                }
            }
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
