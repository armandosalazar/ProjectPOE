package View;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class frmMenu extends javax.swing.JFrame {

    ImagenFondo fondo;

    public frmMenu() {
        //Instanciar objetos de ImagenFondo
        fondo = new ImagenFondo("src/Imagenes/fondoMenuPrincipal.jpg");
        this.setContentPane(fondo);

        initComponents();

        //Definir el objeto para la imagen personalizada
        ImageIcon img = new ImageIcon("src/Imagenes/hammer.png");
        //Crear un nuevo objeto de clase Cursor
        Cursor c;
        Toolkit tk = Toolkit.getDefaultToolkit();
        //Ajustar la imagen como cursor
        c = tk.createCustomCursor(img.getImage(), new Point(1, 1), null);
        //Visualizar el cursor personalizado
        setCursor(c);
        jlbLogo.setCursor(c);
    }

    @Override
    public Image getIconImage() {
        //Se elige de los recursos de imágenes, la que se utilizará como icono
        Image valorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
        return valorRetorno;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlbDireccion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbLogo = new javax.swing.JLabel();
        jlbTelefono = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbWhatsapp = new javax.swing.JLabel();
        jlbMessenger = new javax.swing.JLabel();
        jlbInstagram = new javax.swing.JLabel();
        jlbFacebook = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProveedores = new javax.swing.JMenu();
        jmiVerProveedor = new javax.swing.JMenuItem();
        jmiProductosProveedor = new javax.swing.JMenuItem();
        jmVentas = new javax.swing.JMenu();
        jmiVerVendedor = new javax.swing.JMenuItem();
        jmiVentasVendedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiVerVenta = new javax.swing.JMenuItem();
        jmiEditarVenta = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenu();
        jmiVerCliente = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmiComprasCliente = new javax.swing.JMenuItem();
        jmCatalogo = new javax.swing.JMenu();
        jmiVerProducto = new javax.swing.JMenuItem();
        jmiEditarProducto = new javax.swing.JMenuItem();
        jmUsuarios = new javax.swing.JMenu();
        jmiVerUsuarios = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jmiRegresar = new javax.swing.JMenuItem();
        jmiSalr = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accesorios BEA");
        setIconImage(getIconImage());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("44638 Guadalajara, Jal.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jlbDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbDireccion.setText("C. Nueva Escocia 1885,");
        jPanel1.add(jlbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Dirección: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tiras-de-colores-en-colores-pastel-37137957.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 60));

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jlbLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jlbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jlbTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTelefono.setText("Teléfono:");
        jPanel1.add(jlbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("33 3641 3250");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tiras-de-colores-en-colores-pastel-37137957.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, 40));

        jlbWhatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whatsapp.png"))); // NOI18N
        jlbWhatsapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jlbWhatsapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        jlbMessenger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/messenger.png"))); // NOI18N
        jlbMessenger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jlbMessenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        jlbInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/instagram.png"))); // NOI18N
        jlbInstagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jlbInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jlbFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook.png"))); // NOI18N
        jlbFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jlbFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jmProveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        jmProveedores.setText("  Proveedores  ");
        jmProveedores.setBorderPainted(true);
        jmProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmProveedores.setOpaque(true);

        jmiVerProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jmiVerProveedor.setText("Sistema de proveedores");
        jmiVerProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmProveedores.add(jmiVerProveedor);

        jmiProductosProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar.png"))); // NOI18N
        jmiProductosProveedor.setText("Ver proveedores");
        jmiProductosProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmProveedores.add(jmiProductosProveedor);

        jMenuBar1.add(jmProveedores);

        jmVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas2.png"))); // NOI18N
        jmVentas.setText("  Ventas  ");
        jmVentas.setBorderPainted(true);
        jmVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmVentas.setOpaque(true);

        jmiVerVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jmiVerVendedor.setText("Sistema de vendedores");
        jmiVerVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmVentas.add(jmiVerVendedor);

        jmiVentasVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar.png"))); // NOI18N
        jmiVentasVendedor.setText("Ver vendedores");
        jmiVentasVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmVentas.add(jmiVentasVendedor);
        jmVentas.add(jSeparator1);

        jmiVerVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        jmiVerVenta.setText("Sistema de ventas");
        jmiVerVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmVentas.add(jmiVerVenta);

        jmiEditarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/see.png"))); // NOI18N
        jmiEditarVenta.setText("Ver ventas");
        jmiEditarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmVentas.add(jmiEditarVenta);

        jMenuBar1.add(jmVentas);

        jmClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        jmClientes.setText("  Clientes  ");
        jmClientes.setBorderPainted(true);
        jmClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmClientes.setOpaque(true);

        jmiVerCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jmiVerCliente.setText("Sistema de clientes");
        jmiVerCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmClientes.add(jmiVerCliente);
        jmClientes.add(jSeparator4);

        jmiComprasCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar.png"))); // NOI18N
        jmiComprasCliente.setText("Ver clientes");
        jmiComprasCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmClientes.add(jmiComprasCliente);

        jMenuBar1.add(jmClientes);

        jmCatalogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/catalogo.png"))); // NOI18N
        jmCatalogo.setText("  Catálogo  ");
        jmCatalogo.setBorderPainted(true);
        jmCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmCatalogo.setOpaque(true);

        jmiVerProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        jmiVerProducto.setText("Sistema de Productos");
        jmiVerProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmCatalogo.add(jmiVerProducto);

        jmiEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/see.png"))); // NOI18N
        jmiEditarProducto.setText("Ver productos");
        jmiEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmCatalogo.add(jmiEditarProducto);

        jMenuBar1.add(jmCatalogo);

        jmUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        jmUsuarios.setText("  Usuario  ");
        jmUsuarios.setBorderPainted(true);
        jmUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmUsuarios.setOpaque(true);

        jmiVerUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar.png"))); // NOI18N
        jmiVerUsuarios.setText("Usuarios");
        jmiVerUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmUsuarios.add(jmiVerUsuarios);
        jmUsuarios.add(jSeparator5);

        jmiRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userSmall.png"))); // NOI18N
        jmiRegresar.setText("Regresar  a iniciar sesión");
        jmiRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmUsuarios.add(jmiRegresar);

        jmiSalr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/off.png"))); // NOI18N
        jmiSalr.setText("Salir");
        jmiSalr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmUsuarios.add(jmiSalr);

        jMenuBar1.add(jmUsuarios);

        setJMenuBar(jMenuBar1);

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

        setSize(new java.awt.Dimension(545, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel jlbDireccion;
    private javax.swing.JLabel jlbFacebook;
    private javax.swing.JLabel jlbInstagram;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbMessenger;
    private javax.swing.JLabel jlbTelefono;
    private javax.swing.JLabel jlbWhatsapp;
    private javax.swing.JMenu jmCatalogo;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmProveedores;
    private javax.swing.JMenu jmUsuarios;
    private javax.swing.JMenu jmVentas;
    private javax.swing.JMenuItem jmiComprasCliente;
    private javax.swing.JMenuItem jmiEditarProducto;
    private javax.swing.JMenuItem jmiEditarVenta;
    private javax.swing.JMenuItem jmiProductosProveedor;
    private javax.swing.JMenuItem jmiRegresar;
    private javax.swing.JMenuItem jmiSalr;
    private javax.swing.JMenuItem jmiVentasVendedor;
    private javax.swing.JMenuItem jmiVerCliente;
    private javax.swing.JMenuItem jmiVerProducto;
    private javax.swing.JMenuItem jmiVerProveedor;
    private javax.swing.JMenuItem jmiVerUsuarios;
    private javax.swing.JMenuItem jmiVerVendedor;
    private javax.swing.JMenuItem jmiVerVenta;
    // End of variables declaration//GEN-END:variables
}
