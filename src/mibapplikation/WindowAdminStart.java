/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibapplikation;

import oru.inf.InfDB;

/**
 *
 * @author Blazl
 */
public class WindowAdminStart extends javax.swing.JFrame {
    
    private  InfDB idb;
    private  String agentId;
    private  String username;

    /**
     * Creates new form MainWindow
     */
    public WindowAdminStart(InfDB idb, String agentId, String username) {
        initComponents();
        this.idb= idb;
        this.agentId = agentId;
        this.username = username; 
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btn13 = new javax.swing.JButton();
        btnChangeAreaChief = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btnAdminStatus = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btnChangeHeadChief = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        lblAgentName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(40, 40, 40));

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn1.setText("Utrustning");

        lblMenu.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setText("Meny");

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn2.setText("Sök omradeschef");

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn3.setText("Registrera alien");

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn4.setText("Ändra info om alien");

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn5.setText("Se info om alien");

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn6.setText("Logga ut");

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn7.setText("Byt lösenord");

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn8.setText("Lista aliens på plats");

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn9.setText("Lista aliens på ras");

        btn10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn10.setText("Lista alien registrering");

        btn11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn11.setText("jButton1");

        btn12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn12.setText("jButton1");

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Välkommen Admin");

        btn13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn13.setText("Ta bort utrustning");

        btnChangeAreaChief.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChangeAreaChief.setText("Ändra områdeschef");
        btnChangeAreaChief.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeAreaChiefActionPerformed(evt);
            }
        });

        btn15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn15.setText("Ta bort alien");

        btnAdminStatus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAdminStatus.setText("Ändra admin status");
        btnAdminStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminStatusActionPerformed(evt);
            }
        });

        btn17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn17.setText("Ändra info om agent");

        btn18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn18.setText("Ta bort agent");

        btnChangeHeadChief.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChangeHeadChief.setText("Ändra kontorschef");
        btnChangeHeadChief.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeHeadChiefActionPerformed(evt);
            }
        });

        btn20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn20.setText("jButton1");

        btn21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn21.setText("Registera agent");

        btn22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn22.setText("jButton1");

        lblAgentName.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblAgentName.setForeground(new java.awt.Color(255, 255, 255));
        lblAgentName.setText("Agent J!");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChangeAreaChief, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChangeHeadChief, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3)
                    .addComponent(btn21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(btnAdminStatus))
                .addGap(12, 12, 12)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn15)
                    .addComponent(btnChangeAreaChief))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(btnChangeHeadChief)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn20))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn12)))
                .addGap(67, 67, 67)
                .addComponent(btn7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn6)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeAreaChiefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeAreaChiefActionPerformed
        new WindowAgentChangeAreaChief(idb).setVisible(true);
    }//GEN-LAST:event_btnChangeAreaChiefActionPerformed

    private void btnAdminStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminStatusActionPerformed
        // TODO add your handling code here:
        new WindowAdminChangeAdminStatus(idb).setVisible(true);
    }//GEN-LAST:event_btnAdminStatusActionPerformed

    private void btnChangeHeadChiefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeHeadChiefActionPerformed
        new WindowAgentChangeHeadChief(idb).setVisible(true);
    }//GEN-LAST:event_btnChangeHeadChiefActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdminStatus;
    private javax.swing.JButton btnChangeAreaChief;
    private javax.swing.JButton btnChangeHeadChief;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
