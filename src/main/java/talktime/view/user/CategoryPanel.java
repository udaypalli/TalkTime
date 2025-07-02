/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package talktime.view.user;


import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import static talktime.TalkTime.mainFrame;
import talktime.standards.CombinePanel;
import talktime.standards.DatabaseHandler;
import talktime.view.HomePanel;

/**
 *
 * @author Gopal
 */
public class CategoryPanel extends javax.swing.JPanel {
 
    /**
     * Creates new form CategoryPanel
     */
    public CategoryPanel() {
        initComponents();
        show();
    }
    public void show(){
        
           try{
                DatabaseHandler db = new DatabaseHandler();
                String sql = "select * from categories";
                ResultSet rs = db.executeQuery(sql);
              
                int i = 0;
                while (rs.next()) {
                
                String category = rs.getString("category_name");
                String description = rs.getString("category_description");
                int categoryId = rs.getInt("category_id");
                if(i==0){
                    catName0.setText(category);
                    image0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card" + categoryId + ".jpg")));
                    viewButton0.addActionListener(e -> {
                    HomePanel hm = new HomePanel(categoryId);
                    mainFrame.setContentPane(hm);
                    mainFrame.pack();
                    mainFrame.setVisible(true);
                    });
                }
                if(i==1){
                    catName1.setText(category);
                    image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card" + categoryId + ".jpg")));
                    viewButton1.addActionListener(e -> {
                     HomePanel hm = new HomePanel(categoryId);
                    mainFrame.setContentPane(hm);
                    mainFrame.pack();
                    mainFrame.setVisible(true);
                    });
                }
                if(i==2){
                    catName2.setText(category);
                    image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card" + categoryId + ".jpg")));
                    viewButton2.addActionListener(e -> {
                     HomePanel hm = new HomePanel(categoryId);
                    mainFrame.setContentPane(hm);
                    mainFrame.pack();
                    mainFrame.setVisible(true);
                    });
                }
                if(i==3){
                    catName3.setText(category);
                    image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card" + categoryId + ".jpg")));
                    viewButton3.addActionListener(e -> {
                     HomePanel hm = new HomePanel(categoryId);
                    mainFrame.setContentPane(hm);
                    mainFrame.pack();
                    mainFrame.setVisible(true);
                    });
                }
                if(i==4){
                    catName4.setText(category);
                    image4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card" + categoryId + ".jpg")));
                    viewButton4.addActionListener(e -> {
                     HomePanel hm = new HomePanel(categoryId);
                    mainFrame.setContentPane(hm);
                    mainFrame.pack();
                    mainFrame.setVisible(true);
                    });
                }
                if(i==5){
                    catName5.setText(category);
                    image5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card" + categoryId + ".jpg")));
                    viewButton5.addActionListener(e -> {
                     HomePanel hm = new HomePanel(categoryId);
                    mainFrame.setContentPane(hm);
                    mainFrame.pack();
                    mainFrame.setVisible(true);
                    });
                }
                if(i==6){
                    catName6.setText(category);
                    image6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card" + categoryId + ".jpg")));
                    viewButton6.addActionListener(e -> {
                     HomePanel hm = new HomePanel(categoryId);
                    mainFrame.setContentPane(hm);
                    mainFrame.pack();
                    mainFrame.setVisible(true);
                    });
                }
                if(i==7){
                    catName7.setText(category);
                    image7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card" + categoryId + ".jpg")));
                    viewButton7.addActionListener(e -> {
                     HomePanel hm = new HomePanel(categoryId);
                    mainFrame.setContentPane(hm);
                    mainFrame.pack();
                    mainFrame.setVisible(true);
                    });
                }
                if(i==8){
                    catName8.setText(category);
                    image8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card" + categoryId + ".jpg")));
                    viewButton8.addActionListener(e -> {
                     HomePanel hm = new HomePanel(categoryId);
                    mainFrame.setContentPane(hm);
                    mainFrame.pack();
                    mainFrame.setVisible(true);
                    });
                }
                
                
                i++;
            }
           
       } catch(SQLException e){
           
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

        catPanel0 = new javax.swing.JPanel();
        viewButton0 = new javax.swing.JButton();
        image0 = new javax.swing.JLabel();
        catName0 = new javax.swing.JLabel();
        catPanel1 = new javax.swing.JPanel();
        viewButton1 = new javax.swing.JButton();
        image1 = new javax.swing.JLabel();
        catName1 = new javax.swing.JLabel();
        catPanel2 = new javax.swing.JPanel();
        viewButton2 = new javax.swing.JButton();
        image2 = new javax.swing.JLabel();
        catName2 = new javax.swing.JLabel();
        catPanel3 = new javax.swing.JPanel();
        viewButton3 = new javax.swing.JButton();
        image3 = new javax.swing.JLabel();
        catName3 = new javax.swing.JLabel();
        catPanel4 = new javax.swing.JPanel();
        viewButton4 = new javax.swing.JButton();
        image4 = new javax.swing.JLabel();
        catName4 = new javax.swing.JLabel();
        catPanel5 = new javax.swing.JPanel();
        viewButton5 = new javax.swing.JButton();
        image5 = new javax.swing.JLabel();
        catName5 = new javax.swing.JLabel();
        catPanel6 = new javax.swing.JPanel();
        viewButton6 = new javax.swing.JButton();
        image6 = new javax.swing.JLabel();
        catName6 = new javax.swing.JLabel();
        catPanel7 = new javax.swing.JPanel();
        viewButton7 = new javax.swing.JButton();
        image7 = new javax.swing.JLabel();
        catName7 = new javax.swing.JLabel();
        catPanel8 = new javax.swing.JPanel();
        viewButton8 = new javax.swing.JButton();
        image8 = new javax.swing.JLabel();
        catName8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(878, 588));
        setMinimumSize(new java.awt.Dimension(878, 588));
        setPreferredSize(new java.awt.Dimension(878, 588));

        catPanel0.setBackground(new java.awt.Color(255, 255, 255));
        catPanel0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catPanel0.setMaximumSize(new java.awt.Dimension(238, 157));
        catPanel0.setMinimumSize(new java.awt.Dimension(238, 157));

        viewButton0.setBackground(new java.awt.Color(255, 51, 0));
        viewButton0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton0.setForeground(new java.awt.Color(255, 255, 255));
        viewButton0.setText("View Threads");

        image0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        catName0.setBackground(new java.awt.Color(255, 51, 0));
        catName0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catName0.setText("Programming");

        javax.swing.GroupLayout catPanel0Layout = new javax.swing.GroupLayout(catPanel0);
        catPanel0.setLayout(catPanel0Layout);
        catPanel0Layout.setHorizontalGroup(
            catPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanel0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanel0Layout.createSequentialGroup()
                        .addComponent(image0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(catPanel0Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(catName0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton0)
                        .addGap(18, 18, 18))))
        );
        catPanel0Layout.setVerticalGroup(
            catPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanel0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(catPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton0)
                    .addComponent(catName0))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        catPanel1.setBackground(new java.awt.Color(255, 255, 255));
        catPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catPanel1.setMaximumSize(new java.awt.Dimension(238, 157));
        catPanel1.setMinimumSize(new java.awt.Dimension(238, 157));

