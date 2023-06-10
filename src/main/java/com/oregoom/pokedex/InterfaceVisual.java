package com.oregoom.pokedex;

import javax.swing.JOptionPane;

public class InterfaceVisual extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceVisual
     */
    public InterfaceVisual() {
        initComponents();
        this.setTitle("Información de tu Pokemon :)");
        this.setSize(803, 491);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        panelRound1 = new com.oregoom.pokedex.PanelRound();
        imagen_p = new javax.swing.JLabel();
        panelRound2 = new com.oregoom.pokedex.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        lb_peso = new javax.swing.JLabel();
        lb_nom = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_id1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_altura = new javax.swing.JLabel();
        panelRound3 = new com.oregoom.pokedex.PanelRound();
        panelRound4 = new com.oregoom.pokedex.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        panelRound5 = new com.oregoom.pokedex.PanelRound();
        panelRound6 = new com.oregoom.pokedex.PanelRound();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setBackground(new java.awt.Color(204, 0, 0));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(0, 0, 0));
        panelRound1.setRoundBottomLeft(90);
        panelRound1.setRoundBottomRight(90);
        panelRound1.setRoundTopLeft(90);
        panelRound1.setRoundTopRight(90);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRound1.add(imagen_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 260));

        panelRound2.setRoundBottomLeft(100);
        panelRound2.setRoundBottomRight(100);
        panelRound2.setRoundTopLeft(100);
        panelRound2.setRoundTopRight(100);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Nombre:");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lb_peso.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        lb_peso.setForeground(new java.awt.Color(0, 0, 204));
        lb_peso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRound2.add(lb_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 280, 32));

        lb_nom.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        lb_nom.setForeground(new java.awt.Color(0, 0, 204));
        lb_nom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRound2.add(lb_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 280, 30));

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("ID:");
        panelRound2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lb_id1.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        lb_id1.setForeground(new java.awt.Color(0, 0, 204));
        lb_id1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRound2.add(lb_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 280, 40));

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Altura:");
        panelRound2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Peso:");
        panelRound2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lb_altura.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        lb_altura.setForeground(new java.awt.Color(0, 0, 204));
        lb_altura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRound2.add(lb_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 280, 32));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 430, 230));

        principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 38, 717, 300));

        panelRound3.setBackground(new java.awt.Color(0, 0, 255));
        panelRound3.setRoundBottomLeft(100);
        panelRound3.setRoundBottomRight(100);
        panelRound3.setRoundTopLeft(100);
        panelRound3.setRoundTopRight(100);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        principal.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 100, 100));

        panelRound4.setBackground(new java.awt.Color(255, 255, 153));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Regresar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        principal.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 370, 60));

        panelRound5.setBackground(new java.awt.Color(0, 0, 255));
        panelRound5.setRoundBottomLeft(100);
        panelRound5.setRoundBottomRight(100);
        panelRound5.setRoundTopLeft(100);
        panelRound5.setRoundTopRight(100);

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        principal.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        panelRound6.setBackground(new java.awt.Color(255, 255, 0));
        panelRound6.setRoundBottomRight(30);
        panelRound6.setRoundTopRight(30);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("POKEDEX");

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        principal.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new PokedexBuscar().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel imagen_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lb_altura;
    private javax.swing.JLabel lb_id1;
    private javax.swing.JLabel lb_nom;
    private javax.swing.JLabel lb_peso;
    private com.oregoom.pokedex.PanelRound panelRound1;
    private com.oregoom.pokedex.PanelRound panelRound2;
    private com.oregoom.pokedex.PanelRound panelRound3;
    private com.oregoom.pokedex.PanelRound panelRound4;
    private com.oregoom.pokedex.PanelRound panelRound5;
    private com.oregoom.pokedex.PanelRound panelRound6;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
    public void mostrarInfo(String nom, String peso, String id, int altura) {
        lb_nom.setText(nom);
        lb_id1.setText(id);
        double pesos_ = (Double.parseDouble(peso)) / 10;
        lb_peso.setText(pesos_ + " Kg");
        double altura_ = (double) altura;
        altura_ = altura_ / 10;
        lb_altura.setText(altura_ + "m");
    }
    
   
}
