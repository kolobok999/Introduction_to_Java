package Basics_of_software_code_development.Сycles;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
public class Task3_6 {
    public static void main(String[] args) {
        char charsSigns = '\u0000';
        int charsNumber = 0;
        for (int i = 0; i <= 2000; i++) {
            charsSigns++;
            charsNumber++;
            System.out.println("sign: " + charsSigns + "  number: " + charsNumber);
        }

    }
}
