/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent_and_Admin;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import oru.inf.InfDB;



/**
 *
 * @author Blazl
 */
public class JfListAliens extends javax.swing.JFrame {
    
    private InfDB idb;
//    private JPanel panelMain;
    private JpListAlienDates datesWindow;
    private JpListAlienLocation locationWindow;
    private JpListAlienRace raceWindow;
    
    /**
     * Creates new form WindowAgentListAliens
     */
    public JfListAliens(InfDB idb) {
//        setLayout(null);
//        setPreferredSize(new Dimension(420,90));
//        setResizable(false);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        panelMain = new JPanel();
//        panelMain.setBackground(Color.WHITE);
//        panelMain.setBounds(0, 0, 1000, 500);
//        panelMain.setPreferredSize(new Dimension(1000,500));
//        add(panelMain);
        initComponents();
        setListNames();
        createDatesWindow(idb);
        createLocationWindow(idb);
        createRaceWindow(idb);
        
        
        
        
    }
    
    private void setListNames(){
        
         ArrayList<String> list = new ArrayList<String>();
        list.add("Plats");
        list.add("Ras");
        list.add("Tidsperiod");
        

        for (String element : list) {
            cbLists.addItem(element);
        }
    
    }
    
    private void createDatesWindow(InfDB idb){
        
        
        datesWindow = new JpListAlienDates(idb);
        datesWindow.setBounds(300, 0, 360, 420);
        jpBackground.add(datesWindow);
        datesWindow.setVisible(false);
        
    }
    
    private void createRaceWindow(InfDB idb){
        
        
        raceWindow = new JpListAlienRace(idb);
        raceWindow.setBounds(280, 7, 360, 420);
        jpBackground.add(raceWindow);
        raceWindow.setVisible(false);
        
    }
    
    private void createLocationWindow(InfDB idb){
        
        
        locationWindow = new JpListAlienLocation(idb);
        locationWindow.setBounds(280, 7, 360, 420);
        jpBackground.add(locationWindow);
        locationWindow.setVisible(false);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new javax.swing.JPanel();
        jpLeftSide = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        lblLists = new javax.swing.JLabel();
        cbLists = new javax.swing.JComboBox<>();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icons/astronomy.png")).getImage());
        setResizable(false);

        jpBackground.setBackground(new java.awt.Color(40, 40, 40));

        jpLeftSide.setBackground(new java.awt.Color(40, 40, 40));

        btnMenu.setText("MENY");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblLists.setForeground(new java.awt.Color(255, 255, 255));
        lblLists.setText("Välj lista:");

        cbLists.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));
        cbLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListsActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Listor för aliens");

        javax.swing.GroupLayout jpLeftSideLayout = new javax.swing.GroupLayout(jpLeftSide);
        jpLeftSide.setLayout(jpLeftSideLayout);
        jpLeftSideLayout.setHorizontalGroup(
            jpLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftSideLayout.createSequentialGroup()
                .addGroup(jpLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLeftSideLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnMenu))
                    .addGroup(jpLeftSideLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpLeftSideLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblLists)
                        .addGap(18, 18, 18)
                        .addComponent(cbLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpLeftSideLayout.setVerticalGroup(
            jpLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeftSideLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jpLeftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLists)
                    .addComponent(cbLists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addComponent(jpLeftSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 360, Short.MAX_VALUE))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLeftSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void cbListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListsActionPerformed
        // TODO add your handling code here:
        switch (cbLists.getSelectedItem().toString()) {
                    case "Plats":
                        datesWindow.setVisible(false);
                        raceWindow.setVisible(false);
                        locationWindow.setVisible(true);
                        break;
                    case "Ras":
                        datesWindow.setVisible(false);
                        locationWindow.setVisible(false);
                        raceWindow.setVisible(true);
                        break;
                    case "Tidsperiod":
                        locationWindow.setVisible(false);
                        raceWindow.setVisible(false);
                        datesWindow.setVisible(true);
                        break;
                }
        
    }//GEN-LAST:event_cbListsActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cbLists;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpLeftSide;
    private javax.swing.JLabel lblLists;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
