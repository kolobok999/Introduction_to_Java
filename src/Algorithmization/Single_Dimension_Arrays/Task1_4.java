package Algorithmization.Single_Dimension_Arrays;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task1_4 {
    public static void main(String[] args) {
        int n = (int) (2 + Math.random() * 100);
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 200 - 100;
            System.out.printf("%.2f\t", array[i]);
        }
        System.out.println();

        int iMax = 0, iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[iMax]) {
                iMax = i;
            } else if (array[i] < array[iMin]) {
                iMin = i;
            }
        }
        System.out.printf("min = %.2f\nmax = %.2f\n",array[iMin], array[iMax]);


        double tmp = array[iMax];
        array[iMax] = array[iMin];
        array[iMin] = tmp;

        for (double elem :
                array) {
            System.out.printf("%.2f\t", elem);
        }
    }
}
