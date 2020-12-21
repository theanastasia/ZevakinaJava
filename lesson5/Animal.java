package lesson5;

public abstract class Animal {
    private String type;
    private String name;
    private float maxRun;
    private float maxSwim;
    private float maxJump;

    protected Animal(String type, String name, float run, float swim, float jump) {
        this.type = type;
        this.name = name;
        this.maxRun = run;
        this.maxSwim = swim;
        this.maxJump = jump;
    }

    float getMaxRun() {
        return maxRun;
    }

    float getMaxSwim() {
        return maxJump;
    }

    float getMaxJump() {
        return maxSwim;
    }

    public void run(float value) {
        if (maxRun > 0) {
            System.out.println(name + " has ran!");
        }

//        return maxRun > value;
    }

    public boolean jump(float value) {
        System.out.println(name + " has jumped!");
        return maxJump > value;
    }

    public boolean swim(float value) {
        System.out.println(name + " has swum!");
        return maxSwim > value;
    }



}
