package Algorithmization.Tasks_Arrays_of_Arrays;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,..., n^2
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:    6 1 8
//                                                                          7 5 3
//                                                                          2 9 4

public class Task2_16 {
    public static void main(String[] args) {
        Task2_16 task = new Task2_16();
        task.go();
    }
    void go() {
        int n = 7;
        int sum = (n * (n * n + 1) / 2);
        int [][] magicSquare = new int[n][n];
        System.out.println(sum);

        int i = 0;
        int j = n / 2;
        magicSquare [i][j] = 1;

        for (int k = 2; k <= n * n; k++) {
            int iOld = i;
            int jOld = j;

            if (i == 0)
                i = n - 1;
            else
                i -= 1;

            if (j == n - 1)
                j = 0;
            else
                j += 1;

            while (magicSquare[i][j] != 0) {
                if (i == n - 1)
                    i = 0;
                else {
                    i = iOld + 1;
                }
                j = jOld;
            }
            magicSquare[i][j] = k;
        }

        writeMatrix(magicSquare);
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
