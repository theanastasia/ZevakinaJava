package Lesson1;

public class Task3 {
    public static void main(String[] args) {
        int number = 1;
        boolean negative = number < 0;
        if (negative) {
            System.out.println("Число отрицательное");
            } else {
            System.out.println("Число положительное");
        }
    }
}

// В данном задании выскакивает предупреждение. Condition 'negative' is always 'false'. Код при этом работает.
// Читала на stackoverflow.com, что это может быть баг IntelliJ IDEA. Может такое быть?
// Если нет, помогите понять, в чем дело. Спасибо!
