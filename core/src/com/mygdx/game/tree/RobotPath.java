package com.mygdx.game.tree;

/**
 * Created by Eugene on 18-May-17.
 */
public class RobotPath {
    String initPath;
    int iterations;
    String path;

    public RobotPath(String initPath, int iterations) {
        this.initPath = initPath;
        this.iterations = iterations;
    }
    public void calcPath(){
        path = initPath;
    }
}
