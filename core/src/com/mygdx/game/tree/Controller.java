package com.mygdx.game.tree;

import java.util.Stack;

/**
 * Created by Eugene on 18-May-17.
 */
public class Controller {
    Stack<Robot> stack;
    Robot robot;
    String path;

    public Controller(Robot robot, String path) {
        this.robot = robot;
        this.path = path;
    }

    public void move(){
        for (char c : path.toCharArray()) {
            switch (c){
                case ('F') :{
                    robot.x = robot.step * Math.sin(robot.x);
                    robot.y = robot.step * Math.cos(robot.y);
                }
                case ('+') :{

                }
                case ('-') :{

                }
                case ('[') :{

                }
                case (']') :{

                }
            }
            System.out.println(robot);
        }
    }
}
