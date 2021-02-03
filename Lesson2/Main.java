package JavaCore.lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][] {{"0", "1", "2", "3"}, {"0", "3", "6", "9"}, {"1", "1", "1", "1"}, {"2", "2", "3", "4"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MySizeArrayException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }
    public static int method(String[][] arr) throws MySizeArrayException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MySizeArrayException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MySizeArrayException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
}
}
