/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package talktime.view.user;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import static talktime.TalkTime.mainFrame;
import talktime.standards.DatabaseHandler;
import talktime.standards.SessionManager;
import talktime.view.DailogBox;
import talktime.view.HomePanel;

/**
 *
 * @author Gopal
 */
public class PostCommentPanel extends javax.swing.JPanel {

    public String tId;
    
    /**
     * Creates new form PostCommentPanel
     */
    public PostCommentPanel(int tId,String message) {
        initComponents();
        components();
        this.tId = String.valueOf(tId);
        show(this.tId);
       }
    public void addComment(ActionEvent e){
        try{
            DatabaseHandler db = new DatabaseHandler();
           
            String category1 = titleTF.getText();
            String description = problemDesc.getText();
            String userId =String.valueOf(SessionManager.getSno());
            String sql1="insert into comments(comment_content,thread_id,comment_by) values(?,?,?)";
            String[] para1 ={description,tId,userId};
            db.executeInsertPrepare(sql1,para1);
            DailogBox dailog = new DailogBox(mainFrame,true,"Posted Succesfully.");
            
        }catch(SQLException ev){
           DailogBox dailog = new DailogBox(mainFrame,true,"An error occurred. Please try again.");
           System.out.print(ev.getMessage());
        }
        
    }
    public void show(String tId){
        try{
                DatabaseHandler db = new DatabaseHandler();
                String sql = "select * from threads where  thread_id =?";
                String[] para = {tId};
                ResultSet rs = db.executePrepare(sql,para);
                while (rs.next()) {
                String category1 = rs.getString("thread_title");
                String description = rs.getString("thread_desc");
                //String descPart1 = description.substring(0,120);
                //String descPart2 = description.substring(121);
                String rule ="This is a peer to peer forum. No Spam / Advertising / Self-promote in the forums is not allowed. Do not post copyright-infringing " ;
                String rule1="material.Do not post 'offensive' posts, links or images. Do not cross post questions Remain respectful of other members at all times";
                catNameLbl.setText(category1);
                desc1.setText(description);
                desc2.setText(" ");
                ruleL1.setText(rule);
                ruleL2.setText(rule1);
            
               // rules.setText("ksds");
                }
        }catch(SQLException e){
            e.getStackTrace();
        }
        
    }
    public void components(){
        jPanel1 = new javax.swing.JPanel();
        catNameLbl = new javax.swing.JLabel();
        desc1 = new javax.swing.JLabel();
        desc2 = new javax.swing.JLabel();
        ruleL1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ruleL2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titleTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        problemDesc = new javax.swing.JTextField();
        postButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(878, 588));
        setMinimumSize(new java.awt.Dimension(878, 588));
        setPreferredSize(new java.awt.Dimension(878, 588));

        jPanel1.setMaximumSize(new java.awt.Dimension(805, 238));
        jPanel1.setMinimumSize(new java.awt.Dimension(805, 238));

        catNameLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        desc1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        desc1.setText("jLabel1");

        desc2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        desc2.setText("jLabel1");

        ruleL1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ruleL1.setText("jLabel1");

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        ruleL2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ruleL2.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ruleL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(catNameLbl)
                    .addComponent(desc2, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addComponent(ruleL2, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(catNameLbl)
                .addGap(18, 18, 18)
                .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desc2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruleL1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruleL2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Post A Comment");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("About yourself");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Type your comment");

        postButton.setBackground(new java.awt.Color(255, 51, 0));
        postButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        postButton.setForeground(new java.awt.Color(255, 255, 255));
        postButton.setText("Post");
        postButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Browse Comments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(titleTF)
                    .addComponent(problemDesc)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(postButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 624, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(problemDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postButton)
                    .addComponent(jButton1))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }
    private void postButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
    addComment(evt);   // TODO add your handling code here:
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    HomePanel hm = new HomePanel("y",tId,true); 
    mainFrame.setContentPane(hm);
    mainFrame.pack();
    mainFrame.setVisible(true);// TODO add your handling code here:
    }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(878, 588));
        setMinimumSize(new java.awt.Dimension(878, 588));
        setPreferredSize(new java.awt.Dimension(878, 588));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
 private javax.swing.JLabel catNameLbl;
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel desc2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton postButton;
    private javax.swing.JTextField problemDesc;
    private javax.swing.JLabel ruleL1;
    private javax.swing.JLabel ruleL2;
    private javax.swing.JTextField titleTF;

}
