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

    Paddle paddle1, paddle2;

    MyGameKeyAdapter(Paddle player1, Paddle player2) {
        paddle1 = player1;
        paddle2 = player2;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        paddle1.keyPressed(e);
        paddle2.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        paddle1.keyReleased(e);
        paddle2.keyReleased(e);
    }

}
