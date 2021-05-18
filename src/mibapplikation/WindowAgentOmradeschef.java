/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibapplikation;

import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author strom
 */
public class WindowAgentOmradeschef extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form WindowAlienChangePw
     */
    public WindowAgentOmradeschef(InfDB idb) {
        initComponents();
        this.idb = idb;
        listAreas();

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
        lblName = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        cbListAreas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowAreaChief = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Visa områdeschef");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 96, 96));
        lblMessage.setText(" ");

        btnSave.setText("Visa områdeschef");
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

        txtShowAreaChief.setColumns(20);
        txtShowAreaChief.setRows(5);
        txtShowAreaChief.setAutoscrolls(false);
        jScrollPane1.setViewportView(txtShowAreaChief);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(cbListAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(cbListAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addGap(1, 1, 1)
                .addComponent(lblMessage)
                .addContainerGap())
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

    public void listAreas() {

        try {
            String query = "Select benamning from omrade";
            ArrayList<String> result = idb.fetchColumn(query);

            for (String element : result) {
                cbListAreas.addItem(element);

            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }

    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Object currentArea = cbListAreas.getSelectedItem();
        String area = String.valueOf(currentArea);

        try {
            String query = "SELECT namn FROM Agent \n"
                    + "JOIN omradeschef oc USING (Agent_ID) \n"
                    + "JOIN Omrade o ON oc.Omrade = o.Omrades_ID \n"
                    + "WHERE o.Benamning = " + "'" + area + "'";

            String areaChief = idb.fetchSingle(query);
            txtShowAreaChief.setText("Det är " + areaChief + " som är områdeschef \n"
                    + "för området: " + area);

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
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
    private javax.swing.JComboBox<String> cbListAreas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextArea txtShowAreaChief;
    // End of variables declaration//GEN-END:variables
}
