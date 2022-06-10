package controllers;

import Interfaces.Operations;
import View.frmMenu;
import View.frmProductos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ProductsController implements Operations {

    private frmMenu frameMenu;
    private frmProductos frameProductos;
    public ProductsController(frmMenu frameMenu, frmProductos frameProductos){
        this.frameProductos = frameProductos;
        this.frameMenu = frameMenu;
        addListeners();
    }

    private void addListeners(){
        frameProductos.getJbnRegresar().addActionListener(regresar());
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
                frameProductos.dispose();
            }
        };
    }
}
