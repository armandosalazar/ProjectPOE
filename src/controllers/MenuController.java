package controllers;

import View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController {

    private final frmMenu frmMenu;
    private final JMenuItem registroClientes;
    private final JMenuItem registroProveedores;
    private final JMenuItem registroVentas;
    private final JMenuItem registroProductos;
    private final JMenuItem registroVendedores;

    public MenuController(frmMenu frmMenu){
        this.frmMenu = frmMenu;
        registroClientes = frmMenu.getJmiVerCliente();
        registroProveedores = frmMenu.getJmiVerProveedor();
        registroProductos = frmMenu.getJmiVerProducto();
        registroVentas = frmMenu.getJmiVerVenta();
        registroVendedores = frmMenu.getJmiVerVendedor();
        addListeners();
    }

    public void addListeners(){
        registroClientes.addActionListener(registrarClientes());
        registroVendedores.addActionListener(registrarVendedor());
        registroVentas.addActionListener(registrarVenta());
        registroProductos.addActionListener(registrarProducto());
        registroProveedores.addActionListener(registrarProveedor());
    }

    private ActionListener registrarClientes(){
        return  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frmMenu.setVisible(false);
                frmClientes frmClientes = new frmClientes();
                frmClientes.setVisible(true);
                new ClientController(frmMenu,frmClientes);
            }
        };
    }

    private ActionListener registrarProveedor(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frmProveedores frmProveedor = new frmProveedores();
                frmProveedor.setVisible(true);
                new ProvidersController(frmMenu,frmProveedor);
            }
        };
    }

    private ActionListener registrarVenta(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frmVentas frmVentas = new frmVentas();
                frmVentas.setVisible(true);
                new SalesController(frmMenu,frmVentas);
            }
        };
    }

    private ActionListener registrarProducto(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(true);
                frmProductos frmProductos = new frmProductos();
                frmProductos.setVisible(true);
                new ProductsController(frmMenu,frmProductos);
            }
        };
    }

    private ActionListener registrarVendedor(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frmVendedores frmVendedores = new frmVendedores();
                frmVendedores.setVisible(true);
                new SellerController(frmMenu,frmVendedores);
            }
        };
    }
}
