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
    
    public JLabel output;
    
     public Timer(String str)
         {
		     super(str);
                     output=new JLabel("");
	       }  

    
         
     @Override
    public void run ()  
    {      
           Font font1 = new Font("Rockwell Condensed", Font.PLAIN, 100);
           
           output.setText("GO");
           output.setFont(font1);
          
           for( int i=20;i>=0;i--)
           {
               try {
                   Timer.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
               }
    
               output.setText(String.valueOf(i)); 
           
               if(i==0)
               {  
                 output.setText("SPEED UP!!");
               }
           }  
           
           
           
                     
    }

}
