package com.mygdx.game.tree;

/**
 * Created by Eugene on 18-May-17.
 */
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, 1, 90);
        RobotPath path = new RobotPath("F", 1);
        path.calcPath();
        Controller c = new Controller(robot, "F");
        c.move();


    }
}
