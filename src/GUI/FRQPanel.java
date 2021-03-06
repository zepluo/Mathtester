/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataStructure.Questions;
import Main.MainFrame;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author zepingluo
 */
public class FRQPanel extends javax.swing.JPanel {

    /**
     * Creates new form FRQPanel
     */
    MainFrame frame;
    public FRQPanel(MainFrame frame) {
        initComponents();
        this.frame=frame;
        load();
        
    }
    
    public void load(){
        
        Questions cur = frame.questionList.get(frame.numQuestion);
     
        stemTextField.setText(cur.getStem());        
        
         name.setText(""+(frame.numQuestion+1)+"\n"+frame.currentTest.getTestName());
        submitButton.setEnabled(false);
        String answer = cur.getUserAnswer();
        if(!(answer.equals("")))
        {
            answerArea.setText(answer);
            submitButton.setEnabled(true);
        }       
         ImageIcon image = new ImageIcon(new ImageIcon(cur.getImageFile()).getImage().getScaledInstance(200, 200, 0));
         System.out.println("FRQ panel loading imagefile..."+cur.getImageFile());
        JLabel imageL = new JLabel(image);
        imageL.setSize(60, 60);
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

        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        answerArea = new javax.swing.JTextArea();
        stemTextField = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        imagePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(500, 415));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 287, -1, -1));

        answerArea.setColumns(20);
        answerArea.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        answerArea.setRows(5);
        answerArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                answerAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(answerArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, 339, -1));

        stemTextField.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        stemTextField.setText("jTextField1");
        stemTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stemTextFieldActionPerformed(evt);
            }
        });
        add(stemTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, 340, 109));

        name.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        name.setText("jLabel2");
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 6, -1, -1));

        imagePanel.setBackground(new java.awt.Color(204, 204, 255));
        add(imagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 230, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String answer = answerArea.getText();
        frame.questionList.get(frame.numQuestion).setUserAnswer(answer);
        frame.numQuestion++;
        
        frame.loadQuestion();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void stemTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stemTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stemTextFieldActionPerformed

    private void answerAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerAreaKeyTyped
        // TODO add your handling code here:
        submitButton.setEnabled(true);
    }//GEN-LAST:event_answerAreaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answerArea;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField stemTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
