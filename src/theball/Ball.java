/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theball;

/**
 *
 * @author duyha
 */
import java.awt.*;
import java.util.*;
import java.lang.Math;

public class Ball extends Rectangle {

    private static Random random = new Random();
    int xVelocity;
    int yVelocity;
    int initialSpeed = 3;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        int rphi = random.nextInt(45, 225);
        if (rphi >= 135) {
            rphi += 90;
        }
        int rXDirection = (int) (Math.sin(Math.toRadians(rphi)) * initialSpeed);
        int rYDirection = (int) (Math.cos(Math.toRadians(rphi)) * initialSpeed);

        setXDirection(rXDirection * initialSpeed);
        setYDirection(rYDirection * initialSpeed);
    }

    public void setXDirection(int xDirection) {
        xVelocity = xDirection;
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void update() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics grap) {
        grap.setColor(new Color(255, 50, 50));
        grap.fillOval(x, y, height, width);
    }
}
