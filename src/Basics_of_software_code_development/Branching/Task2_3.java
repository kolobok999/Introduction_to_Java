package Basics_of_software_code_development.Branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task2_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float x1 = readFloat(reader);
        float y1 = readFloat(reader);
        float x2 = readFloat(reader);
        float y2 = readFloat(reader);
        float x3 = readFloat(reader);
        float y3 = readFloat(reader);


        boolean onLine = false;
        float f1, f2;

        //Если x1 = x2, то прямая параллельна оси y, тогда x3 должна быть равна х1, при любом y
        //Аналогично для y
        if (x1 == x2) onLine = (x3 == x1);
        if (!onLine) {
            if (y1 == y2) onLine = (y3 == y1);
        }

        //Точки расположены на одной прямой, если выполняется тождество (x3-x1)(y2-y1)=(y3-y1)(x2-x1)
        if (!onLine) {
            f1 = (x3 - x1) / (x2 - x1);
            f2 = (y3 - y1) / (y2 - y1);
            onLine = (Math.abs(f1 - f2) < 1e-8);  //для обхода случая неточности расчетов
        }

        if (onLine) System.out.println("Точки расположены на одной прямой");
        else System.out.println("Точки не лежат на одной прямой");
    }

    static float readFloat(BufferedReader reader) throws IOException {
        return Float.parseFloat(reader.readLine());
    }
}
