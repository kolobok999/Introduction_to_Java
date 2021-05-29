package Algorithmization.Tasks_Arrays_of_Arrays;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task2_10 {
    public static void main(String[] args) {
        int n = 10;
        int [][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
                if ((i == j) && (matrix[i][j] > 0)) {
                    System.out.print(matrix[i][j] + "  ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
