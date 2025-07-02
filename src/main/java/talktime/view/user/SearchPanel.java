/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package talktime.view.user;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import static talktime.TalkTime.mainFrame;
import talktime.standards.DatabaseHandler;
import talktime.view.HomePanel;

/**
 *
 * @author Gopal
 */
public class SearchPanel extends javax.swing.JPanel {
 public String id;
 public String search;
 public int panelGap;
 JPanel panel;
    /**
     * Creates new form SearchPanel
     */
    public SearchPanel(String q) {
        initComponents();
        search=q; 
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        panelGap= 7;
        Border emptyBorder = BorderFactory.createEmptyBorder(panelGap,panelGap,panelGap,panelGap);
        setBorder(emptyBorder);
        show();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(panel);
        scrollPane.getViewport().setPreferredSize(new Dimension(858,5888));
        
        //JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane);
    }
    public void show(){
        try{
            
            DatabaseHandler db = new DatabaseHandler();
            String sql ="SELECT * FROM threads where match (thread_title,thread_desc) against (?)";
            String[] para={search};
            boolean noResult = true;
            ResultSet rs = db.executePrepare(sql,para);
            panel = new JPanel();
                panel.setPreferredSize(new Dimension(858,5888));
                panel.setBackground(new Color(255,255,255));
            while (rs.next()) {
                int tId= rs.getInt("thread_id");
                
                id =String.valueOf(tId);
                String title = rs.getString("thread_title");
                String desc = rs.getString("thread_desc");
                String userid = String.valueOf(rs.getInt("thread_user_id"));
                String time = rs.getString("timestamp");
                
                String sql2 = "SELECT user_email FROM users WHERE sno=?";
                String[] para1={userid};
                ResultSet rs1 = db.executePrepare(sql2,para1);
                rs1.next();
                String userEmail=rs1.getString("user_email") ;
              
                JPanel questionPanel = new JPanel();
                questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
                
                questionPanel.setBorder(BorderFactory.createEtchedBorder());
                questionPanel.setPreferredSize(new Dimension(850,70));
                questionPanel.setMinimumSize(new Dimension(850,70));
                questionPanel.setMaximumSize(new Dimension(850,70));
                questionPanel.setBackground(new Color(250,214,165));//(0xAD,0xD8,0xE6)
              
                JLabel titleLabel = new JLabel(title);
                Font font =new Font("Segoe UI",Font.BOLD,16);
                titleLabel.setFont(font);
                questionPanel.add(titleLabel);

                JLabel descLabel = new JLabel(desc);
                descLabel.setFont(new Font("Segoe UI",Font.PLAIN,14));
                questionPanel.add(descLabel);
          
                JLabel userLabel = new JLabel("Asked by: " + userEmail + " at " + time);
                userLabel.setFont(new Font("Segoe UI",Font.PLAIN,12));
                questionPanel.add(userLabel);
                
                
                
                questionPanel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //System.out.print(tId);
                          HomePanel hm1 = new HomePanel(tId,"y");
                          mainFrame.setContentPane(hm1);
                          mainFrame.pack();
                          mainFrame.setVisible(true);
                   
                    }
                    
                   
                }
                );
                panel.add(questionPanel);
                noResult=false;
            }
            if(noResult){
               JPanel errorPanel = new JPanel();
                errorPanel.setLayout(new BoxLayout(errorPanel, BoxLayout.Y_AXIS)); 
                errorPanel.setBorder(BorderFactory.createEtchedBorder());
                errorPanel.setPreferredSize(new Dimension(850,200));
                errorPanel.setMinimumSize(new Dimension(850,200));
                errorPanel.setMaximumSize(new Dimension(850,200));
                errorPanel.setBackground(new Color(250,214,165));//(0xAD,0xD8,0xE6)
                
                JLabel titleLabel = new JLabel("No results found");
                Font font =new Font("Segoe UI",Font.BOLD,24);
                titleLabel.setFont(font);
                errorPanel.add(titleLabel);
                
                JLabel descLabel = new JLabel("Suggestions:");
                descLabel.setFont(new Font("Segoe UI",Font.PLAIN,20));
                errorPanel.add(descLabel);
                
                JLabel userLabel1 = new JLabel("Make sure that all words are spelled correctly.");
                userLabel1.setFont(new Font("Segoe UI",Font.PLAIN,18));
                errorPanel.add(userLabel1);
                
                JLabel userLabel2 = new JLabel("Try differnt keywords");
                userLabel2.setFont(new Font("Segoe UI",Font.PLAIN,18));
                errorPanel.add(userLabel2);
                
                JLabel userLabel3 = new JLabel("Try more general keywords");
                userLabel3.setFont(new Font("Segoe UI",Font.PLAIN,18));
                errorPanel.add(userLabel3);
                
                JLabel userLabel4 = new JLabel("Try fewer keywords");
                userLabel4.setFont(new Font("Segoe UI",Font.PLAIN,18));
                errorPanel.add(userLabel4);
                
                 panel.add(errorPanel);
            }
            
        }catch(SQLException e){
            e.getMessage();
        }
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
}
