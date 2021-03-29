package ru.geekbrains.homework7;

public class Treadmill implements Obstruction {
    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
