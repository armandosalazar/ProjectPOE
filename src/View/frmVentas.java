package View;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.*;

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
        jPanel1.setLayout(null);

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoS.png"))); // NOI18N
        jlbLogo.setBounds(0,0,jlbLogo.getPreferredSize().width,jlbLogo.getPreferredSize().height);
        jPanel1.add(jlbLogo);

        jlbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(153, 0, 0));
        jlbTitulo.setText("Registro ventas");
        jlbTitulo.setBounds(350,40,jlbTitulo.getPreferredSize().width,jlbTitulo.getPreferredSize().height);
        jPanel1.add(jlbTitulo);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas2.png"))); // NOI18N
        jLabel1.setBounds(560,40,50,30);
        jPanel1.add(jLabel1);

        jlbNumeroDeVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbNumeroDeVenta.setText("Número de venta: ");
        jlbNumeroDeVenta.setBounds(40,90,jlbNumeroDeVenta.getPreferredSize().width,jlbNumeroDeVenta.getPreferredSize().height);
        jPanel1.add(jlbNumeroDeVenta);

        jlbProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbProductos.setText("Productos:");
        jlbProductos.setBounds(40,130,jlbProductos.getPreferredSize().width,jlbProductos.getPreferredSize().height);
        jPanel1.add(jlbProductos);

        jlbCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbCliente.setText("Cliente:");
        jlbCliente.setBounds(40,200,jlbCliente.getPreferredSize().width,jlbCliente.getPreferredSize().height);
        jPanel1.add(jlbCliente);

        jlbVendedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbVendedor.setText("Vendedor:");
        jlbVendedor.setBounds(40,270,jlbVendedor.getPreferredSize().width,jlbVendedor.getPreferredSize().height);
        jPanel1.add(jlbVendedor);

        jlbTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTotal.setText("Total:");
        jlbTotal.setBounds(40,360,jlbTotal.getPreferredSize().width,jlbTotal.getPreferredSize().height);
        jPanel1.add(jlbTotal);

        jtfDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDireccion.setBounds(100,360,80,jtfDireccion.getPreferredSize().height);
        jPanel1.add(jtfDireccion);

        jcbProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige:" }));
        jcbProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbProductos.setBounds(40,150,120,jcbProductos.getPreferredSize().height);
        jPanel1.add(jcbProductos);

        jcbCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige:" }));
        jcbCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbCliente.setBounds(40,220,120,jcbCliente.getPreferredSize().height);
        jPanel1.add(jcbCliente);

        jcbVendedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige:" }));
        jcbVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbVendedor.setBounds(40,290,120,jcbVendedor.getPreferredSize().height);
        jPanel1.add(jcbVendedor);

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
        jScrollPane1.setBounds(250,120,590,270);
        jPanel1.add(jScrollPane1);

        jbnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegistrar.setText("Registrar");
        jbnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnRegistrar.setBounds(210,460,jbnRegistrar.getPreferredSize().width,40);
        jPanel1.add(jbnRegistrar);

        jbnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnActualizar.setText("Actualizar");
        jbnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnActualizar.setBounds(380,460,100,40);
        jPanel1.add(jbnActualizar);

        jbnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnEliminar.setText("Eliminar");
        jbnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnEliminar.setBounds(580,460,100,40);
        jPanel1.add(jbnEliminar);

        jlbEditable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbEditable.setText("1");
        jlbEditable.setBounds(170,90,20,jlbEditable.getPreferredSize().height);
        jPanel1.add(jlbEditable);

        jbnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jbnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnRegresar.setBounds(850,0,40,40);
        jPanel1.add(jbnRegresar);

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
