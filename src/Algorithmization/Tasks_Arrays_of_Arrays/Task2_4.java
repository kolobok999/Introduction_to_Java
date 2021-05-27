package Algorithmization.Tasks_Arrays_of_Arrays;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task2_4 {
    public static void main(String[] args) {
        int n = 20;
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int m = n;
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = m--;
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
