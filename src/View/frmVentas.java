package View;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class frmVentas extends javax.swing.JFrame {

    //Objeto de la clase ImagenFondo
    ImagenFondo fondo;

    public frmVentas() {

        //Instanciar objetos de ImagenFondo
        fondo = new ImagenFondo("src/Imagenes/fondoProveedores.jpg");
        this.setContentPane(fondo);

        initComponents();

        //Definir el objeto para la imagen personalizada
        ImageIcon img = new ImageIcon("src/Imagenes/wrench.png");
        //Crear un nuevo objeto de clase Cursor
        Cursor c;
        Toolkit tk = Toolkit.getDefaultToolkit();
        //Ajustar la imagen como cursor
        c = tk.createCustomCursor(img.getImage(), new Point(1, 1), null);
        //Visualizar el cursor personalizado
        setCursor(c);
    }

    @Override
    public Image getIconImage() {
        //Se elige de los recursos de imágenes, la que se utilizará como icono
        Image valorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/mostrar.png"));
        return valorRetorno;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbNumeroDeVenta = new javax.swing.JLabel();
        jlbProductos = new javax.swing.JLabel();
        jlbCliente = new javax.swing.JLabel();
        jlbVendedor = new javax.swing.JLabel();
        jlbTotal = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jcbProductos = new javax.swing.JComboBox<>();
        jcbCliente = new javax.swing.JComboBox<>();
        jcbVendedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbnRegistrar = new javax.swing.JButton();
        jbnActualizar = new javax.swing.JButton();
        jbnEliminar = new javax.swing.JButton();
        jlbEditable = new javax.swing.JLabel();
        jbnRegresar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver Proveedores");
        setIconImage(getIconImage());

        jPanel1.setOpaque(false);
        //jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoS.png"))); // NOI18N
        //jPanel1.add(jlbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(153, 0, 0));
        jlbTitulo.setText("Registro ventas");
        //jPanel1.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas2.png"))); // NOI18N
        //jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 50, 30));

        jlbNumeroDeVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbNumeroDeVenta.setText("Número de venta: ");
        //jPanel1.add(jlbNumeroDeVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jlbProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbProductos.setText("Productos:");
        //jPanel1.add(jlbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jlbCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbCliente.setText("Cliente:");
        //jPanel1.add(jlbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jlbVendedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbVendedor.setText("Vendedor:");
        //jPanel1.add(jlbVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jlbTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTotal.setText("Total:");
        //jPanel1.add(jlbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jtfDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        //jPanel1.add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 80, -1));

        jcbProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige:" }));
        jcbProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jcbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, -1));

        jcbCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige:" }));
        jcbCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jcbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, -1));

        jcbVendedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige:" }));
        jcbVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jcbVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        //jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 590, 270));

        jbnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegistrar.setText("Registrar");
        jbnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jbnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, 40));

        jbnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnActualizar.setText("Actualizar");
        jbnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jbnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 100, 40));

        jbnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnEliminar.setText("Eliminar");
        jbnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jbnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 100, 40));

        jlbEditable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbEditable.setText("1");
        //jPanel1.add(jlbEditable, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 20, -1));

        jbnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jbnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jbnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(908, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbnActualizar;
    private javax.swing.JButton jbnEliminar;
    private javax.swing.JButton jbnRegistrar;
    private javax.swing.JButton jbnRegresar;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbProductos;
    private javax.swing.JComboBox<String> jcbVendedor;
    private javax.swing.JLabel jlbCliente;
    private javax.swing.JLabel jlbEditable;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbNumeroDeVenta;
    private javax.swing.JLabel jlbProductos;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JLabel jlbVendedor;
    private javax.swing.JTextField jtfDireccion;
    // End of variables declaration//GEN-END:variables
}
