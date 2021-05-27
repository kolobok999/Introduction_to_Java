package Algorithmization.Tasks_Arrays_of_Arrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2_2 {
    public static void main(String[] args) {
        int n = 10;
        int [][] matrix = new int[n][n];
        for (int i = 0, m = n - 1; i < matrix.length; i++, m--) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
                if ((i == j) || (j == m)) {
                    System.out.print(matrix[i][j] + " ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