        viewButton1.setBackground(new java.awt.Color(255, 51, 0));
        viewButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton1.setForeground(new java.awt.Color(255, 255, 255));
        viewButton1.setText("View Threads");

        image1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        catName1.setBackground(new java.awt.Color(255, 51, 0));
        catName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catName1.setText("Programming");

        javax.swing.GroupLayout catPanel1Layout = new javax.swing.GroupLayout(catPanel1);
        catPanel1.setLayout(catPanel1Layout);
        catPanel1Layout.setHorizontalGroup(
            catPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanel1Layout.createSequentialGroup()
                        .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(catPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(catName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton1)
                        .addGap(18, 18, 18))))
        );
        catPanel1Layout.setVerticalGroup(
            catPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(catPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton1)
                    .addComponent(catName1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        catPanel2.setBackground(new java.awt.Color(255, 255, 255));
        catPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catPanel2.setMaximumSize(new java.awt.Dimension(238, 157));
        catPanel2.setMinimumSize(new java.awt.Dimension(238, 157));

        viewButton2.setBackground(new java.awt.Color(255, 51, 0));
        viewButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton2.setForeground(new java.awt.Color(255, 255, 255));
        viewButton2.setText("View Threads");

        image2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        catName2.setBackground(new java.awt.Color(255, 51, 0));
        catName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catName2.setText("Programming");

        javax.swing.GroupLayout catPanel2Layout = new javax.swing.GroupLayout(catPanel2);
        catPanel2.setLayout(catPanel2Layout);
        catPanel2Layout.setHorizontalGroup(
            catPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanel2Layout.createSequentialGroup()
                        .addComponent(image2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(catPanel2Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(catName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton2)
                        .addGap(18, 18, 18))))
        );
        catPanel2Layout.setVerticalGroup(
            catPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(catPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton2)
                    .addComponent(catName2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        catPanel3.setBackground(new java.awt.Color(255, 255, 255));
        catPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catPanel3.setMaximumSize(new java.awt.Dimension(238, 157));
        catPanel3.setMinimumSize(new java.awt.Dimension(238, 157));

        viewButton3.setBackground(new java.awt.Color(255, 51, 0));
        viewButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton3.setForeground(new java.awt.Color(255, 255, 255));
        viewButton3.setText("View Threads");

        image3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        catName3.setBackground(new java.awt.Color(255, 51, 0));
        catName3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catName3.setText("Programming");

        javax.swing.GroupLayout catPanel3Layout = new javax.swing.GroupLayout(catPanel3);
        catPanel3.setLayout(catPanel3Layout);
        catPanel3Layout.setHorizontalGroup(
            catPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanel3Layout.createSequentialGroup()
                        .addComponent(image3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(catPanel3Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(catName3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton3)
                        .addGap(18, 18, 18))))
        );
        catPanel3Layout.setVerticalGroup(
            catPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(catPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton3)
                    .addComponent(catName3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        catPanel4.setBackground(new java.awt.Color(255, 255, 255));
        catPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catPanel4.setMaximumSize(new java.awt.Dimension(238, 157));
        catPanel4.setMinimumSize(new java.awt.Dimension(238, 157));

        viewButton4.setBackground(new java.awt.Color(255, 51, 0));
        viewButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton4.setForeground(new java.awt.Color(255, 255, 255));
        viewButton4.setText("View Threads");

        image4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        catName4.setBackground(new java.awt.Color(255, 51, 0));
        catName4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catName4.setText("Programming");

        javax.swing.GroupLayout catPanel4Layout = new javax.swing.GroupLayout(catPanel4);
        catPanel4.setLayout(catPanel4Layout);
        catPanel4Layout.setHorizontalGroup(
            catPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanel4Layout.createSequentialGroup()
                        .addComponent(image4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(catPanel4Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(catName4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton4)
                        .addGap(18, 18, 18))))
        );
        catPanel4Layout.setVerticalGroup(
            catPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(catPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton4)
                    .addComponent(catName4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        catPanel5.setBackground(new java.awt.Color(255, 255, 255));
        catPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catPanel5.setMaximumSize(new java.awt.Dimension(238, 157));
        catPanel5.setMinimumSize(new java.awt.Dimension(238, 157));

        viewButton5.setBackground(new java.awt.Color(255, 51, 0));
        viewButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton5.setForeground(new java.awt.Color(255, 255, 255));
        viewButton5.setText("View Threads");

        image5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        catName5.setBackground(new java.awt.Color(255, 51, 0));
        catName5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catName5.setText("Programming");

        javax.swing.GroupLayout catPanel5Layout = new javax.swing.GroupLayout(catPanel5);
        catPanel5.setLayout(catPanel5Layout);
        catPanel5Layout.setHorizontalGroup(
            catPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanel5Layout.createSequentialGroup()
                        .addComponent(image5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(catPanel5Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(catName5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton5)
                        .addGap(18, 18, 18))))
        );
        catPanel5Layout.setVerticalGroup(
            catPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(catPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton5)
                    .addComponent(catName5))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        catPanel6.setBackground(new java.awt.Color(255, 255, 255));
        catPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catPanel6.setMaximumSize(new java.awt.Dimension(238, 157));
        catPanel6.setMinimumSize(new java.awt.Dimension(238, 157));

        viewButton6.setBackground(new java.awt.Color(255, 51, 0));
        viewButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton6.setForeground(new java.awt.Color(255, 255, 255));
        viewButton6.setText("View Threads");

        image6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        catName6.setBackground(new java.awt.Color(255, 51, 0));
        catName6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catName6.setText("Programming");

        javax.swing.GroupLayout catPanel6Layout = new javax.swing.GroupLayout(catPanel6);
        catPanel6.setLayout(catPanel6Layout);
        catPanel6Layout.setHorizontalGroup(
            catPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanel6Layout.createSequentialGroup()
                        .addComponent(image6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(catPanel6Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(catName6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton6)
                        .addGap(18, 18, 18))))
        );
        catPanel6Layout.setVerticalGroup(
            catPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(catPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton6)
                    .addComponent(catName6))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        catPanel7.setBackground(new java.awt.Color(255, 255, 255));
        catPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catPanel7.setMaximumSize(new java.awt.Dimension(238, 157));
        catPanel7.setMinimumSize(new java.awt.Dimension(238, 157));

        viewButton7.setBackground(new java.awt.Color(255, 51, 0));
        viewButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton7.setForeground(new java.awt.Color(255, 255, 255));
        viewButton7.setText("View Threads");

        image7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        catName7.setBackground(new java.awt.Color(255, 51, 0));
        catName7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catName7.setText("Programming");

        javax.swing.GroupLayout catPanel7Layout = new javax.swing.GroupLayout(catPanel7);
        catPanel7.setLayout(catPanel7Layout);
        catPanel7Layout.setHorizontalGroup(
            catPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanel7Layout.createSequentialGroup()
                        .addComponent(image7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(catPanel7Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(catName7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton7)
                        .addGap(18, 18, 18))))
        );
        catPanel7Layout.setVerticalGroup(
            catPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(catPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton7)
                    .addComponent(catName7))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        catPanel8.setBackground(new java.awt.Color(255, 255, 255));
        catPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        catPanel8.setMaximumSize(new java.awt.Dimension(238, 157));
        catPanel8.setMinimumSize(new java.awt.Dimension(238, 157));

        viewButton8.setBackground(new java.awt.Color(255, 51, 0));
        viewButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton8.setForeground(new java.awt.Color(255, 255, 255));
        viewButton8.setText("View Threads");

        image8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        catName8.setBackground(new java.awt.Color(255, 51, 0));
        catName8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catName8.setText("Programming");

        javax.swing.GroupLayout catPanel8Layout = new javax.swing.GroupLayout(catPanel8);
        catPanel8.setLayout(catPanel8Layout);
        catPanel8Layout.setHorizontalGroup(
            catPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catPanel8Layout.createSequentialGroup()
                        .addComponent(image8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(catPanel8Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(catName8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton8)
                        .addGap(18, 18, 18))))
        );
        catPanel8Layout.setVerticalGroup(
            catPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(catPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton8)
                    .addComponent(catName8))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(catPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(catPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(catPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(catPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(catPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(catPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(catPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(catPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(catPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(catPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(catPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(catPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(catPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(catPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(catPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(catPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel catName0;
    private javax.swing.JLabel catName1;
    private javax.swing.JLabel catName2;
    private javax.swing.JLabel catName3;
    private javax.swing.JLabel catName4;
    private javax.swing.JLabel catName5;
    private javax.swing.JLabel catName6;
    private javax.swing.JLabel catName7;
    private javax.swing.JLabel catName8;
    private javax.swing.JPanel catPanel0;
    private javax.swing.JPanel catPanel1;
    private javax.swing.JPanel catPanel2;
    private javax.swing.JPanel catPanel3;
    private javax.swing.JPanel catPanel4;
    private javax.swing.JPanel catPanel5;
    private javax.swing.JPanel catPanel6;
    private javax.swing.JPanel catPanel7;
    private javax.swing.JPanel catPanel8;
    private javax.swing.JLabel image0;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image4;
    private javax.swing.JLabel image5;
    private javax.swing.JLabel image6;
    private javax.swing.JLabel image7;
    private javax.swing.JLabel image8;
    private javax.swing.JButton viewButton0;
    private javax.swing.JButton viewButton1;
    private javax.swing.JButton viewButton2;
    private javax.swing.JButton viewButton3;
    private javax.swing.JButton viewButton4;
    private javax.swing.JButton viewButton5;
    private javax.swing.JButton viewButton6;
    private javax.swing.JButton viewButton7;
    private javax.swing.JButton viewButton8;
    // End of variables declaration//GEN-END:variables
}
