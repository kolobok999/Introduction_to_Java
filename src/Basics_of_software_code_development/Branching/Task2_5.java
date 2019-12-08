package Basics_of_software_code_development.Branching;


public class Task2_5 {
    public static void main(String[] args) {
        Task2_5 task = new Task2_5();
        double x = 5;
        task.go(x);
    }

    private double go(double x) {
        if (x <= 3) {
            return x * x - 3 * x + 9;
        } else
            return 1 / (x * x * x + 6);
    }
}
