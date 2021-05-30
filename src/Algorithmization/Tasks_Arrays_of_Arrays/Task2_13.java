package Algorithmization.Tasks_Arrays_of_Arrays;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task2_13 {
    public static void main(String[] args) {
        Task2_13 task = new Task2_13();
        task.go();
    }
    void go() {
        int [][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 90 + 10);
            }
        }

        writeMatrix(matrix);
        System.out.println("_____________________________");

        sortColumn(matrix);

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

    void sortColumn(int [][] mtx) {
        for (int j = 0; j < mtx[0].length; j++) {
        for (int k = 0; k < mtx.length; k++) {              //номер текущего шага
            int pos = k;
            int min = mtx[k][j];
                for (int i = k + 1; i < mtx.length; i++) {
                    if (mtx[i][j] < min) {
                        pos = i;
                        min = mtx[i][j];
                    }
                }
                mtx[pos][j] = mtx[k][j];
                mtx[k][j] = min;
            }
        }
    }
}
