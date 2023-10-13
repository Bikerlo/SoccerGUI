/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import static com.mycompany.soccergui.dashboard.showJPanel;

public class players extends javax.swing.JPanel {

    /**
     * Creates new form players
     */
    public players() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgorund = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlayers = new javax.swing.JTable();
        saearchFieldPlayer = new javax.swing.JTextField();
        deletePlayer = new javax.swing.JButton();
        searchPlayer = new javax.swing.JButton();
        updatePlayer = new javax.swing.JButton();
        createPlayer = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(571, 440));

        backgorund.setBackground(new java.awt.Color(255, 255, 255));
        backgorund.setPreferredSize(new java.awt.Dimension(571, 440));

        tablePlayers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablePlayers);

        saearchFieldPlayer.setBackground(new java.awt.Color(255, 255, 255));
        saearchFieldPlayer.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        saearchFieldPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        saearchFieldPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        deletePlayer.setBackground(new java.awt.Color(255, 0, 0));
        deletePlayer.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        deletePlayer.setForeground(new java.awt.Color(255, 255, 255));
        deletePlayer.setText("Borrar");
        deletePlayer.setBorder(new javax.swing.border.MatteBorder(null));
        deletePlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlayerActionPerformed(evt);
            }
        });

        searchPlayer.setBackground(new java.awt.Color(255, 0, 0));
        searchPlayer.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        searchPlayer.setForeground(new java.awt.Color(255, 255, 255));
        searchPlayer.setText("Buscar");
        searchPlayer.setBorder(new javax.swing.border.MatteBorder(null));
        searchPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPlayerActionPerformed(evt);
            }
        });

        updatePlayer.setBackground(new java.awt.Color(255, 0, 0));
        updatePlayer.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        updatePlayer.setForeground(new java.awt.Color(255, 255, 255));
        updatePlayer.setText("Actualizar");
        updatePlayer.setBorder(new javax.swing.border.MatteBorder(null));
        updatePlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePlayerActionPerformed(evt);
            }
        });

        createPlayer.setBackground(new java.awt.Color(255, 0, 0));
        createPlayer.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        createPlayer.setForeground(new java.awt.Color(255, 255, 255));
        createPlayer.setText("Crear");
        createPlayer.setBorder(new javax.swing.border.MatteBorder(null));
        createPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgorundLayout = new javax.swing.GroupLayout(backgorund);
        backgorund.setLayout(backgorundLayout);
        backgorundLayout.setHorizontalGroup(
            backgorundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgorundLayout.createSequentialGroup()
                .addGroup(backgorundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgorundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgorundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(saearchFieldPlayer)
                        .addGap(18, 18, 18)
                        .addComponent(searchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
        backgorundLayout.setVerticalGroup(
            backgorundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgorundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(backgorundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saearchFieldPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(backgorundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgorund, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgorund, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deletePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletePlayerActionPerformed

    private void searchPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchPlayerActionPerformed

    private void updatePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePlayerActionPerformed

    private void createPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlayerActionPerformed
        // TODO add your handling code here:
        showJPanel(new playersForm());
    }//GEN-LAST:event_createPlayerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgorund;
    private javax.swing.JButton createPlayer;
    private javax.swing.JButton deletePlayer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField saearchFieldPlayer;
    private javax.swing.JButton searchPlayer;
    private javax.swing.JTable tablePlayers;
    private javax.swing.JButton updatePlayer;
    // End of variables declaration//GEN-END:variables
}