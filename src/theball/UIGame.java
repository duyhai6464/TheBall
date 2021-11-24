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

public class UIGame {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1score;
    int player2score;
    int winnerid = -1;
    final static int pointTowin = 20;
    final static int pointdist = 6;

    UIGame(int GAME_WIDTH, int GAME_HEIGHT) {
        UIGame.GAME_WIDTH = GAME_WIDTH;
        UIGame.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics grap) {
        grap.setColor(Color.white);
        grap.setFont(new Font("Calibri", Font.PLAIN, 40));
        grap.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
        grap.drawOval(GAME_WIDTH / 2 - 70, GAME_HEIGHT / 2 - 140, 140, 280);
        grap.drawString(String.valueOf(player1score / 10) + String.valueOf(player1score % 10), (GAME_WIDTH / 2) - 45, GAME_HEIGHT - 10);
        grap.drawString(String.valueOf(player2score / 10) + String.valueOf(player2score % 10), (GAME_WIDTH / 2) + 5, GAME_HEIGHT - 10);
        if (winnerid != -1) {
            grap.setColor(new Color(255, 50, 50));
            grap.setFont(new Font("Calibri", Font.PLAIN, 60));
            if (winnerid == 1) {
                grap.drawString("LEFT WON", GAME_WIDTH / 2 - 125, GAME_HEIGHT / 2 - 50);
            } else {
                grap.drawString("RIGHT WON", GAME_WIDTH / 2 - 135, GAME_HEIGHT / 2 - 50);
            }
        }
    }

    public void update() {
        if (player1score >= pointTowin && player1score - player2score >= pointdist) {
            winnerid = 1;
        }
        if (player2score >= pointTowin && player2score - player1score >= pointdist) {
            winnerid = 0;
        }
    }
}
