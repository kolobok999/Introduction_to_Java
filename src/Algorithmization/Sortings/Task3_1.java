package Algorithmization.Sortings;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

public class Task3_1 {
    public static void main(String[] args) {
        int [] mass2 = new int[10];
        int [] mass1 = new int[20 + mass2.length];
        int k = 6;
        for (int i = 0; i < mass1.length - mass2.length; i++) {  //Создаем два массива
            mass1[i] = (int) (Math.random() * 99 + 1);
            if (i < mass2.length) {
                mass2 [i] = (int) (Math.random() * 100);
            }
        }

        for (int m : mass1) {
            if (m != 0)
                System.out.print(m + " ");
        }
        System.out.println();

        for (int m : mass2) {
            System.out.print(m + " ");
        }

        System.out.println();

//Перемещаем элементы в конец
        System.arraycopy(mass1, k, mass1, k + mass2.length, mass1.length - (k + mass2.length));

// Вставляем второй массив в первый с к-го элемента
        System.arraycopy(mass2, 0, mass1, k, mass2.length);

        for (int m : mass1) {
            System.out.print(m + " ");
        }
        System.out.println();

    }
}
