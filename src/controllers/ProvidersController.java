package controllers;

import Interfaces.Operations;
import View.frmMenu;
import View.frmProveedores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProvidersController implements Operations {

    private frmMenu frameMenu;
    private frmProveedores frameProveedores;
    public ProvidersController(frmMenu frmMenu, frmProveedores frmProveedores){
        this.frameMenu = frmMenu;
        this.frameProveedores = frmProveedores;
        addListeners();
    }

    private void addListeners(){
        frameProveedores.getJbnRegresar().addActionListener(regresar());
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
                frameProveedores.dispose();
                frameMenu.setVisible(true);
            }
        };
    }
}
