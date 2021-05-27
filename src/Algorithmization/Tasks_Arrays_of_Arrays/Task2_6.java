package Algorithmization.Tasks_Arrays_of_Arrays;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task2_6 {
    public static void main(String[] args) {
        int n = 20;
        int t = n;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++, t--) {
            for (int j = 0; j < n; j++) {
                if (i < n / 2) {
                    if ((j >= i) && (j < t)) {
                        matrix[i][j] = 1;
                    }
                } else {
                    if ((j >= t - 1) && (j <= i)) {
                        matrix[i][j] = 1;
                    }
                }
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
