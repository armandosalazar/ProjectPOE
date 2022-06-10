package controllers;

import Interfaces.Operations;
import View.frmMenu;
import View.frmVendedores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellerController implements Operations {

    private frmMenu frameMenu;
    private frmVendedores frameVendedores;
    public SellerController(frmMenu frameMenu, frmVendedores frameVendedores){
        this.frameVendedores = frameVendedores;
        this.frameMenu = frameMenu;
    }

    @Override
    public ActionListener registrar() {
        return null;
    }

    @Override
    public ActionListener actualizar() {
        return null;
    }

    @Override
    public ActionListener eliminar() {
        return null;
    }

    @Override
    public ActionListener regresar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameMenu.setVisible(true);
                frameVendedores.dispose();
            }
        };
    }
}
