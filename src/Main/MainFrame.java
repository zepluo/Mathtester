/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DataStructure.Questions;
import GUI.FRQPanel;
import GUI.MCPanel;
import GUI.endPanel;
import GUI.startPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author zepingluo
 */
public class MainFrame extends javax.swing.JFrame {
//in a panel
    /**
     * Creates new form MainFrame
     */
    
    public ArrayList<Questions> questionList;
    public String filePath;
    public int numQuestion;
    public int timeInSeconds;
    public boolean finishBeforeTime=false;
    public static final int EASY = 0;
    public static final int MEDIUM = 1;
    public static final int HARD =2;
    public static final int UNKNOWN=-1;
    public static final int MULTIPLECHOICE=0;
    public static final int FREERESPONSE = 1;
   
    
    public MainFrame() {
        initComponents();
       // load();
       numQuestion=0;
        
        questionList = new ArrayList<Questions>();
        //test
               
        setQuestionPanel(new startPanel(this));
        
        
    }
        public void setDisplayPanel(JPanel panel)
                
        {
            displayPanel.setLayout(new BorderLayout());
            displayPanel.updateUI();
            displayPanel.removeAll();
            
            displayPanel.add(panel,BorderLayout.CENTER);
        }
           
       public void setQuestionPanel(JPanel panel)
       {
          questionPanel.setLayout(new BorderLayout());
            questionPanel.updateUI();
            questionPanel.removeAll();
         
        questionPanel.add(panel, BorderLayout.CENTER);
        }
        
    public void load() {
        System.out.println(filePath);
                try {
            // Load file and read info to RAM from file
            BufferedReader loadFile = new BufferedReader(new FileReader(
                    filePath));

            String input;
            // Continue to read in from text file 2 lines for each athlete
            // while there are still line to be read in
            // First line is their personal info
            // Second line is their goal data
            while ((input = loadFile.readLine()) != null) {
                String type = input;

                if(type.equalsIgnoreCase("MC"))
                {
                    String stem = loadFile.readLine();
                    
                    input = loadFile.readLine();
                    String[] answerChoices = input.split(",");
                    String correctAnswer=loadFile.readLine();
                    String dif = loadFile.readLine();
                    int difficulty = UNKNOWN;
                    if(dif.equalsIgnoreCase("easy"))
                    {
                        difficulty = EASY;
                    }
                    else if(dif.equalsIgnoreCase("medium"))
                    {
                        difficulty=MEDIUM;
                    }
                    else if(dif.equalsIgnoreCase("HARD"))
                    {
                        difficulty = HARD;
                    }
                 
                    questionList.add(new Questions(MULTIPLECHOICE, difficulty, stem, answerChoices,correctAnswer));
                    
                    System.out.println("ADD one");
                }
                else if(type.equalsIgnoreCase("FRQ"))
                {
                    String stem = loadFile.readLine();
                    String correctAnswer = loadFile.readLine();
                    String dif = loadFile.readLine();
                    int difficulty = UNKNOWN;
                    if(dif.equalsIgnoreCase("easy"))
                    {
                        difficulty = EASY;
                    }
                    else if(dif.equalsIgnoreCase("medium"))
                    {
                        difficulty=MEDIUM;
                    }
                    else if(dif.equalsIgnoreCase("HARD"))
                    {
                        difficulty = HARD;
                    }
                    questionList.add(new Questions(FREERESPONSE,stem,correctAnswer,difficulty) );
                    
                }

            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error trying to "
                    + "load file: " + ex,
                    "Load Error",
                    JOptionPane.ERROR_MESSAGE);
        }
         
                //load question panel
            bar.setMaximum(questionList.size());
            bar.setStringPainted(true);
            
            sortQuestions();
            loadQuestion();
            
        
        
        
  }
    
    public void sortQuestions()
    {
        for(int end = questionList.size()-1;end>0;end--) {
            int max = 0;
            // Find index value of Max
            for (int x = 1; x <= end; x++) {
                if (questionList.get(x).getDifficulty()>questionList.get(max).getDifficulty()) {
                    max = x;
                }
            }
            // Swap Max with End
            Questions temp = questionList.get(max);
            questionList.set(max, questionList.get(end));
            questionList.set(end, temp);
       
            
        }
    }
    public void loadQuestion()
    {
        if (numQuestion < questionList.size()) {
            int type = questionList.get(numQuestion).getType();
            if (type == MULTIPLECHOICE) {
                setQuestionPanel(new MCPanel(this));
            } else {
                setQuestionPanel(new FRQPanel(this));
            }
        }
        else
        {
            setQuestionPanel(new endPanel(this));
        }
        bar.setValue(numQuestion);
        bar.setString(""+numQuestion +"of "+questionList.size());
    }
    
    public void nextQuestion()
    {
        
    }
    public JProgressBar getBar()
    {
        return bar;
    }
    
    /**
   
    
    
    **/


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        questionPanel = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        displayPanel = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        importTestMenuItem = new javax.swing.JMenuItem();
        saveMyResponseMenuItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        bar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        bar.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        bar.setForeground(new java.awt.Color(255, 0, 0));
        bar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barStateChanged(evt);
            }
        });

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        nextButton.setText("next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        previousButton.setText("previous");

        fileMenu.setText("File");

        importTestMenuItem.setText("import test");
        fileMenu.add(importTestMenuItem);

        saveMyResponseMenuItem.setText("Save my response");
        fileMenu.add(saveMyResponseMenuItem);

        MenuBar.add(fileMenu);

        EditMenu.setText("Edit");
        MenuBar.add(EditMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(questionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(previousButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousButton)
                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_barStateChanged

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nextButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                MainFrame nF = new MainFrame();
                nF.setVisible(true);
                //Runtime.getRuntime().addShutdownHook(new SaveData(nF));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JProgressBar bar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem importTestMenuItem;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JMenuItem saveMyResponseMenuItem;
    // End of variables declaration//GEN-END:variables
}
