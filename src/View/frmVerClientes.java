
package View;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class frmVerClientes extends javax.swing.JFrame {

    //Objeto de la clase ImagenFondo
    ImagenFondo fondo;
    
    public frmVerClientes() {
                
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
        c = tk.createCustomCursor(img.getImage(), new Point(1,1), null);
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
        //jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoS.png"))); // NOI18N
        //jPanel1.add(jlbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(153, 0, 0));
        jlbTitulo.setText("Nuestros clientes");
        //jPanel1.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        //jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 50, 30));

        jbnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnLimpiar.setText("Limpiar");
        jbnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jbnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 110, 40));

        jbnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        jbnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jbnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 50, 40));

        jtfBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        //jPanel1.add(jtfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 40));

        jbnMostrarTodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnMostrarTodo.setText("Mostrar todo");
        jbnMostrarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jbnMostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, 40));

        jtContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtContenido);

        //jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 740, 240));

        jbnRegresar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jbnRegresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //jPanel1.add(jbnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(824, 539));
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
            java.util.logging.Logger.getLogger(frmVerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVerClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerClientes().setVisible(true);
            }
        });
    }

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
}
