package Algorithmization.Tasks_Arrays_of_Arrays;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2_8 {
    public static void main(String[] args) throws IOException {
        Task2_8 task = new Task2_8();
        task.go();
    }

    void go() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два номера столбцов, подлежащих замене");
        int c1 = Integer.parseInt(reader.readLine());
        int c2 = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[5][5];
        int [] temp = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {       //Заполняем матрицу случайными числами
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 200 - 100);
            }
        }
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("______________________________");


        for (int i = 0; i < matrix.length; i++) {
            temp[i] = matrix[i][c1 - 1];
            matrix[i][c1 - 1] = matrix[i][c2 - 1];
            matrix[i][c2 - 1] = temp[i];
        }

        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

