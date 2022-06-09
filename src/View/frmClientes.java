package View;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class frmClientes extends javax.swing.JFrame {

    //Objeto de la clase ImagenFondo
    ImagenFondo fondo;
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
    private DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

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
        jPanel1.setLayout(null);

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoS.png")));// NOI18N
        jlbLogo.setBounds(0,0,jlbLogo.getPreferredSize().width,jlbLogo.getPreferredSize().height);
        jPanel1.add(jlbLogo);

        jlbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(153, 0, 0));
        jlbTitulo.setText("Sistema de clientes");
        jlbTitulo.setBounds(350,40,jlbTitulo.getPreferredSize().width,jlbTitulo.getPreferredSize().height);
        jPanel1.add(jlbTitulo);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        jLabel1.setBounds(570,40,50,30);
        jPanel1.add(jLabel1);

        jbnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jbnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnRegresar.setBounds(840,0,40,40);;
        jPanel1.add(jbnRegresar);

        jbnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegistrar.setText("Registrar");
        jbnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnRegistrar.setBounds(160,440,100,40);
        jPanel1.add(jbnRegistrar);

        jlbID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbID.setText("ID: ");
        jlbID.setBounds(40,100, jlbID.getPreferredSize().width,jlbID.getPreferredSize().height);
        jPanel1.add(jlbID);


        jlbNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbNombre.setText("Nombre:");
        jlbNombre.setBounds(40,140,jlbNombre.getPreferredSize().width,jlbNombre.getPreferredSize().height);
        jPanel1.add(jlbNombre);

        jlbApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbApellido.setText("Apellido:");
        jlbApellido.setBounds(40,210,jlbApellido.getPreferredSize().width,jlbApellido.getPreferredSize().height);
        jPanel1.add(jlbApellido);

        jlbTeléfono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTeléfono.setText("Teléfono:");
        jlbTeléfono.setBounds(40,280,jlbTeléfono.getPreferredSize().width,jlbTeléfono.getPreferredSize().height);
        jPanel1.add(jlbTeléfono);

        jlbDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbDireccion.setText("Dirección:");
        jlbDireccion.setBounds(40,350,jlbDireccion.getPreferredSize().width,jlbDireccion.getPreferredSize().height);
        jPanel1.add(jlbDireccion);

        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setBounds(140,140,200,jtfNombre.getPreferredSize().height);
        jPanel1.add(jtfNombre);

        jtfApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfApellido.setBounds(140,210,200,jtfApellido.getPreferredSize().height);
        jPanel1.add(jtfApellido);

        jtfTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfTelefono.setBounds(140,280,200,jtfTelefono.getPreferredSize().height);
        jPanel1.add(jtfTelefono);

        jtfDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDireccion.setBounds(140,350,200,jtfDireccion.getPreferredSize().height);
        jPanel1.add(jtfDireccion);

        //Le quite el model
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable1.setModel(model);
        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setBounds(390,140,jScrollPane1.getPreferredSize().width,240);
        jPanel1.add(jScrollPane1);

        jbnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnActualizar.setText("Actualizar");
        jbnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnActualizar.setBounds(400,440,jbnActualizar.getPreferredSize().width,40);
        jPanel1.add(jbnActualizar);

        jbnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnEliminar.setText("Eliminar");
        jbnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnEliminar.setBounds(650,440,100,40);
        jPanel1.add(jbnEliminar);

        jlbEditable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbEditable.setText("1");
        jlbEditable.setBounds(70,100,jlbEditable.getPreferredSize().width,jlbEditable.getPreferredSize().height);
        jPanel1.add(jlbEditable);

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

    public JButton getJbnRegresar() {
        return jbnRegresar;
    }

    public JButton getJbnActualizar() {
        return jbnActualizar;
    }

    public JButton getJbnEliminar() {
        return jbnEliminar;
    }

    public JButton getJbnRegistrar() {
        return jbnRegistrar;
    }

    public JTable getTable(){
        return jTable1;
    }
    public JTextField getJtfApellido() {
        return jtfApellido;
    }

    public JTextField getJtfDireccion() {
        return jtfDireccion;
    }

    public JTextField getJtfNombre() {
        return jtfNombre;
    }

    public JTextField getJtfTelefono() {
        return jtfTelefono;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    // End of variables declaration//GEN-END:variables
}
