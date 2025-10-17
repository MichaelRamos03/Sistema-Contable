/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Michael Ramos;
 */
public class Login extends javax.swing.JFrame {

    int xMause, yMause;

    public Login() {
        initComponents();
        
        //Maximiza a toda la pantalla
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        FondoNegro = new javax.swing.JPanel();
        Bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbContraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tfContraseña = new javax.swing.JPasswordField();
        Header = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        lbX = new javax.swing.JLabel();
        btnSesion = new javax.swing.JPanel();
        lbIniciarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        FondoNegro.setBackground(new java.awt.Color(153, 0, 255));
        FondoNegro.setLayout(new java.awt.GridBagLayout());

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INICIAR SESIÓN");
        Bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 190, 40));

        lbUsuario.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lbUsuario.setText("USUARIO:");
        Bg.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        tfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        tfUsuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(204, 204, 204));
        tfUsuario.setText("Ingrese su usuario");
        tfUsuario.setBorder(null);
        tfUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfUsuarioMousePressed(evt);
            }
        });
        Bg.add(tfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 420, 40));
        Bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 420, 10));

        lbContraseña.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lbContraseña.setText("CONTRASEÑA:");
        Bg.add(lbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));
        Bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 420, 10));

        tfContraseña.setBackground(new java.awt.Color(255, 255, 255));
        tfContraseña.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tfContraseña.setForeground(new java.awt.Color(204, 204, 204));
        tfContraseña.setText("* * * * * * * *");
        tfContraseña.setBorder(null);
        tfContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfContraseñaMousePressed(evt);
            }
        });
        Bg.add(tfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 420, 40));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setForeground(new java.awt.Color(255, 255, 255));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));

        lbX.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbX.setForeground(new java.awt.Color(255, 51, 51));
        lbX.setText("     X");
        lbX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbX, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbX, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1058, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        Bg.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 60));

        btnSesion.setBackground(new java.awt.Color(153, 0, 255));
        btnSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbIniciarSesion.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lbIniciarSesion.setText("   INICIAR SESIÓN");
        lbIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbIniciarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSesionLayout = new javax.swing.GroupLayout(btnSesion);
        btnSesion.setLayout(btnSesionLayout);
        btnSesionLayout.setHorizontalGroup(
            btnSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnSesionLayout.setVerticalGroup(
            btnSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        Bg.add(btnSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 170, 70));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        FondoNegro.add(Bg, gridBagConstraints);

        getContentPane().add(FondoNegro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed

        xMause = evt.getX();
        yMause = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        //
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMause, y - yMause);
    }//GEN-LAST:event_HeaderMouseDragged

    private void lbXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXMouseClicked
        //Evento de LB Cierre el programa
        System.exit(0);
    }//GEN-LAST:event_lbXMouseClicked

    private void lbXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXMouseEntered
        //Cambia el color de el cierre (Evento es cuando el mause entra al elemento X)
        btnExit.setBackground(Color.red);
        lbX.setForeground(Color.white);
    }//GEN-LAST:event_lbXMouseEntered

    private void lbXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXMouseExited
        //cambia el color del cierre (Evento cuando el mause sale del elemento X)
        btnExit.setBackground(Color.white);
        lbX.setForeground(Color.red);
    }//GEN-LAST:event_lbXMouseExited

    private void lbIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIniciarSesionMouseEntered
        btnSesion.setBackground(new Color(153, 102, 255));
    }//GEN-LAST:event_lbIniciarSesionMouseEntered

    private void lbIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIniciarSesionMouseExited
        btnSesion.setBackground(new Color(153, 0, 255));
    }//GEN-LAST:event_lbIniciarSesionMouseExited

    private void tfUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsuarioMousePressed
        if (tfUsuario.getText().equals("Ingrese su usuario")) {
            tfUsuario.setText("");
            tfUsuario.setForeground(Color.black);
            
        } else if (String.valueOf(tfContraseña.getPassword()).isEmpty()) {
            tfContraseña.setText("* * * * * * * *");
            tfContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfUsuarioMousePressed

    private void tfContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfContraseñaMousePressed
        if (String.valueOf(tfContraseña.getPassword()).equals("* * * * * * * *")) {
            tfContraseña.setText("");
            tfContraseña.setForeground(Color.black);
            
        } else if (tfUsuario.getText().isEmpty()) {
            tfUsuario.setText("Ingrese su usuario");
            tfUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfContraseñaMousePressed

    private void lbIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIniciarSesionMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Datos introducidos:\n Usuario:" +
            tfUsuario.getText() + "\nContraseña: " + String.valueOf(tfContraseña.getPassword())
            , "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lbIniciarSesionMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel FondoNegro;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnSesion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbIniciarSesion;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lbX;
    private javax.swing.JPasswordField tfContraseña;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
