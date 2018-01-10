/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ProductDAO;

/**
 *
 * @author lixi3350
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    private ProductDAO dao;
    
    public Menu(ProductDAO dao) {
        initComponents();
        this.dao=dao;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTietle = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTietle.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelTietle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTietle.setText("Product    Administration");

        Add.setText("Add a New Product");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        View.setText("View Products");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(View, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabelTietle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelTietle, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(View, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
    // create the dialog instance
    Editor dialog = new Editor(this, true,dao);

    dialog.setLocationRelativeTo(this);

    dialog.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
    // create the dialog instance
    Report view = new Report(this, true, dao);

    view.setLocationRelativeTo(this);

    view.setVisible(true);       

// TODO add your handling code here:
    }//GEN-LAST:event_ViewActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);

// TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Exit;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabelTietle;
    // End of variables declaration//GEN-END:variables
}
