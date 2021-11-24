/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package theball;

import java.awt.event.*;

/**
 *
 * @author duyha
 */
public class MyGameKeyAdapter extends KeyAdapter {

    private Paddle paddle;

    MyGameKeyAdapter(Paddle player) {
        paddle = player;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        paddle.keyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        paddle.keyReleased();
    }

}
