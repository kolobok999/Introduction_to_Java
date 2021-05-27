package Algorithmization.Single_Dimension_Arrays;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task1_10 {
    public static void main(String[] args) {
        int n = 20;
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
        }

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
