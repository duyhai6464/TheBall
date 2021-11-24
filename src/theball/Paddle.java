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
import java.awt.event.*;

public class Paddle extends Rectangle {

    private int yVelocity;
    private int speed;
    private int id;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id, int speed) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
        this.speed = speed;
    }

    public void keyPressed(int e) {
        if (id == 1) {
            if (e == KeyEvent.VK_Q) {
                setYDirection(-speed);
            }
            if (e == KeyEvent.VK_A) {
                setYDirection(speed);
            }
        } else {
            if (e == KeyEvent.VK_UP) {
                setYDirection(-speed);
            }
            if (e == KeyEvent.VK_DOWN) {
                setYDirection(speed);
            }
        }
    }

    public void keyReleased() {
        setYDirection(0);
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void update() {
        y = y + yVelocity;
    }

    public void draw(Graphics grap) {
        if (id == 1) {
            grap.setColor(new Color(255, 255, 0));
        } else {
            grap.setColor(new Color(153, 255, 0));
        }
        grap.fillRect(x, y, width, height);
    }
}
