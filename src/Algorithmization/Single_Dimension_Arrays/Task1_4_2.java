package Algorithmization.Single_Dimension_Arrays;

import java.util.ArrayList;
import java.util.Collections;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task1_4_2 {
    public static void main(String[] args) {
        int n = (int) (2 + Math.random() * 100);
        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Math.random() * 200 - 100);
            System.out.printf("%.2f\t", list.get(i));
        }
        double min = Collections.min(list);
        double max = Collections.max(list);

        Collections.swap(list, list.indexOf(min), list.indexOf(max));
        System.out.printf("\nmin = %.2f\n", Collections.min(list));
        System.out.printf("max = %.2f\n", Collections.max(list));
        for (Double aDouble : list) {
            System.out.printf("%.2f\t", aDouble);
        }
    }
}
