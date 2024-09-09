
package vista;

import modelo.*;
import controladora.Almacen;
import util1.Date;
import excepciones.*;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Contenido extends javax.swing.JFrame implements Serializable {
   
    int xMouse;
    int yMouse;
    int contador;
    int pos;
    Almacen almacen;
    Product producto;
    TechnologyStorage almacenamiento;
    Movement movimiento;
    DefaultTableModel model;
    DefaultTableModel model2;
    
    public Contenido() {
        initComponents();
        this.setBounds(100, 200, 800, 530);
        this.setLocationRelativeTo(null);
        this.contador=0;
        this.pos=-1;
        this.jPanelContentInicio.setVisible(true);
        this.jPanelContentProductos.setVisible(false);
        this.jPanelContentInventario.setVisible(false);
        this.jPanelContentAlmacenamiento.setVisible(false);
        this.jPanelContentActividad.setVisible(false);
        almacen = new Almacen();
        actualizarValoresFooter();
        llenarComboBox();
        iniciarBarra();
    }
    
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Product getProducto() {
        return producto;
    }
    public void iniciarBarra(){
        bar.setValue(0);
        bar.setMaximum(12000);
        bar.setStringPainted(true);
    }
    public void llenarBarra(){
        while(contador<=almacen.getActualSpace()){
            bar.setValue(contador);
            contador +=1;
        }
    }
    public void vaciarBarra(){
        while(contador>=almacen.getActualSpace()){
            bar.setValue((int) contador);
            contador -=1;
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelNavegacion = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jPanelInventario = new javax.swing.JPanel();
        jLabelInventario = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtTotalProductos = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        jLabel19 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTotalAlm = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanelExit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();
        jPanelContentInicio = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanelContentProductos = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFechaProducto = new javax.swing.JFormattedTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtIdProducto = new javax.swing.JTextField();
        txtCapacidadProducto = new javax.swing.JSpinner();
        txtPrecioProducto = new javax.swing.JSpinner();
        txtTipo = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jPanelContentAlmacenamiento = new javax.swing.JPanel();
        jSeparator15 = new javax.swing.JSeparator();
        btnAceptarAlmacenamiento = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        txtCapacidadAlmacenamiento = new javax.swing.JSpinner();
        txtLargoAlmacenamiento = new javax.swing.JSpinner();
        txtProducto = new javax.swing.JComboBox<>();
        txtNombre1 = new javax.swing.JTextField();
        txtTipoAlmacenamiento1 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        txtAlturaAlmacenamiento = new javax.swing.JSpinner();
        txtAnchoAlmacenamiento = new javax.swing.JSpinner();
        jLabel47 = new javax.swing.JLabel();
        jPanelContentInventario = new javax.swing.JPanel();
        btnEliminarProductos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jLabelEditar = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        txtNuevoProducto = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtNuevaCantidad = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        txtNuevoVolumen = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        txtNuevoTipoAlmacenamiento = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jPanelContentActividad = new javax.swing.JPanel();
        btnEliminarMovimiento = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelNavegacion.setBackground(new java.awt.Color(95, 108, 90));
        jPanelNavegacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanelNavegacion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 10));

        jPanel2.setBackground(new java.awt.Color(95, 108, 90));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 228, 223));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-home-24.png"))); // NOI18N
        jLabel2.setText("Inicio");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanelNavegacion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 40));

        jPanel3.setBackground(new java.awt.Color(95, 108, 90));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 228, 223));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-product-24.png"))); // NOI18N
        jLabel3.setText("Productos");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanelNavegacion.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 40));

        jPanel4.setBackground(new java.awt.Color(95, 108, 90));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 228, 223));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-storage-24.png"))); // NOI18N
        jLabel4.setText("Almacenamiento");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanelNavegacion.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 40));

        jPanel5.setBackground(new java.awt.Color(95, 108, 90));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 228, 223));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-user-24.png"))); // NOI18N
        jLabel6.setText("Administrador");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanelNavegacion.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 40));

        jPanel6.setBackground(new java.awt.Color(95, 108, 90));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(229, 228, 223));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-graph-24.png"))); // NOI18N
        jLabel5.setText("Registro");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanelNavegacion.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 40));

        jLabel23.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel23.setText("General");
        jPanelNavegacion.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel24.setText("Almacen");
        jPanelNavegacion.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanelNavegacion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanelNavegacion.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 170, 10));

        jLabel25.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel25.setText("Usuario");
        jPanelNavegacion.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jPanelInventario.setBackground(new java.awt.Color(95, 108, 90));

        jLabelInventario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabelInventario.setForeground(new java.awt.Color(229, 228, 223));
        jLabelInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-inventory-24.png"))); // NOI18N
        jLabelInventario.setText("Inventario");
        jLabelInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelInventarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelInventarioLayout = new javax.swing.GroupLayout(jPanelInventario);
        jPanelInventario.setLayout(jPanelInventarioLayout);
        jPanelInventarioLayout.setHorizontalGroup(
            jPanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInventarioLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelInventarioLayout.setVerticalGroup(
            jPanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanelNavegacion.add(jPanelInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 40));

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-refresh-24.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanelNavegacion.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 30));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-save-25.png"))); // NOI18N
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        jPanelNavegacion.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 50));

        jPanel1.add(jPanelNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 530));

        jPanelFooter.setBackground(new java.awt.Color(229, 228, 223));
        jPanelFooter.setForeground(new java.awt.Color(153, 153, 153));
        jPanelFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(229, 228, 223));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(147, 73, 13));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-carton-of-orange-juice-48.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        txtTotalProductos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtTotalProductos.setText("100");
        jPanel7.add(txtTotalProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 40, 30));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setText("Total de productos:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jPanelFooter.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 100));

        jPanel8.setBackground(new java.awt.Color(229, 228, 223));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        bar.setForeground(new java.awt.Color(51, 51, 51));
        bar.setMaximum(10000);
        jPanel8.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 20));
        bar.getAccessibleContext().setAccessibleName("");
        bar.getAccessibleContext().setAccessibleDescription("");

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setText("Almacenamiento ocupado");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 30));

        jPanelFooter.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 180, 100));

        jPanel9.setBackground(new java.awt.Color(229, 228, 223));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setText("Total de tecnologias:");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-group-of-projects-50.png"))); // NOI18N
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        txtTotalAlm.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtTotalAlm.setText("100");
        jPanel9.add(txtTotalAlm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 30, 40));

        jPanelFooter.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 140, 100));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFooter.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        jPanel1.add(jPanelFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 600, 130));

        jPanelExit.setBackground(new java.awt.Color(229, 228, 223));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("     X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExitLayout = new javax.swing.GroupLayout(jPanelExit);
        jPanelExit.setLayout(jPanelExitLayout);
        jPanelExitLayout.setHorizontalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanelExitLayout.setVerticalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 50, 50));

        jPanelHeader.setBackground(new java.awt.Color(229, 228, 223));
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

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jPanelContent.setBackground(new java.awt.Color(147, 73, 13));
        jPanelContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelContentInicio.setBackground(new java.awt.Color(229, 228, 223));
        jPanelContentInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("SEA BIENVENIDO A SU SOFTWARE DE GESTION DE ALMACEN!");
        jPanelContentInicio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 400, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabel10.setText("BIENVENIDO !");
        jPanelContentInicio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 270, 50));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setText("Esta es una herramienta desarrollada y enfocada al");
        jPanelContentInicio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 330, 20));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setText("usuario que lo ayudara a usted  a optimizar su trabajo");
        jPanelContentInicio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 340, 20));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setText("y mejorar su eficiencia. esperamos que la disfrute y");
        jPanelContentInicio.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 330, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel14.setText("Att: La Direccion");
        jPanelContentInicio.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setText("no dude en dar su feedback. ");
        jPanelContentInicio.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/undraw_heavy_box_agqi (1).png"))); // NOI18N
        jPanelContentInicio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 300, 190));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentInicio.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 440, 10));

        jPanelContent.add(jPanelContentInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        jPanelContentProductos.setBackground(new java.awt.Color(229, 228, 223));
        jPanelContentProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setBackground(new java.awt.Color(95, 108, 90));
        btnAceptar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 6, true));
        btnAceptar.setBorderPainted(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanelContentProductos.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 80, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentProductos.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 440, 10));

        jLabel26.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabel26.setText("Productos");
        jPanelContentProductos.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(15, 15, 15));
        jLabel27.setText("Nombre");
        jPanelContentProductos.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel28.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(15, 15, 15));
        jLabel28.setText("ID");
        jPanelContentProductos.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel29.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(15, 15, 15));
        jLabel29.setText("Fecha de caducidad");
        jPanelContentProductos.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel30.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(15, 15, 15));
        jLabel30.setText("Precio");
        jPanelContentProductos.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 50, -1));

        jLabel31.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(15, 15, 15));
        jLabel31.setText("Tipo");
        jPanelContentProductos.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel33.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(15, 15, 15));
        jLabel33.setText("Capacidad(ml)");
        jPanelContentProductos.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Nombre Producto");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        jPanelContentProductos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 30));

        txtFechaProducto.setBackground(new java.awt.Color(204, 204, 204));
        txtFechaProducto.setBorder(null);
        txtFechaProducto.setForeground(new java.awt.Color(153, 153, 153));
        txtFechaProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtFechaProducto.setText("4/11/04");
        txtFechaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaProductoMouseClicked(evt);
            }
        });
        jPanelContentProductos.add(txtFechaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 140, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelContentProductos.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 10, 220));

        txtIdProducto.setBackground(new java.awt.Color(204, 204, 204));
        txtIdProducto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIdProducto.setForeground(new java.awt.Color(153, 153, 153));
        txtIdProducto.setText("ID Producto");
        txtIdProducto.setBorder(null);
        txtIdProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdProductoMouseClicked(evt);
            }
        });
        jPanelContentProductos.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 30));

        txtCapacidadProducto.setBorder(null);
        jPanelContentProductos.add(txtCapacidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 160, 30));

        txtPrecioProducto.setBorder(null);
        jPanelContentProductos.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, 30));

        txtTipo.setBackground(new java.awt.Color(229, 228, 223));
        txtTipo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 228, 223), 4, true));
        txtTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelContentProductos.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 160, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentProductos.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentProductos.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentProductos.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, 10));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/undraw_Add_file_re_s4qf.png"))); // NOI18N
        jPanelContentProductos.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 230, 182));

        jPanelContent.add(jPanelContentProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        jPanelContentAlmacenamiento.setBackground(new java.awt.Color(229, 228, 223));
        jPanelContentAlmacenamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentAlmacenamiento.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 140, 10));

        btnAceptarAlmacenamiento.setBackground(new java.awt.Color(95, 108, 90));
        btnAceptarAlmacenamiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAceptarAlmacenamiento.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarAlmacenamiento.setText("Aceptar");
        btnAceptarAlmacenamiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 6, true));
        btnAceptarAlmacenamiento.setBorderPainted(false);
        btnAceptarAlmacenamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptarAlmacenamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarAlmacenamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarAlmacenamientoMouseExited(evt);
            }
        });
        btnAceptarAlmacenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAlmacenamientoActionPerformed(evt);
            }
        });
        jPanelContentAlmacenamiento.add(btnAceptarAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 80, 30));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentAlmacenamiento.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 440, 10));

        jLabel34.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabel34.setText("Almacenamiento");
        jPanelContentAlmacenamiento.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel35.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(15, 15, 15));
        jLabel35.setText("Largo(m)");
        jPanelContentAlmacenamiento.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel36.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(15, 15, 15));
        jLabel36.setText("Ancho(m)");
        jPanelContentAlmacenamiento.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel37.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(15, 15, 15));
        jLabel37.setText("Fecha entrada");
        jPanelContentAlmacenamiento.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel38.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(15, 15, 15));
        jLabel38.setText("Altura(m)");
        jPanelContentAlmacenamiento.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, -1));

        jLabel39.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(15, 15, 15));
        jLabel39.setText("Tipo");
        jPanelContentAlmacenamiento.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel40.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(15, 15, 15));
        jLabel40.setText("Cant Producto");
        jPanelContentAlmacenamiento.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelContentAlmacenamiento.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 10, 220));

        txtCapacidadAlmacenamiento.setBorder(null);
        jPanelContentAlmacenamiento.add(txtCapacidadAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 160, 30));

        txtLargoAlmacenamiento.setBorder(null);
        jPanelContentAlmacenamiento.add(txtLargoAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 30));

        txtProducto.setBackground(new java.awt.Color(229, 228, 223));
        txtProducto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 228, 223), 4, true));
        txtProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        jPanelContentAlmacenamiento.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, 30));

        txtNombre1.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre1.setText("4/11/12");
        txtNombre1.setBorder(null);
        txtNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombre1MouseClicked(evt);
            }
        });
        jPanelContentAlmacenamiento.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 140, 30));

        txtTipoAlmacenamiento1.setBackground(new java.awt.Color(229, 228, 223));
        txtTipoAlmacenamiento1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTipoAlmacenamiento1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 228, 223), 4, true));
        txtTipoAlmacenamiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelContentAlmacenamiento.add(txtTipoAlmacenamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 160, 30));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/undraw_logistics_x4dc.png"))); // NOI18N
        jPanelContentAlmacenamiento.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 220, 134));

        txtAlturaAlmacenamiento.setBorder(null);
        jPanelContentAlmacenamiento.add(txtAlturaAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 30));

        txtAnchoAlmacenamiento.setBorder(null);
        jPanelContentAlmacenamiento.add(txtAnchoAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 30));

        jLabel47.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(15, 15, 15));
        jLabel47.setText("Producto");
        jPanelContentAlmacenamiento.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jPanelContent.add(jPanelContentAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        jPanelContentInventario.setBackground(new java.awt.Color(229, 228, 223));
        jPanelContentInventario.setMinimumSize(new java.awt.Dimension(610, 340));
        jPanelContentInventario.setPreferredSize(new java.awt.Dimension(610, 350));
        jPanelContentInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarProductos.setBackground(new java.awt.Color(229, 228, 223));
        btnEliminarProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEliminarProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-delete-30.png"))); // NOI18N
        btnEliminarProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        btnEliminarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProductosMouseExited(evt);
            }
        });
        btnEliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductosActionPerformed(evt);
            }
        });
        jPanelContentInventario.add(btnEliminarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 30, 30));

        jTable2.setBackground(new java.awt.Color(229, 228, 223));
        jTable2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Volumen", "Cantidad", "Almacenamiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setToolTipText("");
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable2.setSelectionBackground(new java.awt.Color(95, 108, 90));
        jTable2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable2PropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanelContentInventario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 610, 230));

        jLabel42.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabel42.setText("Inventario");
        jPanelContentInventario.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabelEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-editar-24.png"))); // NOI18N
        jLabelEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditarMouseClicked(evt);
            }
        });
        jPanelContentInventario.add(jLabelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 30, 30));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentInventario.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 420, 10));

        txtNuevoProducto.setBackground(new java.awt.Color(204, 204, 204));
        txtNuevoProducto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNuevoProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtNuevoProducto.setText("NuevoProducto");
        txtNuevoProducto.setBorder(null);
        txtNuevoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuevoProductoMouseClicked(evt);
            }
        });
        jPanelContentInventario.add(txtNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 30));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentInventario.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 10));

        txtNuevaCantidad.setBackground(new java.awt.Color(204, 204, 204));
        txtNuevaCantidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNuevaCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtNuevaCantidad.setText("NuevaCantidad");
        txtNuevaCantidad.setBorder(null);
        txtNuevaCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuevaCantidadMouseClicked(evt);
            }
        });
        jPanelContentInventario.add(txtNuevaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 140, 30));

        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentInventario.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 140, 10));

        txtNuevoVolumen.setBackground(new java.awt.Color(204, 204, 204));
        txtNuevoVolumen.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNuevoVolumen.setForeground(new java.awt.Color(0, 0, 0));
        txtNuevoVolumen.setText("NuevoVolumen");
        txtNuevoVolumen.setBorder(null);
        txtNuevoVolumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuevoVolumenMouseClicked(evt);
            }
        });
        jPanelContentInventario.add(txtNuevoVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 140, 30));

        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentInventario.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 140, 10));

        txtNuevoTipoAlmacenamiento.setBackground(new java.awt.Color(229, 228, 223));
        txtNuevoTipoAlmacenamiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNuevoTipoAlmacenamiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 228, 223), 4, true));
        txtNuevoTipoAlmacenamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelContentInventario.add(txtNuevoTipoAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 130, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-casilla-de-verificación-marcada-30.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanelContentInventario.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 30, 30));

        jPanelContent.add(jPanelContentInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        jPanelContentActividad.setBackground(new java.awt.Color(229, 228, 223));
        jPanelContentActividad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarMovimiento.setBackground(new java.awt.Color(229, 228, 223));
        btnEliminarMovimiento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEliminarMovimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarMovimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-delete-30.png"))); // NOI18N
        btnEliminarMovimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        btnEliminarMovimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarMovimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMovimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMovimientoMouseExited(evt);
            }
        });
        btnEliminarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMovimientoActionPerformed(evt);
            }
        });
        jPanelContentActividad.add(btnEliminarMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 30, 30));

        jTable3.setBackground(new java.awt.Color(229, 228, 223));
        jTable3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Actividad", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setToolTipText("");
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable3.setSelectionBackground(new java.awt.Color(95, 108, 90));
        jScrollPane3.setViewportView(jTable3);

        jPanelContentActividad.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 600, 230));

        jLabel43.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabel43.setText("Registro");
        jPanelContentActividad.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContentActividad.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 420, 10));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/undraw_Growing_re_olpi.png"))); // NOI18N
        jPanelContentActividad.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 90, 40));

        jPanelContent.add(jPanelContentActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        jPanel1.add(jPanelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 600, 350));

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

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jPanel2.setBackground(new Color(139, 154, 133));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jPanel2.setBackground(new Color(95,108,90));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jPanel3.setBackground(new Color(139, 154, 133));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
       jPanel3.setBackground(new Color(95,108,90));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       jPanel4.setBackground(new Color(139, 154, 133));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jPanel4.setBackground(new Color(95,108,90));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jPanel5.setBackground(new Color(139, 154, 133));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jPanel5.setBackground(new Color(95,108,90));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jPanel6.setBackground(new Color(139, 154, 133));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jPanel6.setBackground(new Color(95,108,90));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.white);
        jPanelExit.setBackground(Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.black);
        jPanelExit.setBackground(new Color(229,228,223));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelHeaderMousePressed

    private void jPanelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanelHeaderMouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jPanelContentInicio.setVisible(true);
        this.jPanel2.setBackground(new Color(111, 125, 104));
        this.jPanel3.setBackground(new Color(95,108,90));
        this.jPanel4.setBackground(new Color(95,108,90));
        this.jPanel5.setBackground(new Color(95,108,90));
        this.jPanel6.setBackground(new Color(95,108,90));
        txtNombre.setForeground(new Color(153,153,153));
        txtIdProducto.setForeground(new Color(153,153,153));
        txtFechaProducto.setForeground(new Color(153,153,153));
      //  txtFechaProducto1.setForeground(new Color(153,153,153));
        llenarTextoAlmacenamiento();
        llenarTextoProductos();
        jPanelContentProductos.setVisible(false);
        jPanelContentInventario.setVisible(false);
        jPanelContentAlmacenamiento.setVisible(false);
        jPanelContentActividad.setVisible(false);
        jPanelContentInicio.repaint();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jPanelContentProductos.setVisible(true);
        this.jPanelContentInicio.setVisible(false);
        this.jPanelContentInventario.setVisible(false);
        this.jPanelContentAlmacenamiento.setVisible(false);
        llenarTextoAlmacenamiento();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        this.btnAceptar.setBackground(new Color(111, 125, 104));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        this.btnAceptar.setBackground(new Color(95, 108, 90));
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnAceptarAlmacenamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarAlmacenamientoMouseEntered
        this.btnAceptarAlmacenamiento.setBackground(new Color(111, 125, 104));
    }//GEN-LAST:event_btnAceptarAlmacenamientoMouseEntered

    private void btnAceptarAlmacenamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarAlmacenamientoMouseExited
        this.btnAceptarAlmacenamiento.setBackground(new Color(95, 108, 90));
    }//GEN-LAST:event_btnAceptarAlmacenamientoMouseExited

    private void jLabelInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInventarioMouseEntered
        this.jPanelInventario.setBackground(new Color(139, 154, 133));
    }//GEN-LAST:event_jLabelInventarioMouseEntered

    private void jLabelInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInventarioMouseExited
        this.jPanelInventario.setBackground(new Color(95, 108, 90));
    }//GEN-LAST:event_jLabelInventarioMouseExited

    private void jLabelInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInventarioMouseClicked
        jPanelContentInventario.setVisible(true);
        jPanelContentProductos.setVisible(false);
        this.jPanelContentInicio.setVisible(false);
        this.jPanelContentAlmacenamiento.setVisible(false);
        txtNombre.setForeground(new Color(153,153,153));
        txtIdProducto.setForeground(new Color(153,153,153));
        txtFechaProducto.setForeground(new Color(153,153,153));
       // txtFechaProducto1.setForeground(new Color(153,153,153));
        llenarTextoAlmacenamiento();
        llenarTextoProductos();
    }//GEN-LAST:event_jLabelInventarioMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jPanelContentAlmacenamiento.setVisible(true);
        this.jPanelContentInicio.setVisible(false);
        this.jPanelContentProductos.setVisible(false);
        this.jPanelContentInventario.setVisible(false);
        txtNombre.setForeground(new Color(153,153,153));
        txtIdProducto.setForeground(new Color(153,153,153));
        txtFechaProducto.setForeground(new Color(153,153,153));
        llenarTextoProductos();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnEliminarProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductosMouseEntered

    private void btnEliminarProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductosMouseExited

    private void btnEliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductosActionPerformed
        int fila = jTable2.getSelectedRow();
        if(fila>=0){
            String producto = null;
            try {
                producto = almacen.getAlmacenamientos().obtener(fila).getProducto();
            } catch (ExceptionElementoFueraDeRango ex) {
                Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
            }
            String tipo = "Salida";
            //Date date = almacenamiento.getFecha();
            LocalDateTime fechaSalida = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yy");
            String date =  fechaSalida.format(formatter);
            movimiento = new Movement(producto,tipo,date);
            try {
                almacen.addMovimiento(movimiento);
                actualizarTablaRegistro();
                jPanelContentActividad.setVisible(false);
                jPanelContentInventario.repaint();
            } catch (ExceptionArregloLleno | ExceptionElementoFueraDeRango ex) {
                Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                model.removeRow(fila);
                pos--;
                almacen.setActualSpace(almacen.eliminarEspacioOcupado(almacen.getActualSpace(),fila));
                almacen.borrarAlmacenamiento(fila);
                almacen.borrarProducto(fila);
                actualizarTablaProductos();
                vaciarBarra();
                txtProducto.removeItemAt(fila);
                jPanelContentInventario.repaint();
                actualizarValoresFooter();
            } catch (ExceptionElementoFueraDeRango | ExceptionArregloVacio ex) {
                Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_btnEliminarProductosActionPerformed

    private void btnEliminarMovimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMovimientoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMovimientoMouseEntered

    private void btnEliminarMovimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMovimientoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMovimientoMouseExited

    private void btnEliminarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMovimientoActionPerformed
        int fila = jTable3.getSelectedRow();
        if(fila>=0){ 
            try {
                model2.removeRow(fila);
                almacen.getMovimientos().eliminar(fila);
                actualizarTablaRegistro();
            } catch (ExceptionElementoFueraDeRango ex) {
                Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_btnEliminarMovimientoActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Cuenta user = new Cuenta(this, true);
        user.run();
        System.out.println(almacen.getAdmin().toString());
        txtNombre.setForeground(new Color(153,153,153));
        txtIdProducto.setForeground(new Color(153,153,153));
        txtFechaProducto.setForeground(new Color(153,153,153));
        llenarTextoAlmacenamiento();
        llenarTextoProductos();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.jPanelContentActividad.setVisible(true);
        this.jPanelContentInicio.setVisible(false);
        this.jPanelContentProductos.setVisible(false);
        this.jPanelContentInventario.setVisible(false);
        this.jPanelContentAlmacenamiento.setVisible(false);
        txtNombre.setForeground(new Color(153,153,153));
        txtIdProducto.setForeground(new Color(153,153,153));
        txtFechaProducto.setForeground(new Color(153,153,153));
        llenarTextoAlmacenamiento();
        llenarTextoProductos();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(validarCamposProducto()==true && producto!=null){
            try {
                almacen.addProducto(producto);
                txtProducto.addItem(producto.toString());
                actualizarValoresFooter();
                JOptionPane.showMessageDialog(null, "Se ha añadido correctamente");
            } catch (ExceptionArregloLleno ex) {
                Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellene todos los campos","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptarAlmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAlmacenamientoActionPerformed
        
        if(validarCamposAlmacenamiento() == true && almacenamiento != null){
            String producto = almacenamiento.getProducto();
            String tipo = "Entrada";
            String date = almacenamiento.getFecha();
            movimiento = new Movement(producto,tipo,date);
            try {
                almacen.addMovimiento(movimiento);
                actualizarTablaRegistro();
                jPanelContentAlmacenamiento.repaint();
            } catch (ExceptionArregloLleno | ExceptionElementoFueraDeRango ex) {
                Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                almacen.addAlmacenamiento(almacenamiento);
                pos++;
                almacen.setPos(pos);
                almacen.setActualSpace(almacen.espacioOcupado(pos));
                actualizarTablaProductos();
                llenarBarra();
                actualizarValoresFooter();
                JOptionPane.showMessageDialog(null, "Se ha añadido correctamente");
                jPanelContentActividad.setVisible(false);
                jPanelContentInventario.setVisible(false);
                jPanelContentAlmacenamiento.repaint();
            } catch (ExceptionArregloLleno | ExceptionElementoFueraDeRango ex) {
                Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellene todos los campos","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarAlmacenamientoActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
       txtNombre.setText("");
       txtNombre.setForeground(Color.black);
    }//GEN-LAST:event_txtNombreMouseClicked
    
    private void txtIdProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdProductoMouseClicked
        txtIdProducto.setText("");
        txtIdProducto.setForeground(Color.black);
    }//GEN-LAST:event_txtIdProductoMouseClicked

    private void txtFechaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaProductoMouseClicked
        txtFechaProducto.setText("");
        txtFechaProducto.setForeground(Color.black);
    }//GEN-LAST:event_txtFechaProductoMouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        try {
            almacen.exportarInformacion("E:\\Almacen\\Almacen.txt");
        } catch (FileNotFoundException | ExceptionElementoFueraDeRango ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        try {
            almacen.importarInformacion("E:\\Almacen\\Almacen.txt");
            actualizarValoresFooter();
            try {
                this.pos = almacen.getPos();
                almacen.setActualSpace(almacen.espacioOcupado(pos));
                llenarBarra();
            } catch (ExceptionElementoFueraDeRango ex) {
                Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                actualizarTablaProductos();
                actualizarTablaRegistro();
            } catch (ExceptionElementoFueraDeRango ex) {
                Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i=0;i<almacen.getProductos().cantElementos();i++){
                try {
                    txtProducto.addItem(almacen.getProductos().obtener(i).toString());
                } catch (ExceptionElementoFueraDeRango ex) {
                    Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException | ClassNotFoundException | ExceptionArregloLleno ex) {
            Logger.getLogger(Contenido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void txtNombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombre1MouseClicked
        txtNombre1.setText("");
        txtNombre1.setForeground(Color.black);
    }//GEN-LAST:event_txtNombre1MouseClicked

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void jTable2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable2PropertyChange
        
    }//GEN-LAST:event_jTable2PropertyChange

    private void jLabelEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditarMouseClicked
       int fila = jTable2.getSelectedRow();
       
       if(fila>=0){
           txtNuevoProducto.setText(model.getValueAt(fila, 0).toString());
           txtNuevoVolumen.setText(model.getValueAt(fila, 1).toString());
           txtNuevaCantidad.setText(model.getValueAt(fila, 2).toString());
       }else{
           JOptionPane.showMessageDialog(null,"Seleccione una fila");
       }
    }//GEN-LAST:event_jLabelEditarMouseClicked

    private void txtNuevoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoProductoMouseClicked
       txtNuevoProducto.setText("");
    }//GEN-LAST:event_txtNuevoProductoMouseClicked

    private void txtNuevaCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevaCantidadMouseClicked
        txtNuevaCantidad.setText("");
    }//GEN-LAST:event_txtNuevaCantidadMouseClicked

    private void txtNuevoVolumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoVolumenMouseClicked
        txtNuevoVolumen.setText("");
    }//GEN-LAST:event_txtNuevoVolumenMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        int fila = jTable2.getSelectedRow();
        if(fila>=0){
            model.setValueAt(txtNuevoProducto.getText().trim(), fila, 0);
            model.setValueAt(txtNuevoVolumen.getText().trim(), fila, 1);
            model.setValueAt(txtNuevaCantidad.getText().trim(), fila, 2);
            model.setValueAt(txtNuevoTipoAlmacenamiento.getSelectedItem().toString().trim(),fila,3);
        }
    }//GEN-LAST:event_jLabel18MouseClicked
    public void ejecutar(){
        this.setVisible(true);
    }
    public boolean validarCamposProducto(){
        boolean aceptado = true;
        
        String nombre = txtNombre.getText();
        String idProducto = txtIdProducto.getText();
        String date[] = txtFechaProducto.getText().split("/");
        String tipo = (String) txtTipo.getSelectedItem();
        double precio = Double.parseDouble(txtPrecioProducto.getValue().toString()) ;
        double capacidad = Double.parseDouble(txtCapacidadProducto.getValue().toString());
        
        if(nombre.trim().length()==0 || nombre.isEmpty()==true){
            aceptado=false;
        }
        if(idProducto.trim().length()==0 || idProducto.isEmpty()==true){
            aceptado=false;
        }
        if(date.length!=3){
            aceptado = false;
        }
        
        if(precio<=0){
            aceptado=false;
        }
        
        if(aceptado){
            int dia = Integer.parseInt(date[0]);
            int mes = Integer.parseInt(date[1]);
            int anio = Integer.parseInt(date[2]);
            
            Date fecha = new Date(dia,mes,anio);
            
            producto = new Product(idProducto, nombre, precio, capacidad, fecha, tipo);
        }
        return aceptado;
    }
    public boolean validarCamposAlmacenamiento(){
        boolean aceptado = true;
        double largo= Double.parseDouble(txtLargoAlmacenamiento.getValue().toString());
        double ancho = Double.parseDouble(txtAnchoAlmacenamiento.getValue().toString());
        double alto =  Double.parseDouble(txtAlturaAlmacenamiento.getValue().toString());
        double cant = Double.parseDouble(txtCapacidadAlmacenamiento.getValue().toString()); 
        String tipoAlm = (String) txtTipoAlmacenamiento1.getSelectedItem();
        String producto = (String) txtProducto.getSelectedItem();
        int posProducto = txtProducto.getSelectedIndex();
        String fecha = txtNombre1.getText();
        
        if(largo<=0){
            aceptado=false;
        }
        if(ancho<=0){
            aceptado=false;
        }
        if(alto<=0){
            aceptado=false;
        }
        if(cant<=0){
            aceptado=false;
        }
        if(producto==null){
            aceptado = false;
        }
        if(fecha.trim().length()==0 || fecha.isEmpty()==true){
            aceptado=false;
        }
        if(aceptado){
            /*int dia = Integer.parseInt(fecha[0]);
            int mes = Integer.parseInt(fecha[1]);
            int anio = Integer.parseInt(fecha[2]);
            Date date = new Date(dia,mes,anio);*/
            almacenamiento = new TechnologyStorage(tipoAlm,cant,alto,ancho,largo,producto,posProducto, fecha);
        }
        return aceptado;
    }
    public void llenarComboBox(){
        DefaultComboBoxModel <String> modelTipo = new DefaultComboBoxModel<>(new String[]{"Bebida","Alimento","Textil"});
        DefaultComboBoxModel <String> modelTipoAlmacenamiento = new DefaultComboBoxModel<>(new String[]{"Carga","Miscelaneo","Refrigerado"});
        DefaultComboBoxModel <String> modelNuevoTipoAlmacenamiento = new DefaultComboBoxModel<>(new String[]{"Carga","Miscelaneo","Refrigerado"});
        txtTipo.setModel(modelTipo);
        txtTipoAlmacenamiento1.setModel(modelTipoAlmacenamiento);
        txtNuevoTipoAlmacenamiento.setModel(modelNuevoTipoAlmacenamiento);
    }
    public void actualizarTablaProductos() throws ExceptionElementoFueraDeRango{
        Object [] columnas = {"Producto","Volumen","Cantidad","Almacenamiento"};
        model = new DefaultTableModel(columnas, 0);
        for(int i = 0;i<almacen.getAlmacenamientos().cantElementos();i++){
            String nombreProducto = almacen.getAlmacenamientos().obtener(i).getProducto();
            double cant = almacen.getAlmacenamientos().obtener(i).getCant();
            double volumen = almacen.getAlmacenamientos().obtener(i).volumen();
            String almacenamiento = almacen.getAlmacenamientos().obtener(i).getType();
            
            Object [] fila = {nombreProducto, volumen, cant, almacenamiento};
            model.addRow(fila);
        }
        this.jTable2.setModel(model);
    }
    
    public void actualizarTablaRegistro() throws ExceptionElementoFueraDeRango{
        Object [] columnas = {"Producto","Actividad","Fecha"};
        model2 = new DefaultTableModel(columnas, 0);
        
        for(int i =0;i<almacen.getMovimientos().cantElementos();i++){
            String nombreProducto = almacen.getMovimientos().obtener(i).getProduct();
            String actividad = almacen.getMovimientos().obtener(i).getMovementType();
            String fecha = almacen.getMovimientos().obtener(i).getDate();
            
            Object [] fila = {nombreProducto, actividad, fecha};
            model2.addRow(fila);
        }
        this.jTable3.setModel(model2);
    }
    
    public void actualizarValoresFooter(){
        txtTotalProductos.setText(" "+almacen.getProductos().cantElementos());
        txtTotalAlm.setText(" "+almacen.getAlmacenamientos().cantElementos());
    }
    public void llenarTextoProductos(){
        txtNombre.setText("Nombre Producto");
        txtIdProducto.setText("ID Producto");
        txtPrecioProducto.setValue((double) 0);
        txtCapacidadProducto.setValue((double) 0);
        txtFechaProducto.setText("04/11/04");
    }
    public void llenarTextoAlmacenamiento(){
        txtLargoAlmacenamiento.setValue((double) 0);
        txtAnchoAlmacenamiento.setValue((double) 0);
        txtAlturaAlmacenamiento.setValue((double) 0);
        txtCapacidadAlmacenamiento.setValue((double) 0);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptarAlmacenamiento;
    private javax.swing.JButton btnEliminarMovimiento;
    private javax.swing.JButton btnEliminarProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEditar;
    private javax.swing.JLabel jLabelInventario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelContentActividad;
    private javax.swing.JPanel jPanelContentAlmacenamiento;
    private javax.swing.JPanel jPanelContentInicio;
    private javax.swing.JPanel jPanelContentInventario;
    private javax.swing.JPanel jPanelContentProductos;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelInventario;
    private javax.swing.JPanel jPanelNavegacion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JSpinner txtAlturaAlmacenamiento;
    private javax.swing.JSpinner txtAnchoAlmacenamiento;
    private javax.swing.JSpinner txtCapacidadAlmacenamiento;
    private javax.swing.JSpinner txtCapacidadProducto;
    private javax.swing.JFormattedTextField txtFechaProducto;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JSpinner txtLargoAlmacenamiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNuevaCantidad;
    private javax.swing.JTextField txtNuevoProducto;
    private javax.swing.JComboBox<String> txtNuevoTipoAlmacenamiento;
    private javax.swing.JTextField txtNuevoVolumen;
    private javax.swing.JSpinner txtPrecioProducto;
    private javax.swing.JComboBox<String> txtProducto;
    private javax.swing.JComboBox<String> txtTipo;
    private javax.swing.JComboBox<String> txtTipoAlmacenamiento1;
    private javax.swing.JLabel txtTotalAlm;
    private javax.swing.JLabel txtTotalProductos;
    // End of variables declaration//GEN-END:variables
}
