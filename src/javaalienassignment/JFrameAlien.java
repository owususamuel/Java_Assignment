/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalienassignment;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author owusu
 */
public class JFrameAlien extends JFrame{

    Alien alien[] = new Alien[5];
    public JFrameAlien(Alien[] myAlienArray) {
       super("An alien");
       alien = myAlienArray;
       
       setSize(400, 300);
       setLocation(200, 100);    
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       getContentPane().setBackground(Color.WHITE);
       setVisible(true);
        
    }
    
    
    public void paint(Graphics g) {
        super.paint(g);
        for (Alien a : alien) {
            a.paint(g);
        }
    }
    
}
