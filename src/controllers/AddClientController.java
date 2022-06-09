package controllers;

import Interfaces.Operations;
import View.frmClientes;
import View.frmMenu;
import models.Client;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddClientController implements Operations {

    private final frmMenu frmMenu;
    private final frmClientes frmClientes;
    private final JTable jTable;
    private final DefaultTableModel model;
    private final String [] header = {"ID","Nombre","Apellido","Telefono","Dirección"};

    //private Object[][] info = new Object[][];
    public AddClientController(frmMenu frmMenu, frmClientes frmClientes){
        this.frmMenu = frmMenu;
        this.frmClientes = frmClientes;
        this.jTable = frmClientes.getTable();
        this.model = frmClientes.getModel();
        addListeners();
        showTable();
    }
    public void addListeners(){
        frmClientes.getJbnRegresar().addActionListener(regresar());
        frmClientes.getJbnRegistrar().addActionListener(registrar());
        frmClientes.getJbnEliminar().addActionListener(eliminar());
        frmClientes.getJbnActualizar().addActionListener(actualizar());
    }

    @Override
    public ActionListener registrar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = frmClientes.getJtfNombre().getText();
                String lastName = frmClientes.getJtfApellido().getText();
                String phone = frmClientes.getJtfTelefono().getText();
                String address = frmClientes.getJtfDireccion().getText();

                if (name.equals("") || lastName.equals("") || phone.equals("") || address.equals("")){
                    JOptionPane.showMessageDialog(frmClientes,"Por favor llene todos los campos","Falta llenar campos",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int id = frmMenu.getSizeClient();
                    Client client = new Client(id,name,lastName,phone,address);
                    //Actualizo la tabla cada que se registra
                    Object[] a = new Object[5];
                    a[0] = client.getId();
                    a[1] = client.getName();
                    a[2] = client.getLastname();
                    a[3] = client.getPhone();
                    a[4] = client.getAddress();
                    frmMenu.addClient(client,id);
                    JOptionPane.showMessageDialog(frmClientes,"Se registro correctamente el usuario","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
                    model.addRow(a);
                    jTable.setModel(model);
                    id++;
                    frmMenu.setCountClients(id);
                }
            }
        };
    }

    @Override
    public ActionListener actualizar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }

    @Override
    public ActionListener eliminar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }

    @Override
    public ActionListener regresar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmClientes.dispose();
                frmMenu.setVisible(true);
            }
        };
    }

    private void showTable() {
        model.setColumnIdentifiers(header);
        Object [][] info = new Object[frmMenu.getSizeClient()][5];
        for (int i = 0; i < frmMenu.getSizeClient(); i++) {
            Client client = frmMenu.getClients()[i];
            for (int j = 0; j < 1; j++) {
                info[i][0] = client.getId();
                info[i][1] = client.getName();
                info[i][2] = client.getLastname();
                info[i][3] = client.getPhone();
                info[i][4] = client.getAddress();
                model.addRow(info[i]);
            }
        }
        jTable.setModel(model);
    }
}
