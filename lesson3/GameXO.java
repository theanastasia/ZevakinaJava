package lesson3;

import java.util.Random;
import java.util.Scanner;

public class GameXO {

    public static char[][] map;
    public static int sizeX;
    public static int sizeY;

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static final char ALIEN_DOT = 'X';
    public static final char MONKEY_DOT = '0';
    public static final char EMPTY_DOT = '_';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            alienTurn();
            if (checkWin(ALIEN_DOT)) {
                System.out.println("Alien win!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw!");
                break;
            }
            printMap();
            monkeyTurn();
            printMap();
            if (checkWin(MONKEY_DOT)) {
                System.out.println("Monkey win!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw!");
                break;
            }
        }
    }

    public static void initMap() {
        sizeX = 3;
        sizeY = 3;
        map = new char[sizeY][sizeX];
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                map[y][x] = EMPTY_DOT;
            }
        }
    }

    public static void printMap() {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static void alienTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты хода X, Y (от 1 до " + sizeX + ") через пробел: ");
            x = SCANNER.nextInt() -1;
            y = SCANNER.nextInt() -1;
        } while (!isValidCell(y, x) || !isEmptyCell(y, x));
        map[y][x] = ALIEN_DOT;
    }

    public static void monkeyTurn() {
        int x;
        int y;

        do {
            x = RANDOM.nextInt(sizeX);
            y = RANDOM.nextInt(sizeY);
        } while (!isEmptyCell(y, x));
            map[y][x] = MONKEY_DOT;
        }

    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < sizeX && y >= 0 && y < sizeY;
    }

    public static boolean isEmptyCell(int y, int x) {
        return map[y][x] == EMPTY_DOT;
    }

    public static boolean checkWin(char symbol) {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                if (map[y][x] == EMPTY_DOT) return false;
            }

        }
        return true;
    }

}
