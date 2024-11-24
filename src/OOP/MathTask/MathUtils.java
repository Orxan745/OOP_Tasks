package OOP.MathTask;

public class MathUtils {

    public static int sum(int a, int b) {
        int c = a + b;

        return c;
    }

    public static int difference(int a, int b) {
        int c = a - b;
        if (c < 0) {
            return -c;
        }else {
            return c;
        }
    }

    public static int product(int a, int b) {
        int c = a * b;

        return c;
    }

    public static double division(int a, int b) {
        int c = a / b;

        return c;
    }
}
