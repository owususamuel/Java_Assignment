
package javaalienassignment;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class JavaApplication1 {

    public static void main(String[] args) {
  
        Alien myAlienArray[] = new Alien[5];
        
        for (int i= 0; i<myAlienArray.length; i++) {
            Color c = Alien.getRandomColor();
            if (i % 2 == 0)
            {
                myAlienArray[i] = new Alien();
            }
            else
            {
                StrangeAlien tri = new StrangeAlien();
                tri.setLegColor(c);
                myAlienArray[i] = tri;
            }
            myAlienArray[i].setPosition(i*60, i%2*60);
                        
        }
        
        JFrameAlien all = new JFrameAlien(myAlienArray);
        all.repaint();
        
    }
    
}

