
package View;

import Interfaces.GetInfo;
import models.Provider;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class frmVerProveedores extends javax.swing.JFrame implements GetInfo {

    //Objeto de la clase ImagenFondo
    ImagenFondo fondo;
    private frmMenu menu;
    private final String[] header = {"ID", "Nombre", "Apellido", "Teléfono", "Dirección"};

    public frmVerProveedores(frmMenu menu) {

        //Instanciar objetos de ImagenFondo
        fondo = new ImagenFondo("src/Imagenes/fondoProveedores.jpg");
        this.setContentPane(fondo);
        this.menu = menu;

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

        getData();
        addEvents();
    }

    public void addEvents() {
        jbnMostrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getData();
            }
        });

        jbnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtContenido.setModel(new DefaultTableModel(new Object[][]{}, header));
            }
        });

        jbnRegresar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.setVisible(true);
                dispose();
            }

        });

        jbnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = new DefaultTableModel(new Object[][]{}, header);
                jtContenido.setModel(model);
                String data = jtfBuscar.getText();
                boolean state = false;
                for (Provider provide : menu.getProviders()) {
                    if (provide != null) {
                        if (data.equals(String.valueOf(provide.getId()))) {
                            model.addRow(new Object[]{provide.getId(), provide.getName(), provide.getLastname(), provide.getPhone(), provide.getAddress()});
                            state = true;
                            return;
                        }
                        if (data.equals(String.valueOf(provide.getName()))) {
                            model.addRow(new Object[]{provide.getId(), provide.getName(), provide.getLastname(), provide.getPhone(), provide.getAddress()});
                            state = true;
                            return;
                        }
                        if (data.equals(String.valueOf(provide.getLastname()))) {
                            model.addRow(new Object[]{provide.getId(), provide.getName(), provide.getLastname(), provide.getPhone(), provide.getAddress()});
                            state = true;
                            return;
                        }
                    }
                }
                if (!state) JOptionPane.showMessageDialog(null, "Elemento no encontrado", "Sin resultados", JOptionPane.ERROR_MESSAGE);
                jtContenido.setModel(model);
            }
        });
    }

    public void getData() {
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, header);
        jtContenido.setModel(model);
        for (Provider provide : menu.getProviders()) {
            if (provide != null) {
                model.addRow(new Object[]{provide.getId(), provide.getName(), provide.getLastname(), provide.getPhone(), provide.getAddress()});
            }
        }
        jtContenido.setModel(model);
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
        jbnLimpiar = new javax.swing.JButton();
        jbnBuscar = new javax.swing.JButton();
        jtfBuscar = new javax.swing.JTextField();
        jbnMostrarTodo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtContenido = new javax.swing.JTable();
        jbnRegresar1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver Proveedores");
        setIconImage(getIconImage());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoS.png"))); // NOI18N
        jlbLogo.setBounds(0, 0, jlbLogo.getPreferredSize().width, jlbLogo.getPreferredSize().height);
        jPanel1.add(jlbLogo);

        jlbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(153, 0, 0));
        jlbTitulo.setText("Nuestros proveedores");
        jlbTitulo.setBounds(260, 50, jlbTitulo.getPreferredSize().width, jlbTitulo.getPreferredSize().height);
        jPanel1.add(jlbTitulo);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        jLabel1.setBounds(480, 50, jLabel1.getPreferredSize().width, jLabel1.getPreferredSize().height);
        jPanel1.add(jLabel1);

        jbnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnLimpiar.setText("Limpiar");
        jbnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnLimpiar.setBounds(460, 430, 100, 40);
        jPanel1.add(jbnLimpiar);

        jbnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        jbnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnBuscar.setBounds(230, 110, 50, 40);
        jPanel1.add(jbnBuscar);

        jtfBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfBuscar.setBounds(30, 110, 200, 40);
        jPanel1.add(jtfBuscar);

        jbnMostrarTodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnMostrarTodo.setText("Mostrar todo");
        jbnMostrarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnMostrarTodo.setBounds(260, 430, jbnMostrarTodo.getPreferredSize().width, 40);
        jPanel1.add(jbnMostrarTodo);

        jScrollPane2.setViewportView(jtContenido);
        jScrollPane2.setBounds(30, 160, 750, 240);
        jPanel1.add(jScrollPane2);

        jbnRegresar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jbnRegresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnRegresar1.setBounds(770, 0, 40, 40);
        jPanel1.add(jbnRegresar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(825, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbnBuscar;
    private javax.swing.JButton jbnLimpiar;
    private javax.swing.JButton jbnMostrarTodo;
    private javax.swing.JButton jbnRegresar1;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JTable jtContenido;
    private javax.swing.JTextField jtfBuscar;
    // End of variables declaration//GEN-END:variables

    public JTable getJtContenido() {
        return jtContenido;
    }

}
