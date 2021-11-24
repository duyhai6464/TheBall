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

    int yVelocity;
    int speed = 10;
    int id;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {
        if (id == 1) {
            if (e.getKeyCode() == KeyEvent.VK_Q) {
                setYDirection(-speed);
            }
            if (e.getKeyCode() == KeyEvent.VK_A) {
                setYDirection(speed);
            }
        } else {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(-speed);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(speed);
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        if (id == 1) {
            if (e.getKeyCode() == KeyEvent.VK_Q) {
                setYDirection(0);
            }
            if (e.getKeyCode() == KeyEvent.VK_A) {
                setYDirection(0);
            }
        } else {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                setYDirection(0);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                setYDirection(0);
            }
        }
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void update() {
        y = y + yVelocity;
    }

    public void draw(Graphics grap) {
        if (id == 1) {
            grap.setColor(new Color(255,255,0));
        } else {
            grap.setColor(new Color(153,255,0));
        }
        grap.fillRect(x, y, width, height);
    }
}
