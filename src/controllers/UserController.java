package controllers;

import Lists.UsersList;
import View.frmMenu;
import View.frmUser;

import javax.swing.*;
import java.awt.event.*;

public class UserController {

    private final JLabel jlbId;
    private final JLabel jlbName;
    private final JLabel jlbPass;
    private final JLabel jlbIniciarSesion;
    private final JLabel jlbRegistrarse;
    private final JLabel jlbLastName, jlbPosition, jlbTel;
    private final JTextField  jtfName, jtfTel, jtfPosition, jtfLastName, jtfUser;
    private final JPasswordField jpfPass;
    private final frmUser frmUser;
    private final JButton jbnIngresar, jbnRegistrar, jbnCancelar;
    private int id = 0;
    private UsersList usersList;

    public UserController(frmUser frmUser) {
        this.frmUser = frmUser;
        usersList = new UsersList();

        jtfLastName = frmUser.getJtfLastName();
        jtfName = frmUser.getJtfNombre();
        jpfPass = frmUser.getJpfContrasena();
        jtfPosition = frmUser.getJtfPuesto();
        jtfTel = frmUser.getJtfTelefono();
        jtfUser = frmUser.getJtfUsuario();

        jlbId = frmUser.getJlbUsuario();
        jlbName = frmUser.getJlbNombre();
        jlbPass = frmUser.getJlbContrasena();

        jlbLastName = frmUser.getJlbLastName();
        jlbTel = frmUser.getJlbTelefono();
        jlbPosition = frmUser.getJlbPuesto();

        jlbIniciarSesion = frmUser.getJlbIniciarSesion();
        jlbRegistrarse = frmUser.getJlbRegistrase();
        jbnRegistrar = frmUser.getJbnRegistrarse();
        jbnCancelar = frmUser.getJbnCancelar();
        jbnIngresar = frmUser.getJbnIngresar();

        addListeners();
        setDefaultValues();
    }
    private void addListeners() {
        jlbIniciarSesion.addMouseListener(lblIniciarSesion());
        jlbRegistrarse.addMouseListener(lblRegistrarse());
        jbnIngresar.addActionListener(ingresar());
        jbnCancelar.addActionListener(cancelar());
        jbnRegistrar.addActionListener(registrar());
        frmUser.getjButton1().addActionListener(salir());
    }

    private MouseAdapter lblIniciarSesion(){
        return  new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new Thread() {
                    @Override public void run () {
                        SwingUtilities.invokeLater(new Runnable(){
                            @Override public void run() {
                                frmUser.setVisible(false);
                                hideComponents();
                                jtfUser.setVisible(true);
                                jlbId.setVisible(true);

                                jpfPass.setVisible(true);
                                jlbPass.setVisible(true);
                                jbnIngresar.setVisible(true);
                                jbnCancelar.setLocation(220,380);
                                jbnCancelar.setVisible(true);

                                jlbRegistrarse.setLocation(140,440);
                                frmUser.setSize(400,510);
                                frmUser.setVisible(true);
                            }
                        });
                    }
                }.start();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }
        };
    }
    public void hideComponents(){
        jbnCancelar.setVisible(false);
        jbnRegistrar.setVisible(false);
        jbnIngresar.setVisible(false);
        jtfUser.setVisible(false);
        jlbId.setVisible(false);

        jlbName.setVisible(false);
        jtfName.setVisible(false);

        jtfLastName.setVisible(false);
        jlbLastName.setVisible(false);

        jlbPass.setVisible(false);
        jpfPass.setVisible(false);

        jlbPosition.setVisible(false);
        jtfPosition.setVisible(false);

        jlbTel.setVisible(false);
        jtfTel.setVisible(false);
    }

    private MouseAdapter lblRegistrarse(){
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new Thread() {
                    @Override public void run () {
                        SwingUtilities.invokeLater(new Runnable(){
                            @Override public void run() {
                                frmUser.setVisible(false);
                                showAllComponents();
                                frmUser.setVisible(true);
                            }
                        });
                    }
                }.start();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }
        };
    }

    public void showAllComponents(){
        jbnIngresar.setVisible(false);
        jtfUser.setVisible(true);
        jlbId.setVisible(true);

        jlbName.setVisible(true);
        jtfName.setVisible(true);

        jtfLastName.setVisible(true);
        jlbLastName.setVisible(true);

        jlbPass.setVisible(true);
        jpfPass.setVisible(true);

        jlbPosition.setVisible(true);
        jtfPosition.setVisible(true);

        jlbTel.setVisible(true);
        jtfTel.setVisible(true);
        jbnCancelar.setVisible(true);
        jbnRegistrar.setVisible(true);

        jlbRegistrarse.setLocation(frmUser.getDefaultRegistrarPosition());
        jbnCancelar.setLocation(220,580);
        frmUser.setSize(frmUser.getDefaultFrameSize().x, frmUser.getDefaultFrameSize().y);
    }
    private void setDefaultValues(){
        hideComponents();
        jlbRegistrarse.setLocation(140,300);
        frmUser.setSize(400,400);
    }

    private ActionListener ingresar(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = jtfUser.getText();
                String pass = String.valueOf(jpfPass.getPassword());

                if (user.equals("") || pass.equals("")){
                    JOptionPane.showMessageDialog(frmUser, "Ingrese el Usuario y/o la Contraseña", "Campos en blanco", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    if ( usersList.compareElements(user,pass)){
                        frmUser.setVisible(false);
                        frmMenu frmMenu = new frmMenu();
                        new MenuController(frmMenu);
                        frmMenu.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(frmUser,"Usuario o contraseña invalidos","Datos invalidos",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        };
    }

    private ActionListener cancelar(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setDefaultValues();
                frmUser.cleanAllFields();
            }
        };
    }

    private ActionListener registrar(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String user = jtfUser.getText();
                String pass = String.valueOf(jpfPass.getPassword());
                String name = jtfName.getText();
                String lastName = jtfLastName.getText();
                String phone = jtfTel.getText();
                String type = jtfPosition.getText();

                usersList.add(id,user,pass,name,lastName,phone,type);
                id++;
                frmUser.cleanAllFields();
                JOptionPane.showMessageDialog(frmUser,"Registro exitoso");
            }
        };
    }

    private ActionListener salir(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int respuesta = JOptionPane.showConfirmDialog(frmUser,"¿Desea salir?","Confirmación para salir",JOptionPane.YES_NO_CANCEL_OPTION);
                if (respuesta == JOptionPane.YES_OPTION){
                    frmUser.dispose();
                }
            }
        };
    }

}
