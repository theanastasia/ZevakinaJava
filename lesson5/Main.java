package lesson5;

import lesson5.zoo.Bird;
import lesson5.zoo.Cat;
import lesson5.zoo.Dog;
import lesson5.zoo.Horse;

public class Main {
    public static void main(String[] args) {
        Cat kitty = new Cat("dvornyazhka", "Milochka", 200, 0, 2);
        Dog doggy = new Dog("dvor-terier", "Barsik", 500, 10, 0.5f);
        Horse stallion = new Horse("royal arabian", "Spirit", 1500, 0, 5);
        Bird birdy = new Bird("swan", "Swan", 5, 100, 0.2f);

        Animal[] arr = {kitty, doggy, stallion, birdy};
        for (int i = 0; i < arr.length; i++) {
            stallion.jump(1000);
            doggy.run(2000);
            kitty.swim(2);
                   }
        }
    }

