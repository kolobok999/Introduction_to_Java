package Algorithmization.Tasks_Arrays_of_Arrays;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task2_5 {
    public static void main(String[] args) {
        int n = 8;
        int[][] matrix = new int[n][n];
        int t = n;
        for (int i = 0; i < n; i ++,t--) {
            for (int j = 0; j < t; j++) {
                matrix[i][j] = i + 1;
            }
        }

        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
