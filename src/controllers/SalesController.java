package controllers;

import Interfaces.Operations;
import View.frmMenu;
import View.frmVentas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesController implements Operations {

    private frmMenu frameMenu;
    private frmVentas frameVentas;
    public SalesController(frmMenu frameMenu, frmVentas frameVentas){
        this.frameMenu = frameMenu;
        this.frameVentas = frameVentas;
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
                frameVentas.dispose();
                frameMenu.setVisible(true);
            }
        };
    }
}
