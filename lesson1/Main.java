package JavaCore.lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RunJump[] contestants = {
                new Cat(10, 5, "kot"),
                new Cat(15, 10, "kotka"),
                new Human(2, 5, "masha"),
                new Human(1, 2, "lena"),
                new Robot(100, 50, "robot"),
                new Robot(70, 40, "minirobot")
        };

        OptionsRunJump[] tests = {
                new Track(5),
                new Track(2),
                new Wall(3),
                new Wall(9)
        };

        for (RunJump contestant : contestants) {
            System.out.println("Первый приступает к соревнованию " + contestant);
            boolean winner = true;
            for (OptionsRunJump test : tests) {
                System.out.println(Arrays.toString(contestants) + " пытается " + test);
                if (test.toJump(contestant.getMaxHeight()) ||
                        test.toRun(contestant.getMaxLength())) {
                    System.out.println("Препятствие пройдено!");
                } else {
                    winner = false;
                    System.out.println("Препятствие не пройдено!");
                    break;
                }
            }

            if(winner) {
                System.out.println(contestant + " выиграл!");
            } else {
                System.out.println(contestant + " проиграл.");
            }
            System.out.println();
    }
}}