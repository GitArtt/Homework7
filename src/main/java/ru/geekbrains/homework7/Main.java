package ru.geekbrains.homework7;

public class Main {
    public static void main(String[] args) {
        RunAndJump[] members = {
                new Human(500, 2),
                new Cat(1000, 3),
                new Robot(10000, 1)
        };
        Obstruction[] obstructions = {
                new Treadmill(400),
                new Wall(1),
                new Treadmill(1000),
                new Wall(3),
                new Treadmill(2000),
        };

        for (RunAndJump member : members) {
            for (Obstruction obstruction : obstructions) {
                if (obstruction instanceof Treadmill) {
                    if (!member.run(obstruction.getDistance())) break;
                } else {
                    if (!member.jump(obstruction.getHeight())) break;
                }
            }
        }

    }
}
