
package vista;
import controladora.Almacen;
import java.awt.Color;
import static java.awt.Color.black;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Admin;


public class Cuenta extends javax.swing.JDialog {
    
    Almacen almacen;
    private String passwordStringNew;
    private Admin admin;
    

    public Cuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBounds(100, 200, 300, 360);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.passwordStringNew=null;
        this.almacen = new Almacen();
        this.admin =new Admin();
    }

    public Cuenta() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        userText = new javax.swing.JTextField();
        userText1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(290, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(229, 228, 223));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 63, 65));
        jLabel1.setText("Usuario actual");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 63, 65));
        jLabel2.setText("Contraseña actual");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 230, 10));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 63, 65));
        jLabel3.setText("Nuevo usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 63, 65));
        jLabel4.setText("Nueva Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(95, 108, 90));
        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 6, true));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 80, 30));

        btnAceptar.setBackground(new java.awt.Color(95, 108, 90));
        btnAceptar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 6, true));
        btnAceptar.setBorderPainted(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 80, 30));

        userText.setBackground(new java.awt.Color(204, 204, 204));
        userText.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(153, 153, 153));
        userText.setText("Ingrese nuevo nombre de usuario");
        userText.setBorder(null);
        userText.setCaretColor(new java.awt.Color(204, 204, 204));
        userText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTextMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextMousePressed(evt);
            }
        });
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        jPanel1.add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 30));

        userText1.setBackground(new java.awt.Color(204, 204, 204));
        userText1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userText1.setForeground(new java.awt.Color(153, 153, 153));
        userText1.setText("Ingrese nombre de usuario");
        userText1.setBorder(null);
        userText1.setCaretColor(new java.awt.Color(204, 204, 204));
        userText1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userText1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userText1MousePressed(evt);
            }
        });
        userText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userText1ActionPerformed(evt);
            }
        });
        jPanel1.add(userText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 30));

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("********");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 30));

        jPasswordField2.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField2.setText("********");
        jPasswordField2.setBorder(null);
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField2MousePressed(evt);
            }
        });
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        this.btnCancelar.setBackground(new Color(111, 125, 104));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        this.btnCancelar.setBackground(new Color(95, 108, 90));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        this.btnAceptar.setBackground(new Color(111, 125, 104));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        this.btnAceptar.setBackground(new Color(95, 108, 90));
    }//GEN-LAST:event_btnAceptarMouseExited

    private void userTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMousePressed
        
    }//GEN-LAST:event_userTextMousePressed

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextActionPerformed

    private void userText1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userText1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userText1MousePressed

    private void userText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userText1ActionPerformed

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        
    }//GEN-LAST:event_jPasswordField1MousePressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2MousePressed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        if(validarCampos()){
            admin = new Admin(userText.getText(),passwordStringNew);
            try {
                guardarContrasena("C:\\Users\\david\\Code\\Almacen\\Contrasena.txt");
            } catch (IOException ex) {
                Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
        
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void userText1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userText1MouseClicked
        userText1.setText("");
        userText1.setForeground(black);
    }//GEN-LAST:event_userText1MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        jPasswordField1.setText("");
        jPasswordField1.setForeground(black);
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void userTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMouseClicked
        userText.setText("");
        userText.setForeground(black);
    }//GEN-LAST:event_userTextMouseClicked

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        jPasswordField2.setText("");
        jPasswordField2.setForeground(black);
    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    public boolean validarCampos(){
        
        if(userText1.getText().isEmpty() || userText1.getText().equals("Ingrese nombre de usuario") || (!userText1.getText().equals(almacen.getAdmin().getUsername()) || userText1.getText().trim().length()==0)){
            return false;
        }
        if(userText.getText().isEmpty() || userText.getText().equals("Ingrese nuevo nombre de usuario") || userText.getText().trim().length()==0){
            return false;
        }
        
        char[] passwordChar = jPasswordField1.getPassword();
        String passwordString = new String(passwordChar);
        
        if(jPasswordField1.getPassword().length==0 || passwordString.equals("********") || !passwordString.equals(almacen.getAdmin().getPassword())){
            return false;
        }
        
        char[] passwordCharNew = jPasswordField2.getPassword();
        passwordStringNew = new String (passwordCharNew);
        
        if(jPasswordField2.getPassword().length==0 || passwordStringNew.equals("********")){
            return false;
        }
        return true;
    }
    
    public void guardarContrasena(String rutaFichero) throws FileNotFoundException, IOException{
        File file = new File(rutaFichero);
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(outputStream);
        
        output.writeObject(admin);
        
        output.flush();
        output.close();
    }
    
    public void run() {
            this.setVisible(true);
    }
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField userText;
    private javax.swing.JTextField userText1;
    // End of variables declaration//GEN-END:variables
}
