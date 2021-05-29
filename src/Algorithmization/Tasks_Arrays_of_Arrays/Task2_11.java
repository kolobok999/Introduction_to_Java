package Algorithmization.Tasks_Arrays_of_Arrays;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class Task2_11 {
    public static void main(String[] args) {
        int [][] matrix = new int[10][20];
        int [] temp = new int[10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                if (matrix[i][j] == 5) {
                    temp[i]++;
                }
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Строки, в которых число 5 встречается более трёх раз:");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= 3) {
                System.out.print(i + 1 + " ");
            }
        }

    }
}
