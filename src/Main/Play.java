/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Font ;
import javax.swing.UIManager;
import java.util.Random;

 

public class Play
{

       // A Function to set the position of a jframe(the left one)
       /*

       public static void setleft(JFrame frame)
       {
          int windowWidth = frame.getWidth();
          int windowHeight = frame.getHeight();
          Toolkit kit = Toolkit.getDefaultToolkit();
          Dimension screenSize = kit.getScreenSize();
          int screenWidth = screenSize.width; 
          int screenHeight = screenSize.height;  
          frame.setLocation(0, 0);  
       } 
       
      */
        
       // A function to show congratulation whenever the answer is correct! 
       // show the remaining fuels and the planet we are leaving
       
       public static void pass(String planet_name, int lives)
       {
          JOptionPane.showMessageDialog(null,"Congratulation!You are leaving "+planet_name+"! Good luck on next planet!"
          +"\n\nBackup fuels: "+ lives+" tons","ESCAPE FROM THE SOLAR SYSTEM",JOptionPane.INFORMATION_MESSAGE );
       }
     
     
       // A function to show lossing message and the remaining fuels whenever the answer is wrong
       // show the remaining fuels and the planet we are leaving
      
      
       public static void loss(String planet_name, int lives)
       {
          JOptionPane.showMessageDialog(null,"Unfortunately, due to the operational mistakes just made by you, we have lost some fuels. You are still stay at "+planet_name+"!"
          +"\n\nBackup fuels: "+ lives +" tons","ESCAPE FROM THE SOLAR SYSTEM",JOptionPane.INFORMATION_MESSAGE
          );
       }
     
     
       /* Function I : one of the most important part in this program! to count lives at any times 
                       before the final challenge! by comparing the input and right answer, generate
                       the result, and decide whether losing lives. Then figuring out whether player 
                       has losed all the fuels. Also, link the lives and planet name to the Last two
                       function: Loss and pass!
      */ 
      
     
     
     public static int I(String planet_name, int lives,int number,int rightanswer)
     {
         if (number == rightanswer )
         {
           pass(planet_name,lives);
         }
         else 
         {
             lives = lives-1;
             loss(planet_name,lives);
         if (lives ==0)
         {
            JOptionPane.showMessageDialog(null,"CHALLENGE FAILED !!!","ESCAPE FROM THE SOLAR SYSTEM",JOptionPane.INFORMATION_MESSAGE );
            System.exit(0); 
         }
         }
         return lives;
     }
     //A Function to Compare result in challenge 3-6, by generating according number to compare the answer 
     //More importanly, this function link the challenge3-6 to the FunctionI, which is lives counting. 
     //This I2 is needed because we use string input instead of choices in 3-6
       public static int I2(String input, String key)
       { 
       int number ;
       if (input.equals(key))
        {    
           number = 0;  
        }
        else
        {
        number=1;
        }
        return number;
       }
       
