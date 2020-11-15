//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

package Algorithmization.Single_Dimension_Arrays;

public class Task1_5 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100);
        int[] array = new int[n];

        for ( int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200);
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println("i = " + i + " ai = " + array[i]);
            }
        }
    }
}
