//Даны действительные числа a1, а2. Найти
//        max(a1+a2n, a2+a2n-1, an + an+1).


package Algorithmization.Single_Dimension_Arrays;

public class Task1_7 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1000);
        int m = n / 2;
        double[] array = new double[n];
        double max = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 1000 - 500;
        }

        for (int i = 0, k = m; i < m; i++, k--) {
            max = Math.max(max, array[i] + array[2 * k]);
        }
        System.out.println(max);
    }
}
