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

    private static Random rand = new Random();
    private int initialSpeed = 3;
    int xVelocity;
    int yVelocity;

    Ball(int x, int y, int width, int height, int id) {
        super(x, y, width, height);
        int rphi;
        if (id == 1) {
            rphi = rand.nextInt(225,315);
        } else {
            rphi = rand.nextInt(45, 135);
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
