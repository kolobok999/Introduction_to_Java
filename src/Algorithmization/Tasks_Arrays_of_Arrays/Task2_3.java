package Algorithmization.Tasks_Arrays_of_Arrays;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task2_3 {
    public static void main(String[] args) {
        int k = 5;
        int p = 7;
        int [][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
                if ((j == p - 1) || ( i == k - 1)) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
