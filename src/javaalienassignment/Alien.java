
package javaalienassignment;

import java.awt.*;

public class Alien {
    private int x, y;
    private Color bodyColor;
    
    private static Color[] COLOR_PA = {Color.BLUE, Color.CYAN, 
                                             Color.GREEN, Color.MAGENTA, 
                                             Color.ORANGE, Color.PINK,
                                             Color.RED, Color.YELLOW};
    ;
    
        public static Color getRandomColor() {
        int index = (int) (Math.random() * COLOR_PA.length);
        return COLOR_PA[index];
    }
    
    
    public Alien() {
        this(0, 0);
        
    }
    
    public Alien(int firstX, int firstY)
    {
        x = firstX;
        y = firstY;
        bodyColor = getRandomColor();
    }
    
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;

    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    

    public void setBodyColor(Color color) {
        bodyColor = color;
    }
    
    public Color getBodyColor() {
        return bodyColor;
    }
    
    public void paint(Graphics g)
    {
        int[] xs = {x, x+50, x+50, x+44, x+37, x+25, x+13, x+6, x};
        int[] ys = {y+60, y+60, y+90, y+60, y+90, y+60, y+90, y+60, y+90};
        
        g.setColor(bodyColor);
        //draw the top of head
        g.fillOval(x, y, 50, 60);
        //draw the middle of head
        g.fillRect(x, y+30, 50, 30);
        //draw the bottom of head
        g.fillPolygon(xs, ys, 9);
        
        g.setColor(Color.BLACK);
        //draw the eyes
        g.fillOval(x+12, y+15, 10, 10);
        g.fillOval(x+28, y+15, 10, 10);
        //draw the mouth
        g.fillOval(x+15, y+30, 20, 10);
    }
}
