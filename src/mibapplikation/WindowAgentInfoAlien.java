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
public class WindowAgentInfoAlien extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form WindowAlienChangePw
     */
    public WindowAgentInfoAlien(InfDB idb) {
        initComponents();
        
        this.idb = idb;
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
        lblTitle = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtfAlienName = new javax.swing.JTextField();
        lblAlienName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaPrintAlienInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Se info om Alien");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 96, 96));
        lblMessage.setText(" ");

        btnSave.setText("VISA INFO");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnMenu.setText("MENY");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        txtfAlienName.setColumns(6);

        lblAlienName.setForeground(new java.awt.Color(255, 255, 255));
        lblAlienName.setText("Ange aliens namn:");

        jScrollPane1.setRequestFocusEnabled(false);

        txtaPrintAlienInfo.setBackground(new java.awt.Color(79, 79, 79));
        txtaPrintAlienInfo.setColumns(20);
        txtaPrintAlienInfo.setForeground(new java.awt.Color(255, 255, 255));
        txtaPrintAlienInfo.setRows(5);
        txtaPrintAlienInfo.setEnabled(false);
        jScrollPane1.setViewportView(txtaPrintAlienInfo);

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblAlienName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtfAlienName, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(38, 38, 38)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfAlienName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlienName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addGap(10, 10, 10)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        txtaPrintAlienInfo.setText("");
        lblMessage.setText(" ");
        try{
            
//            "SELECT alien_id, al.namn, al.telefon, registreringsdatum, benamning, ag.namn\n" +
//            "FROM alien al\n" +
//            "JOIN plats p ON al.plats = p.plats_id\n" +
//            "JOIN agent ag ON al.ansvarig_agent = ag.agent_id\n" 
//            "WHERE al.namn = '" + txtfAlienName.getText() + "'";

            String qAlien = 
                    "SELECT alien_id, namn, telefon, registreringsdatum, benamning\n" +
                    "FROM alien al\n" +
                    "JOIN plats p ON al.plats = p.plats_id\n" +
                    "WHERE namn = '" + txtfAlienName.getText() + "'";
            String qAgent = 
                    "SELECT ag.namn\n" +
                    "FROM alien al\n" +
                    "JOIN agent ag ON al.ansvarig_agent = ag.agent_id\n" +
                    "WHERE al.namn = '" + txtfAlienName.getText() + "'";
                    
            HashMap<String,String> resultAlien = idb.fetchRow(qAlien);
            HashMap<String,String> resultAgent = idb.fetchRow(qAgent);
            
            if(resultAlien.get("namn") == null){
                lblMessage.setText("Alien namet finns inte registrerat");
            }
            else{
                txtaPrintAlienInfo.setText("Alien ID:\t" + resultAlien.get("alien_id") + "\n" +
                                           "Namn:\t" + resultAlien.get("namn") + "\n" +
                                           "Telefon:\t" + resultAlien.get("telefon") + "\n" +
                                           "Registrerad:\t" + resultAlien.get("registreringsdatum") + "\n" +
                                           "Befinner sig:\t" + resultAlien.get("benamning") + "\n" +
                                           "Kontakt:\t" + resultAgent.get("namn") + "\n");
            }
        }

        catch (InfException ex){
            System.out.println("Databasfel" + ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Random fel" + ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //dispose();
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlienName;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtaPrintAlienInfo;
    private javax.swing.JTextField txtfAlienName;
    // End of variables declaration//GEN-END:variables
}
