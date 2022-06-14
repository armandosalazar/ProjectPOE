package View;

import models.Provider;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class frmProductos extends javax.swing.JFrame {

    //Objeto de la clase ImagenFondo
    ImagenFondo fondo;

    public frmProductos() {

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
        Grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbnRegistrar = new javax.swing.JButton();
        jlbID = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbPrecio = new javax.swing.JLabel();
        jlbCantidad = new javax.swing.JLabel();
        jlbProveedor = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jrbOpcion1 = new javax.swing.JRadioButton();
        jcbProveedor = new javax.swing.JComboBox<Provider>();
        jrbOpcion2 = new javax.swing.JRadioButton();
        jrbOpcion3 = new javax.swing.JRadioButton();
        jtfPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlbEditable = new javax.swing.JLabel();
        jbnActualizar = new javax.swing.JButton();
        jbnEliminar = new javax.swing.JButton();
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
        jlbTitulo.setText("Sistema de productos");
        jlbTitulo.setBounds(310,30,jlbTitulo.getPreferredSize().width,jlbTitulo.getPreferredSize().height);
        jPanel1.add(jlbTitulo);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/catalogo.png"))); // NOI18N
        jLabel1.setBounds(600,30,50,30);
        jPanel1.add(jLabel1);

        jbnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegistrar.setText("Registrar");
        jbnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnRegistrar.setBounds(140,420,jbnRegistrar.getPreferredSize().width,40);
        jPanel1.add(jbnRegistrar);

        jlbID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbID.setText("ID: ");
        jlbID.setBounds(40,110,jlbID.getPreferredSize().width,jlbID.getPreferredSize().height);
        jPanel1.add(jlbID);

        jlbNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbNombre.setText("Nombre:");
        jlbNombre.setBounds(40,150,jlbNombre.getPreferredSize().width,jlbID.getPreferredSize().height);
        jPanel1.add(jlbNombre);

        jlbPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbPrecio.setText("Precio:");
        jlbPrecio.setBounds(40,200,jlbPrecio.getPreferredSize().width,jlbPrecio.getPreferredSize().height);
        jPanel1.add(jlbPrecio);

        jlbCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbCantidad.setText("Cantidad:");
        jlbCantidad.setBounds(40,250,jlbCantidad.getPreferredSize().width,jlbCantidad.getPreferredSize().height);
        jPanel1.add(jlbCantidad);

        jlbProveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbProveedor.setText("Proveedor:");
        jlbProveedor.setBounds(170,250,jlbProveedor.getPreferredSize().width,jlbProveedor.getPreferredSize().height);
        jPanel1.add(jlbProveedor);

        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.setBounds(140,150,200,jtfNombre.getPreferredSize().height);
        jPanel1.add(jtfNombre);

        Grupo1.add(jrbOpcion1);
        jrbOpcion1.setText("1");
        jrbOpcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbOpcion1.setBounds(40,280,jrbOpcion1.getPreferredSize().width,jrbOpcion1.getPreferredSize().height);
        jrbOpcion1.setBackground(new Color(254, 109, 2));
        jPanel1.add(jrbOpcion1);

        jcbProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        //jcbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige:" }));
        jcbProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbProveedor.setBounds(170,280,170,jcbProveedor.getPreferredSize().height);
        jPanel1.add(jcbProveedor);

        Grupo1.add(jrbOpcion2);
        jrbOpcion2.setText("12");
        jrbOpcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbOpcion2.setBounds(40,310,jrbOpcion2.getPreferredSize().width,jrbOpcion2.getPreferredSize().height);
        jrbOpcion2.setBackground(new Color(254, 109, 2));
        jPanel1.add(jrbOpcion2);

        Grupo1.add(jrbOpcion3);
        jrbOpcion3.setText("24");
        jrbOpcion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbOpcion3.setBounds(40,340,jrbOpcion3.getPreferredSize().width,jrbOpcion3.getPreferredSize().height);
        jrbOpcion3.setBackground(new Color(254, 109, 2));
        jPanel1.add(jrbOpcion3);

        jtfPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfPrecio.setBounds(140,200,80,jtfPrecio.getPreferredSize().height);
        jPanel1.add(jtfPrecio);

        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setBounds(392,120,490,240);
        jPanel1.add(jScrollPane1);

        jlbEditable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbEditable.setText("1");
        jlbEditable.setBounds(70,110,20,jlbEditable.getPreferredSize().height);
        jPanel1.add(jlbEditable);

        jbnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnActualizar.setText("Actualizar");
        jbnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnActualizar.setBounds(350,420,jbnActualizar.getPreferredSize().width,40);
        jPanel1.add(jbnActualizar);

        jbnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnEliminar.setText("Eliminar");
        jbnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnEliminar.setBounds(580,420,100,40);
        jPanel1.add(jbnEliminar);

        jbnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jbnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnRegresar.setBounds(850,0,40,40);
        jPanel1.add(jbnRegresar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(918, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
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
    private JComboBox<Provider>jcbProveedor;
    private javax.swing.JLabel jlbCantidad;
    private javax.swing.JLabel jlbEditable;
    private javax.swing.JLabel jlbID;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbPrecio;
    private javax.swing.JLabel jlbProveedor;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JRadioButton jrbOpcion1;
    private javax.swing.JRadioButton jrbOpcion2;
    private javax.swing.JRadioButton jrbOpcion3;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;

    private DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    // End of variables declaration//GEN-END:variables


    public JButton getJbnActualizar() {
        return jbnActualizar;
    }

    public JButton getJbnEliminar() {
        return jbnEliminar;
    }

    public JButton getJbnRegistrar() {
        return jbnRegistrar;
    }

    public JButton getJbnRegresar() {
        return jbnRegresar;
    }

    public JComboBox<Provider>getJcbProveedor() {
        return jcbProveedor;
    }

    public JTextField getJtfNombre() {
        return jtfNombre;
    }

    public JTextField getJtfPrecio() {
        return jtfPrecio;
    }

    public JRadioButton getJrbOpcion1() {
        return jrbOpcion1;
    }

    public JRadioButton getJrbOpcion2() {
        return jrbOpcion2;
    }

    public JRadioButton getJrbOpcion3() {
        return jrbOpcion3;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public ButtonGroup getGrupo1() {
        return Grupo1;
    }
}
