package ru.geekbrains.homework7;

public class Robot implements RunAndJump {
    private final int maxRun;
    private final int maxJump;
    private final String type;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.type = "Робот";
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public String getType() {
        return type;
    }

}
