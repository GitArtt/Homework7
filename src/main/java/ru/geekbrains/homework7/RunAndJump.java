package ru.geekbrains.homework7;

public interface RunAndJump {

    int getMaxRun();
    int getMaxJump();
    String getType();

    default boolean run(int distance) {
        if (distance <= getMaxRun()) {
            System.out.println(getType() + " пробежал " + distance + " м");
            return true;
        }
        System.out.println(getType() + " не смог пробежать " + distance + " м");
        return false;
    }

    default boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.println(getType() + " перепрыгнул " + height + " м");
            return true;
        }
        System.out.println(getType() + " не смог перепрыгнуть " + height + " м");
        return false;
    }
}
