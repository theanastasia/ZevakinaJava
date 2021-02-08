package JavaCore.lesson3;

public class Main {
    public static void main (String[] args) {
        Integer[] array = new Integer[3];
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple2, apple1);
        Box<Orange> box2 = new Box<Orange>(orange1,orange2);
        box1.add(apple3);
        box2.add(orange3);

        System.out.println(box1.compare(box2));
        if(box1.compare(box2)) {
            System.out.println("Коробки равны по весу");
        } else System.out.println("Коробки не равны по весу");
    }
}
