package controllers;

import View.frmClientes;
import View.frmMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController {

    private frmMenu frmMenu;
    private JMenuItem registroClientes;

    public MenuController(frmMenu frmMenu){
        this.frmMenu = frmMenu;
        registroClientes = frmMenu.getJmiVerCliente();
        addListeners();
    }

    public void addListeners(){
        registroClientes.addActionListener(registrarClientes());
    }

    public ActionListener registrarClientes(){
        return  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frmMenu.setVisible(false);
                frmClientes frmClientes = new frmClientes();
                frmClientes.setVisible(true);
                new AddClientController(frmMenu,frmClientes);
            }
        };
    }
}
