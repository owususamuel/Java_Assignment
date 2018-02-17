/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalienassignment;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author owusu
 */
public class StrangeAlien extends Alien {

    private Color legColor;
        int x;
        int y;
    
    
   public StrangeAlien() {
        this(0, 0, Color.BLACK);
        
    }
    
    public StrangeAlien(int firstX, int firstY, Color legColor)
    {
        super(firstX, firstY);
        this.legColor = legColor;

    }
    
    public void setLegColor(Color color) {
        legColor = color;
    }
    
    @Override
    public void paint(Graphics g) {
  
//        g.setColor(bodyColor);
//        int[] xs = {x+95, x+125, x+155};
//        int[] ys = {y+145, y+80, y+145};
//        g.fillPolygon(xs, ys, 3);
//        
//        //the eyes
//        g.setColor(Color.BLACK);
//        g.fillOval(x+110, y+100, 12, 10);
//        g.fillOval(x+130, y+100, 12, 10);
//        
//        //draw the mouth
//        g.fillOval(x+115, y+110, 20, 10);
//        
//        //the legs
//        g.setColor(bodyColor);
//        g.fillRect(x+105, y+145, 10, 25);
//        g.fillRect(x+135, y+145, 10, 25);
//        
//        //shoes
//        g.setColor(Color.BLACK);
//        g.fillOval(x+100, y+160, 20, 15);
//        g.fillOval(x+130, y+160, 20, 15);
//     
        int x = getX();
        int y = getY();
        
        int[] xs = {x, x+28, x+56};
        int[] ys = {y+60, y, y+60};
        
        g.setColor(getBodyColor());
        //draw the body
        g.fillPolygon(xs, ys, 3);
        
        g.setColor(Color.BLACK);
        //draw the eyes
        g.fillOval(x+14, y+12, 12, 12);
        g.fillOval(x+31, y+12, 12, 12);
        //draw the nose
        g.fillOval(x+26, y+18, 5, 15);
        //draw the mouth
        g.fillOval(x+18, y+35, 20, 5);
        //draw the legs
        g.setColor(legColor);
        g.fillRect(x+16, y+60, 5, 17);
        g.fillRect(x+38, y+60, 5, 17);
        //draw the feet
        g.setColor(Color.BLACK);
        g.fillArc(x+8, y+75, 20, 20, 0, 180);
        g.fillArc(x+30, y+75, 20, 20, 0, 180);
        
    }
}
