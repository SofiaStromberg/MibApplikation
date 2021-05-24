/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibapplikation;

import java.awt.Color;
import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author strom
 */
public class WindowAdminUpdateAlienInfo extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form WindowAlienChangePw
     */
    public WindowAdminUpdateAlienInfo(InfDB idb) {
        initComponents();
        this.idb = idb;
        hideText();

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
        lblTitel = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lblAlien = new javax.swing.JLabel();
        txtfPhoneInput = new javax.swing.JTextField();
        lblAlienName1 = new javax.swing.JLabel();
        lblAlienPhone = new javax.swing.JLabel();
        lblAlienRace = new javax.swing.JLabel();
        cbListRace = new javax.swing.JComboBox<>();
        txtfNameInput = new javax.swing.JTextField();
        txtfAlienInput = new javax.swing.JTextField();
        lblMessageInput = new javax.swing.JLabel();
        txtfRaceSpecial = new javax.swing.JTextField();
        lblRaceSpecial = new javax.swing.JLabel();
        lblPw = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblAgent = new javax.swing.JLabel();
        txtfLocationInput = new javax.swing.JTextField();
        cbListAgents = new javax.swing.JComboBox<>();
        txtfPwInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        lblTitel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitel.setForeground(new java.awt.Color(255, 255, 255));
        lblTitel.setText("Ändra information om en alien");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 96, 96));
        lblMessage.setText(" ");

        btnSave.setText("Spara ändringar");
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

        lblAlien.setForeground(new java.awt.Color(255, 255, 255));
        lblAlien.setText("Ange aliens namn eller id:");

        txtfPhoneInput.setColumns(6);

        lblAlienName1.setForeground(new java.awt.Color(255, 255, 255));
        lblAlienName1.setText("Uppdatera namn:");

        lblAlienPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblAlienPhone.setText("Uppdatera telefonnummer:");

        lblAlienRace.setForeground(new java.awt.Color(255, 255, 255));
        lblAlienRace.setText("Uppdatera rastillhörighet:");

        cbListRace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Boglodite", "Squid", "Worm", "<Oidentifierad>" }));
        cbListRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListRaceActionPerformed(evt);
            }
        });

        txtfNameInput.setColumns(6);

        txtfAlienInput.setColumns(6);

        lblMessageInput.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessageInput.setForeground(new java.awt.Color(255, 96, 96));
        lblMessageInput.setText(" ");

        lblRaceSpecial.setForeground(new java.awt.Color(255, 255, 255));
        lblRaceSpecial.setText("xxxx");

        lblPw.setForeground(new java.awt.Color(255, 255, 255));
        lblPw.setText("Uppdatera lösenord: ");

        lblLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation.setText("Uppdatera plats:");

        lblAgent.setForeground(new java.awt.Color(255, 255, 255));
        lblAgent.setText("Uppdatera ansvarig agent:");

        txtfLocationInput.setColumns(6);

        cbListAgents.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));

        txtfPwInput.setColumns(6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfRaceSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblMessageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAlienPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(lblPw, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                    .addComponent(lblAlienName1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtfAlienInput, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(txtfNameInput)
                                            .addComponent(txtfPhoneInput)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtfLocationInput, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(txtfPwInput)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblRaceSpecial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAlienRace, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAgent)
                                    .addComponent(btnMenu))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbListAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbListRace, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfAlienInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessageInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlienName1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfPhoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlienPhone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPw)
                    .addComponent(txtfPwInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfLocationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgent)
                    .addComponent(cbListAgents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienRace, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbListRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaceSpecial)
                    .addComponent(txtfRaceSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hideText() {
        lblRaceSpecial.setVisible(false);
        txtfRaceSpecial.setVisible(false);
    }

    private void showText() {
        lblRaceSpecial.setVisible(true);
        txtfRaceSpecial.setVisible(true);
    }

    private void correctValues() {

        lblMessage.setForeground(Color.GREEN);
        lblMessage.setText("Dina ändringar är sparade");

    }

    private void setAlienName(String alienId) {

        try {
            if (Validation.validationTxtNrOfChar(txtfNameInput, lblMessage)) {
                String qName = "UPDATE alien SET namn = '" + txtfNameInput.getText() + "' WHERE alien_id = '" + alienId + "'";
                idb.update(qName);
                correctValues();
            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
    }

    private void setPhone(String alienId) {
        try {
            if (Validation.validationTxtPhone(txtfPhoneInput, lblMessage)) {
                String qPhone = "UPDATE alien SET telefon = '" + txtfPhoneInput.getText() + "' WHERE alien_id = '" + alienId + "'";
                idb.update(qPhone);
                correctValues();
            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }

    }

    private void setPassword(String aliendId) {
//        try {
//            if(Validation.validationTxtNrOfCharPw(txtfNameInput, lblMessage))
//        } catch (InfException ex) {
//            System.out.println("Databasfel" + ex.getMessage());
//        } catch (Exception ex) {
//            System.out.println("Random fel" + ex.getMessage());
//        }
    }

    private void setLocation(String alienId) {
//        try {
//
//        } catch (InfException ex) {
//            System.out.println("Databasfel" + ex.getMessage());
//        } catch (Exception ex) {
//            System.out.println("Random fel" + ex.getMessage());
//        }
    }

    private void setAgent(String aliendId) {
//        try {
//
//        } catch (InfException ex) {
//            System.out.println("Databasfel" + ex.getMessage());
//        } catch (Exception ex) {
//            System.out.println("Random fel" + ex.getMessage());
//        }
    }

    private void setBoglodite(String alienId) {

        String currentRace = ValidationRace.getRace(idb, alienId);
        try {
            showText();
            lblRaceSpecial.setText("Ange antal boogies: ");
            if (txtfRaceSpecial.getText().isEmpty()) {
                lblMessage.setText("Rutan för ras-specialitet är tom");
//  
            } else {
                if (currentRace != "") {
                    String qDelete = "DELETE FROM " + currentRace + " WHERE alien_id = '" + alienId + "'";
                    idb.delete(qDelete);
                }
                if (Validation.validationNumbers(txtfRaceSpecial, lblMessage, "Antal boogies måste anges i siffror")) {
                    String qBoglodite = "INSERT INTO Boglodite VALUES (" + alienId + "," + txtfRaceSpecial.getText() + ")";
                    idb.insert(qBoglodite);
                    correctValues();
                }
            }

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
    }

    private void setSquid(String alienId) {
        String currentRace = ValidationRace.getRace(idb, alienId);
        try {

            showText();
            lblRaceSpecial.setText("Ange antal armar:");
            if (txtfRaceSpecial.getText().isEmpty()) {
                lblMessage.setText("Rutan för ras-specialitet är tom");

            } else {
                if (currentRace != "") {
                    String qDelete = "DELETE FROM " + currentRace + " WHERE alien_id = '" + alienId + "'";
                    idb.delete(qDelete);
                }
                if (Validation.validationNumbers(txtfRaceSpecial, lblMessage, "Antal armar måste anges i siffror")) {
                    String qSquid = "INSERT INTO Squid VALUES (" + alienId + "," + txtfRaceSpecial.getText() + ")";
                    idb.insert(qSquid);
                    correctValues();
                }
            }

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
    }

    private void setWorm(String alienId) {
        String currentRace = ValidationRace.getRace(idb, alienId);
        try {

            if (currentRace != "") {
                String qDelete = "DELETE FROM " + currentRace + " WHERE alien_id = '" + alienId + "'";
                idb.delete(qDelete);
            }
            String qWorm = "INSERT INTO Worm VALUES (" + alienId + ")";
            idb.insert(qWorm);
            correctValues();

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
    }

    private void setUnidentified(String alienId) {
        String currentRace = ValidationRace.getRace(idb, alienId);
        try {
            if (currentRace != "") {
                String qDelete = "DELETE FROM " + currentRace + " WHERE alien_id = '" + alienId + "'";
                idb.delete(qDelete);
                correctValues();
            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }

    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        lblMessageInput.setText("");
        lblMessage.setText("");
        lblMessage.setForeground(Color.RED);
        int loops = 0;

        if (Validation.validationTxt(txtfAlienInput, lblMessage)) {
            if (Validation.validationTxtAndCb(txtfNameInput, txtfPhoneInput, cbListRace, lblMessage)) {
//                    && Validation.validationTxtAndCb(txtfPwInput, txtfLocationInput, cbListAgents, lblMessage)) 

                try {
                    String qAlienId = "SELECT alien_id FROM alien WHERE namn = '" + txtfAlienInput.getText() + "' OR alien_id = '" + txtfAlienInput.getText() + "'";
                    ArrayList<String> alienIdList = idb.fetchColumn(qAlienId);
                    String alienId = idb.fetchSingle(qAlienId);

                    for (String element : alienIdList) {
                        loops++;
                    }

                    if (loops > 1) {
                        lblMessageInput.setText("Det finns mer än en alien med detta namn, var vänligen ange ID");

                    } else if (alienId == null) {
                        lblMessage.setText("Alien namnet finns inte registrerat");

                    } else {

                        if (!txtfNameInput.getText().isEmpty()) {
                            setAlienName(alienId);
                        }
                        if (!txtfPhoneInput.getText().isEmpty()) {
                            setPhone(alienId);
                        }
                        if (!txtfPwInput.getText().isEmpty()) {

                        }
                        if (!txtfLocationInput.getText().isEmpty()) {

                        }
                        if (!cbListAgents.getSelectedItem().equals("-----")) {

                        }
                        if (!cbListRace.getSelectedItem().equals("-----")) {

                            String currentRace = ValidationRace.getRace(idb, alienId);

                            if (currentRace.equals(cbListRace.getSelectedItem())) {
                                lblMessage.setText("Alien är redan registrerad som den här rasen.");
                            } else {

                                if (cbListRace.getSelectedItem().equals("Boglodite")) {
                                    setBoglodite(alienId);
                                } else if (cbListRace.getSelectedItem().equals("Squid")) {
                                    setSquid(alienId);
                                } else if (cbListRace.getSelectedItem().equals("Worm")) {
                                    setWorm(alienId);
                                } else if (cbListRace.getSelectedItem().equals("<Oidentifierad>")) {
                                    setUnidentified(alienId);
                                }
                            }
                        }
                    }

                } catch (InfException ex) {
                    System.out.println("Databasfel" + ex.getMessage());
                } catch (Exception ex) {
                    System.out.println("Random fel" + ex.getMessage());
                }
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed


    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void cbListRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListRaceActionPerformed
        if (cbListRace.getSelectedItem().equals("Squid")) {
            showText();
            lblRaceSpecial.setText("Ange antal armar:");
        } else if (cbListRace.getSelectedItem().equals("Boglodite")) {
            showText();
            lblRaceSpecial.setText("Ange antal boogies:");
        } else {
            hideText();
        }


    }//GEN-LAST:event_cbListRaceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbListAgents;
    private javax.swing.JComboBox<String> cbListRace;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAlien;
    private javax.swing.JLabel lblAlienName1;
    private javax.swing.JLabel lblAlienPhone;
    private javax.swing.JLabel lblAlienRace;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessageInput;
    private javax.swing.JLabel lblPw;
    private javax.swing.JLabel lblRaceSpecial;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JTextField txtfAlienInput;
    private javax.swing.JTextField txtfLocationInput;
    private javax.swing.JTextField txtfNameInput;
    private javax.swing.JTextField txtfPhoneInput;
    private javax.swing.JTextField txtfPwInput;
    private javax.swing.JTextField txtfRaceSpecial;
    // End of variables declaration//GEN-END:variables
}
