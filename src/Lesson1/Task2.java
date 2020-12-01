package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 9;
        System.out.println(myMath(a, b));
        boolean less = myMath(a, b) < 10;
        boolean more = myMath(a, b) > 20;

        if (less) {
            System.out.println("false");
        } else if (more) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        }
    public static int myMath(int x, int y) {
        return x + y;
    }
}
