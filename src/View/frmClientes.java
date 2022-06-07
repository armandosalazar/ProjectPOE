package View;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class frmClientes extends javax.swing.JFrame {

    //Objeto de la clase ImagenFondo
    ImagenFondo fondo;

    public frmClientes() {

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
        jbnRegresar = new javax.swing.JButton();
        jbnRegistrar = new javax.swing.JButton();
        jlbID = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbApellido = new javax.swing.JLabel();
        jlbTeléfono = new javax.swing.JLabel();
        jlbDireccion = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbnActualizar = new javax.swing.JButton();
        jbnEliminar = new javax.swing.JButton();
        jlbEditable = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver Proveedores");
        setIconImage(getIconImage());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoS.png"))); // NOI18N
        jPanel1.add(jlbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(153, 0, 0));
        jlbTitulo.setText("Sistema de clientes");
        jPanel1.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 50, 30));

        jbnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jbnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jbnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 40));

        jbnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegistrar.setText("Registrar");
        jbnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jbnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, 40));

        jlbID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbID.setText("ID: ");
        jPanel1.add(jlbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jlbNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbNombre.setText("Nombre:");
        jPanel1.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jlbApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbApellido.setText("Apellido:");
        jPanel1.add(jlbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jlbTeléfono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTeléfono.setText("Teléfono:");
        jPanel1.add(jlbTeléfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jlbDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbDireccion.setText("Dirección:");
        jPanel1.add(jlbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, -1));

        jtfApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, -1));

        jtfTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 200, -1));

        jtfDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 200, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, 240));

        jbnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnActualizar.setText("Actualizar");
        jbnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jbnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 100, 40));

        jbnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnEliminar.setText("Eliminar");
        jbnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jbnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 100, 40));

        jlbEditable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbEditable.setText("1");
        jPanel1.add(jlbEditable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(901, 554));
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
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientes().setVisible(true);
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
    private javax.swing.JLabel jlbApellido;
    private javax.swing.JLabel jlbDireccion;
    private javax.swing.JLabel jlbEditable;
    private javax.swing.JLabel jlbID;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbTeléfono;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
