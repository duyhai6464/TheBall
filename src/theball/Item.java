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
import static theball.MyGamePanel.rand;

public class Item extends Rectangle {
    
    private static final int turnalive = 6;
    private static final int turnhidden = 3;
    private int alive;
    private int hidden;
    private int id;
    
    Item(int x, int y, int width, int height) {
        super(x, y, width, height);
        alive = turnalive;
        hidden = rand.nextInt(1, turnhidden);
        id = -1;
    }
    
    public boolean isHidden() {
        return hidden > 0;
    }
    
    public boolean isAlive() {
        return alive > 0;
    }
    
    public int getId() {
        return id;
    }
    
    public void update(int id) {
        this.id = id;
        if (isHidden()) {
            hidden--;
        } else {
            alive--;
        }
    }
    
    public void draw(Graphics grap) {
        if (!isHidden()) {
            grap.setColor(new Color(255, 102, 150));
            grap.fillOval(x, y, height, width);
            grap.setColor(new Color(100, 100, 100));
            grap.drawLine((int) getCenterX(), y, (int) getCenterX(), y + height - 1);
            grap.drawLine(x, (int) getCenterY(), x + width - 1, (int) getCenterY());
        }
    }
    
}
