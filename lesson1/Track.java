package JavaCore.lesson1;

public class Track implements OptionsRunJump {
    int length;

    public Track (int height) {
        this.length = height;
    }
    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "Длина беговой дорожки " + length + " м";
    }
}
