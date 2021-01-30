package JavaCore.lesson1;

public class Robot implements RunJump {
    int maxHeight;
    int maxLength;
    String name;

    public Robot(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;

    }
    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Robot jump");
    }
    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Robot run");
    }

    @Override
    public String toString() {
        return "робот по имени " + name;
    }
}
