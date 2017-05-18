package com.mygdx.game.tree;

/**
 * Created by Eugene on 18-May-17.
 */
public class Robot {
    double x;
    double y;
    double step;
    double angle;

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", angle=" + angle +
                '}';
    }

    public Robot(double x, double y, double step, double angle) {
        this.x = x;
        this.y = y;
        this.step = step;
        this.angle = angle;
    }
}
