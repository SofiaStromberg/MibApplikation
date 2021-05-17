/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibapplikation;

import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author strom
 */
public class WindowAlienOmradeschef extends javax.swing.JFrame {

    private InfDB idb;
    private String alienId;


    /**
     * Creates new form WindowAlienChangePw
     */
    public WindowAlienOmradeschef(InfDB idb, String alienId) {
        initComponents();
        this.idb = idb;
        this.alienId = alienId;
        getAreaChief();
              
    }
    private void getAreaChief() {
        try {
            String query
                    = "SELECT ag.Namn, ag.Telefon, o.Benamning\n"
                    + "FROM alien al\n"
                    + "JOIN plats p ON al.plats = p.plats_id\n"
                    + "JOIN omrade o ON p.finns_i = o.omrades_id\n"
                    + "JOIN omradeschef oc ON o.Omrades_ID = oc.Omrade\n"
                    + "JOIN agent ag ON oc.Agent_ID = ag.Agent_ID\n"
                    + "WHERE Alien_ID = " + "'" + alienId + "'";
            HashMap<String, String> result = idb.fetchRow(query);
            String agentName = result.get("Namn");
            String agentPhone = result.get("Telefon");
            String areaName = result.get("Benamning");

            lblAgentName.setText("Namn: " + agentName);
            lblAgentPhone.setText("Telefon: " + agentPhone);
            lblAreaName.setText(areaName);
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        lblAreaName = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        lblAgentName = new javax.swing.JLabel();
        lblAgentPhone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        lblAreaName.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblAreaName.setForeground(new java.awt.Color(255, 255, 255));
        lblAreaName.setText("Svealand");

        btnMenu.setText("MENY");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblAgentName.setForeground(new java.awt.Color(255, 255, 255));
        lblAgentName.setText("Namn: ");

        lblAgentPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblAgentPhone.setText("Telefon:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAgentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblAgentName)
                .addGap(18, 18, 18)
                .addComponent(lblAgentPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //dispose();
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JLabel lblAgentPhone;
    private javax.swing.JLabel lblAreaName;
    // End of variables declaration//GEN-END:variables
}
