/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author zepingluo
 */
public class Timer extends Thread{
    
     public Timer(String str)
         {
		     super(str);
	       }  

    
         
     @Override
    public void run ()  
    {      
           Font font1 = new Font("Rockwell Condensed", Font.PLAIN, 100);
           ImageIcon intro = new ImageIcon("intro.jpg");
           JFrame f3 = new JFrame();
           f3.setAlwaysOnTop(true);
           f3.setSize(500, 200);
           f3.setLocation(800, 0);
           JPanel myPanel= new JPanel();
           f3.add(myPanel);
           myPanel.setLayout(new FlowLayout());
           JLabel L = new JLabel("GO");
           L.setFont(font1);
           myPanel.add(L);  
           myPanel.setBackground(Color.BLUE);
           f3.setVisible(true); 
           //f3.pack();
              
              
           for( int i=20;i>=0;i--)
           {
               try {
                   Timer.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
               }
    
               L.setText(String.valueOf(i)); 
           
               if(i==0)
               {  
                 L.setText("SPEED UP!!");
               }
           }  
           
           
           
                     
    }

}