    /**
     *
     * @param args
     */
    public static void code()
    { 
     
      // picture, edit all of them, both size and content in windows piant. 
      ImageIcon shuttle = new ImageIcon("shuttle.jpg");
      ImageIcon mars = new ImageIcon("mars.jpg");
      ImageIcon solar = new ImageIcon("solar.jpg");
      ImageIcon jupiter = new ImageIcon("jupiter.jpg");
      ImageIcon Saturn = new ImageIcon("Saturn.jpg");
      ImageIcon uranus = new ImageIcon("uranus.jpg");
      ImageIcon Neptune = new ImageIcon("Neptune.jpg");
      ImageIcon pluto = new ImageIcon("pluto.jpg");
      ImageIcon finalc = new ImageIcon("fianlc.jpg");
      
      //Font of JOptionPane
      Font font = new Font("Rockwell Condensed", Font.PLAIN, 25);
      UIManager.put("OptionPane.messageFont", font);
      UIManager.put("OptionPane.buttonFont", font);
      UIManager.put("OptionPane.okButtonText","GO>>");

      
        //introduction
        JOptionPane.showMessageDialog(null,"","Game",JOptionPane.INFORMATION_MESSAGE,shuttle);
        JOptionPane.showMessageDialog(null,
        "ESCAPE FROM THE SOLAR SYSTEM"
        +"\nOn a spaceship..."
        +"\nYou aim for somewhere outside the solar system..."
        +"\n\nThere are SIX planets in front of you..."
        +"\n\nCOME ON ! Remember: your fuels is limited..." 
        +"\nunsuccessful challenge will only deplete your additional 2 tons of fuels--"
        +"\n2 tons of fuels means you have two additional chance to waste"
        ,"ESCAPE FROM THE SOLAR SYSTEM",JOptionPane.INFORMATION_MESSAGE,solar);
     
        // Q1
        int num, LIVES=9    ;    
        JOptionPane.showMessageDialog(null,"Ready for function1","Fist stop Mars",JOptionPane.PLAIN_MESSAGE,mars);
        String[] choices1 = {"3","4","1"};
        num = JOptionPane.showOptionDialog(null,"x+3=7, Find the value of x."
        +"\n\n\n Backup Fuels:"+LIVES+"tons" 
        ,"Escape from solar system step1"
        ,-1,-1,mars,choices1,choices1[0]);
        LIVES = I("Mars",LIVES,num,1);
       
        
        // Q2
        JOptionPane.showMessageDialog(null,"Ready for function2","Second stop Jupiter",JOptionPane.PLAIN_MESSAGE,jupiter);
        String[] choices2 = {"2y","8+y","2y+8"};
        num = JOptionPane.showOptionDialog(null," If z=y+4 , what does 2z equals?  "
        +"\n\n\n Backup Fuels:"+LIVES+"tons" 
        ,"Escape from solar system step2"
        ,-1,-1,jupiter,choices2,choices2[0]);
        LIVES = I("Jupiter",LIVES,num,2);
        
        
        //Q3
        JOptionPane.showMessageDialog(null,"Ready for function3","Third stop Saturn",JOptionPane.PLAIN_MESSAGE,Saturn);
        String[] choices3 = {"-2/5","2/5","4/5"};
        num = JOptionPane.showOptionDialog(null," If 5x+3=1, x = ?"
        +"\n\n\n Backup Fuels:"+LIVES+"tons" 
        ,"Escape from solar system step1"
        ,-1,-1,Saturn,choices3,choices3[0]);
        LIVES = I("Saturn",LIVES,num,0);
    
     
        //Preparing for part 2 create two frame 
        //f is used to contain picture as additional information
        //f1 is used to contain question which is JOptionPane. Location we use the functions  
        
        JFrame f = new JFrame();
        f.setSize(600,600);
        f.setLocation(0,0);
        JLabel L = new JLabel(uranus);
        //JLabel as background
        f.setContentPane(L);
        f.pack();
        f.setVisible(true);        
        String input;
        JFrame f1 = new JFrame();
        f1.setSize(800,800);
        f1.setLocation(1200,0);    
        f1.setVisible(true);        
        f1.pack();
        //Q4
        input = JOptionPane.showInputDialog(f1, "I am Uranus,a gas giant, the second least dense planet in solar system. \n Have you seen the formula in my body? " 
                                           +  "\n Try to find my Volume! "
                                           +  "\n M = 9 x 10^25 kg, V = 3 x 10^25 m^3."
                                           +  "\n Type in the density in kilogram per cubic metres."
                                           +"\n\nBackup fuels:"+LIVES+" tons"
                                           );
        num=I2(input,"3");
        LIVES = I("Uranus",LIVES,num,0);
        
        
        //Q5
        L.setIcon(Neptune);
        input = JOptionPane.showInputDialog(f1, " My name is Neptune,which is the eighth farthest \nknown planet from the Sun in the Solar System!"
                                              + "\n My radius is nearly 2,000 km.\n I want to know my volume if my radius is only 2 km. " 
                                              + "\n type in the volume in cubic kilometres, then you can pass! "
                                              +"\n\nBackup fuels:"+LIVES+" tons"
                                              );                                  
        num=I2(input,"32");          
        LIVES = I("Neptune",LIVES,num,0);
       
       
        
        //Q6
        L.setIcon(pluto);
        input = JOptionPane.showInputDialog(f1, "I am Pluto. I am not that big but has five moons! " 
                                           +  "\n It is Gravity keeps my moons move around me! "
                                           +  "\n Now see the model I create for you! "
                                           +  "\n If I need F(force)=3000N to keep the moon,"
                                           +  "\n What is Distance R between me and my moon? "
                                           +"\n\nBackup fuels:"+LIVES+" tons"
                                              );
                                        
        num=I2(input,"2");
        LIVES = I("Mars",LIVES,num,0);


       
         
       //FINAL CHALLENGE: Time-limited mutiple choices challenge while the difficulty setting is avaliable. 
     
         L.setIcon(solar);
         JOptionPane.showMessageDialog(null,"Your fuel is safe now!!\n\nNow,you need to use your SPEED UP to get to the escape velocity of the solar system\n\n"
                                       +"16.7 km/s !!!"
                                       +"\nbut you just need to finish each question in 20 seconds!"
                                       +"\nAre you ready for your final challenge?>>>>","ESCAPE FROM THE SOLAR SYSTEM",
                                       JOptionPane.INFORMATION_MESSAGE,finalc);
         JOptionPane.showMessageDialog(null,"Newton Second Law is one of the greatest law, of great use in astronomy"
                                       +"\nOne equation is critical:"
                                       +"\nV1 = V0 + a x t"
                                       +"\nSo hard?"                                       
                                       +"\nJust know that Velocity is related with its initial Velocity, Acceleration!! \nand time"
                                       +"\nIn fact, if you do not understand, just practice your math !\n Ready? ","Introduction",
                                       JOptionPane.INFORMATION_MESSAGE,finalc);

         int output,i;
         final int times=4;
         double answer=0;
         int a;
         String Answer;
         
         
         
         // Difficulty Setting!!!!!
         //to choose the difficulty, which means changing the value RANGE of the number!
         //easy: 0-50   medium: 50-100  Difficult: 100-150 
         //Using Switch to set the number.
         
         
         String[] choices4 = {"Easy","Medium","Difficult"};
         num = JOptionPane.showOptionDialog(null,"Choose your math level"
         +"\n\n\n Backup Fuels:"+LIVES+"tons" 
         ,"Escape from solar system \n FINAL CHALLENGE - Difficulty Setting "
         ,-1,-1,null,choices4,choices4[0]);
         
        
         switch(num)
         {
         case 0:    output = 1;
                 break;
         case 1:  output = 50;
                 break;
         case 2:     output = 100;
                 break;
         default: output = 0;
                  break;
         }
         
         //That is a huge for loop including MAKING, and asking questions
         //Random generator serves to make questions
         //!! according to "output" we got before, we can adjust difficulty by changing the RANGE of coefficients.
        
         
         for(i=0;i<times;i++)  
         {
              // Coutning down start! see subclass...
              // This time it can be recycled!!!!!!!   
              // Every question the timer will restart. 
              new Timer("1").start();
         
              Random x = new Random();
              int V0 = x.nextInt(output+10 - output) + output;
              Random y = new Random();
              int  V1= y.nextInt(output+50 - output+10) + output+10;
              Random z = new Random();
              int  t= z.nextInt(6 - 1) + 1;
              a = (V1-V0)/t;
              
     //input the answer and compare the result and give the according statement.
     
              Answer = JOptionPane.showInputDialog(f," Given the equation: V1 = V0 + a x t, the current velocity(V0) is"+V0+
              ".\n after "+t+"seconds, V1 should be "+V1+" km/s, what should be your acceleration a?\n\n If the result is not integer, please delete the decimal part.");
           try
          {
          answer = Double.parseDouble(Answer);
          }
          catch (NumberFormatException e)
          {
          JOptionPane.showMessageDialog(f,"Sorry, you should input a number!");
          }                
          
              if (answer == a)
              {
              JOptionPane.showMessageDialog(f,"You are right, speed up! ","ESCAPE FROM THE SOLAR SYSTEM",JOptionPane.INFORMATION_MESSAGE    );
              }
              else 
              {
              JOptionPane.showMessageDialog(f,"Wrong acceleration calculation,a should be " +a+" Come on!","ESCAPE FROM THE SOLAR SYSTEM",JOptionPane.INFORMATION_MESSAGE);
              }
          }

           //Ending 

               JOptionPane.showMessageDialog(f," Your spacecraft has reached the escape velocity and are escaping from the solar system!\n\n        CONGRATULATION!","ESCAPE FROM THE SOLAR SYSTEM",JOptionPane.INFORMATION_MESSAGE,finalc);
               System.exit(0);
    
       
    
    }
}

        
      
        
        




        


