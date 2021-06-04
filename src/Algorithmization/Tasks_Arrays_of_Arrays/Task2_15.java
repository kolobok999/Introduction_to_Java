package Algorithmization.Tasks_Arrays_of_Arrays;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task2_15 {
    public static void main(String[] args) {
        Task2_15 task = new Task2_15();
        task.go();
    }

    void go() {
        int n = 10;
        int [][] matrix = new int[n][n];
        int max = (int) Double.NEGATIVE_INFINITY;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 200 - 100);
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        writeMatrix(matrix);
        System.out.println("__________________________________");
        System.out.println(max);
        System.out.println("__________________________________");

        for (int i = 0; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                matrix[i][j] = max;
            }
        }

        writeMatrix(matrix);

    }

    void writeMatrix(int [][] mtx) {
        for (int[] ints : mtx) {
            for (int j = 0; j < mtx[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

}
