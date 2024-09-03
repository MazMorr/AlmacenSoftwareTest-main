
package vista;

import controladora.Almacen;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    private boolean clickBotonAceptar;
    private int xMouse, yMouse;
    Almacen almacen;
   
    
    public Login() {
        initComponents();
        this.clickBotonAceptar=true;
        setBounds(100, 200, 800, 500);
        setLocationRelativeTo(null);
        this.show.setVisible(false);
        this.almacen = new Almacen();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelIniciarSesion = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabelEntrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelLogo.setText("Logo");
        jPanel3.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 50, 30));

        jLabelUsername.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabelUsername.setText("USUARIO");
        jPanel3.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 70, -1));

        jLabelPassword.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabelPassword.setText("CONTRASEÑA");
        jPanel3.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabelIniciarSesion.setFont(new java.awt.Font("Roboto Black", 2, 24)); // NOI18N
        jLabelIniciarSesion.setText("INICIAR SESION");
        jPanel3.add(jLabelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, -1));

        userText.setBackground(new java.awt.Color(204, 204, 204));
        userText.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(153, 153, 153));
        userText.setText("Ingrese nombre de usuario");
        userText.setBorder(null);
        userText.setCaretColor(new java.awt.Color(204, 204, 204));
        userText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextMousePressed(evt);
            }
        });
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        jPanel3.add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 370, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 370, 10));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 370, 20));

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("********");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 370, 30));

        jPanel1.setBackground(new java.awt.Color(95, 108, 90));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabelEntrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEntrar.setText("                                    ENTRAR");
        jLabelEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEntrarMouseExited(evt);
            }
        });
        jLabelEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabelEntrarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabelEntrarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 410, 50));

        jLabelClose.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabelClose.setText("   X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCloseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LoginFoto.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 333, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-male-user-24.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 30, 30));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-eye-24.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMousePressed(evt);
            }
        });
        jPanel3.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 30, 30));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-invisible-24.png"))); // NOI18N
        ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ocultarMousePressed(evt);
            }
        });
        jPanel3.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 30, 30));

        jPanelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelHeaderMouseDragged(evt);
            }
        });
        jPanelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHeaderMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-refresh-24.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(341, 341, 341))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel3.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 790, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMousePressed
        jPanel2.setBackground(Color.red);
    }//GEN-LAST:event_jLabelCloseMousePressed

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        jPanel2.setBackground(Color.red);
        jLabelClose.setForeground(Color.white);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        jPanel2.setBackground(new Color(232,232,232));
        jLabelClose.setForeground(Color.black);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jPanelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanelHeaderMouseDragged

    private void jPanelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelHeaderMousePressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jPanel1.setBackground(new Color(147, 73 , 13));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel1.setBackground(new Color(124, 62, 11));
    }//GEN-LAST:event_jPanel1MouseExited

    private void userTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMousePressed
        if(userText.getText().equals("Ingrese nombre de usuario")){
            userText.setText("");
            userText.setForeground(Color.black);
        }
        if(String.valueOf(jPasswordField1.getPassword()).isEmpty()){
            jPasswordField1.setText("********");
            jPasswordField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_userTextMousePressed

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        if(String.valueOf(jPasswordField1.getPassword()).equals("********")){
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.black);
        }
        if(userText.getText().isEmpty()){
            userText.setText("Ingrese nombre de usuario");
            userText.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField1MousePressed

    private void showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMousePressed
       
    }//GEN-LAST:event_showMousePressed

    private void ocultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ocultarMousePressed

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
           jPasswordField1.setEchoChar((char)0);
           this.ocultar.setVisible(false);
           this.ocultar.setEnabled(false);
           this.show.setVisible(true);
           this.show.setEnabled(true);
       
    }//GEN-LAST:event_ocultarMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
           jPasswordField1.setEchoChar((char)8226);
           this.show.setVisible(false);
           this.show.setEnabled(false);
           this.ocultar.setVisible(true);
           this.ocultar.setEnabled(true);
       
    }//GEN-LAST:event_showMouseClicked

    private void jLabelEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEntrarMouseClicked
        if(validarCampos()==true){
            Contenido contenido = new Contenido();
            contenido.ejecutar();
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Rellene los campos correctamente","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelEntrarMouseClicked

    private void jLabelEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelEntrarKeyPressed
        
    }//GEN-LAST:event_jLabelEntrarKeyPressed

    private void jLabelEntrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelEntrarKeyTyped
        
    }//GEN-LAST:event_jLabelEntrarKeyTyped

    private void jLabelEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEntrarMouseEntered
        jPanel1.setBackground(new Color(111,125,104));
    }//GEN-LAST:event_jLabelEntrarMouseEntered

    private void jLabelEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEntrarMouseExited
        jPanel1.setBackground(new Color(95,108,90));
    }//GEN-LAST:event_jLabelEntrarMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            almacen.importarContrasena("C:\\Users\\david\\Code\\Almacen\\Contrasena.txt");           
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked
    
    public boolean ejecutar(){
        setVisible(true);
        return clickBotonAceptar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelEntrar;
    private javax.swing.JLabel jLabelIniciarSesion;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel ocultar;
    private javax.swing.JLabel show;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
    
    public boolean validarCampos(){
        boolean aceptado = true;
        
        char[] passwordChars = jPasswordField1.getPassword();
        String passwordString = new String(passwordChars);
        
        if(userText.getText().equals("Ingrese nombre de usuario")){
            aceptado = false;
        }
        if(passwordString.equalsIgnoreCase("********")){
            aceptado = false;
        }
        if(passwordString.trim().length()==0 || passwordString.isEmpty()){
            aceptado = false;
        }

        if(!userText.getText().equals(almacen.getAdmin().getUsername())){
            aceptado = false;
        }
        
        if(userText.getText().trim().length()==0 || userText.getText().isEmpty()){
            aceptado = false;
        }
        
        if(!passwordString.equals(almacen.getAdmin().getPassword())){
            aceptado = false;
        }
        
        return aceptado;
    }

}
