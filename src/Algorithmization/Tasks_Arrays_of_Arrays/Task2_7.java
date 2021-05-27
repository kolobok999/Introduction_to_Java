package Algorithmization.Tasks_Arrays_of_Arrays;
//Сформировать квадратную матрицу порядка N по правилу:
// A[i,j] = sin((i^2 - j^2) / N)
//и подсчитать количество положительных элементов в ней.

public class Task2_7 {
    public static void main(String[] args) {
        int n  = 5;
        int rez = 0;
        double [][] matrix = new double[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((matrix[i-1][j-1] = Math.sin(((double) (i * i - j * j)) / n)) > 0 ) {
                    rez++;
                }
            }
        }

        for (double[] i : matrix) {
            for (double j : i) {
                System.out.printf("%.4f  ", j);
            }
            System.out.println();
        }

        System.out.println(rez);

    }
}
