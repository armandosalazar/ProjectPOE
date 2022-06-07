package controllers;

import View.frmUser;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserController {

    private final JLabel jlbId;
    private final JLabel jlbName;
    private final JLabel jlbPass;
    private final JLabel jlbIniciarSesion;
    private final JLabel jlbRegistrarse;
    private final JLabel jlbLastName, jlbPosition, jlbTel;
    private final JTextField  jtfName, jtfTel, jtfPosition, jtfLastName,jtfId;
    private final JPasswordField jpfPass;
    private final frmUser frmUser;

    public UserController(frmUser frmUser) {
        this.frmUser = frmUser;

        jtfLastName = frmUser.getJtfApellidos();
        jtfName = frmUser.getJtfNombre();
        jpfPass = frmUser.getJpfContrasena();
        jtfPosition = frmUser.getJtfPuesto();
        jtfTel = frmUser.getJtfTelefono();
        jtfId = frmUser.getJtfID();

        jlbId = frmUser.getJlbID();
        jlbName = frmUser.getJlbNombre();
        jlbPass = frmUser.getJlbContrasena();

        jlbLastName = frmUser.getJlbApellidos();
        jlbTel = frmUser.getJlbTelefono();
        jlbPosition = frmUser.getJlbPuesto();

        jlbIniciarSesion = frmUser.getJlbIniciarSesion();
        jlbRegistrarse = frmUser.getJlbRegistrase();
        addListeners();
        setDefaultValues();
    }
    private void addListeners() {
        jlbIniciarSesion.addMouseListener(btnIniciarSesion());
        jlbRegistrarse.addMouseListener(btnRegistrarse());
    }

    private MouseAdapter btnIniciarSesion(){
        return  new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new Thread() {
                    @Override public void run () {
                        SwingUtilities.invokeLater(new Runnable(){
                            @Override public void run() {
                                hideComponents();
                                jtfId.setVisible(true);
                                jlbId.setVisible(true);

                                jpfPass.setVisible(true);
                                jlbPass.setVisible(true);

                                jlbRegistrarse.setLocation(140,380);
                                frmUser.setSize(400,450);
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
        jtfId.setVisible(false);
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

    private MouseAdapter btnRegistrarse(){
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new Thread() {
                    @Override public void run () {
                        SwingUtilities.invokeLater(new Runnable(){
                            @Override public void run() {
                              showAllComponents();
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
        jtfId.setVisible(true);
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

        jlbRegistrarse.setLocation(frmUser.getDefaultRegistrarPosition());
        frmUser.setSize(frmUser.getDefaultFrameSize().x, frmUser.getDefaultFrameSize().y);
    }
    private void setDefaultValues(){
        hideComponents();
        jlbRegistrarse.setLocation(140,300);
        frmUser.setSize(400,400);
    }

}
