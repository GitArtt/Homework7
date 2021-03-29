package ru.geekbrains.homework7;

public class Wall implements Obstruction{
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getDistance() {
        return 0;
    }
}
