/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataStructure.Questions;
import Main.MainFrame;
import java.awt.BorderLayout;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author zepingluo
 */
public class MCPanel extends javax.swing.JPanel {

    MainFrame frame;
    /**
     * Creates new form MCPanel
     */
    public MCPanel(MainFrame frame)  {
        initComponents();
        this.frame=frame;
        load();
    }
//starts
    
    public void load() {
        
        Questions cur = frame.questionList.get(frame.numQuestion);
        A.setText(cur.getchoices()[0]);
        B.setText(cur.getchoices()[1]);
        C.setText(cur.getchoices()[2]);
        D.setText(cur.getchoices()[3]);
        stemTextArea.setText(cur.getStem());
        
        name.setText(""+(frame.numQuestion+1));
        submitButton.setEnabled(false);  
        String answer =cur.getUserAnswer();
        if(!(answer.equals("")))
        {
            if(answer.equalsIgnoreCase("A"))
            {
                A.setSelected(true);
                
            }
            else if(answer.equalsIgnoreCase("B"))
            {
                B.setSelected(true);
                
            }
            else if(answer.equalsIgnoreCase("C"))
            {
                C.setSelected(true);
                
            }
            else
            {
                D.setSelected(true);
                
            }
            submitButton.setEnabled(true); 
            
        }
        
        ImageIcon image = new ImageIcon(cur.getImageFile());
        JLabel imageL = new JLabel(image);
        imagePanel.setLayout(new BorderLayout());
            imagePanel.updateUI();
           imagePanel.removeAll();
        imagePanel.add(imageL,BorderLayout.CENTER);
            
                
        
        
        
    }
    
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        imagePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stemTextArea = new javax.swing.JTextArea();

        buttonGroup1.add(A);
        A.setText("jRadioButton1");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        buttonGroup1.add(B);
        B.setText("jRadioButton2");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        buttonGroup1.add(C);
        C.setText("jRadioButton3");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        buttonGroup1.add(D);
        D.setText("jRadioButton4");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        name.setText("jLabel1");

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );

        stemTextArea.setColumns(20);
        stemTextArea.setLineWrap(true);
        stemTextArea.setRows(5);
        jScrollPane1.setViewportView(stemTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitButton)
                                .addGap(114, 114, 114))
                            .addComponent(A)
                            .addComponent(B)
                            .addComponent(D)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(name))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(name)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(A)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C))
                            .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D)
                .addGap(9, 9, 9))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
        submitButton.setEnabled(true);
    }//GEN-LAST:event_BActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        A.setActionCommand("A");
        B.setActionCommand("B");
        C.setActionCommand("C");
        D.setActionCommand("D");
        String choice=buttonGroup1.getSelection().getActionCommand();
        
        System.out.print(choice);
        System.out.println("question:"+frame.numQuestion);
        frame.questionList.get(frame.numQuestion).setUserAnswer(choice);
        System.out.println("question:"+frame.numQuestion);
        frame.numQuestion++;
        
        frame.loadQuestion();
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
        submitButton.setEnabled(true);
    }//GEN-LAST:event_AActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        submitButton.setEnabled(true);
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
        submitButton.setEnabled(true);
    }//GEN-LAST:event_DActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextArea stemTextArea;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
