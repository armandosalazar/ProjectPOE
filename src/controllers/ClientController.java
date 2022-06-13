package controllers;

import Interfaces.Operations;
import View.frmClientes;
import View.frmMenu;
import models.Client;
import models.Provider;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ClientController implements Operations {

    private final frmMenu frmMenu;
    private final frmClientes frmClientes;
    private final JTable jTable;
    private final DefaultTableModel model;
    private final String [] header = {"ID","Nombre","Apellido","Telefono","Dirección"};
    private Client clientSelected;
    private int index;

    public ClientController(frmMenu frmMenu, frmClientes frmClientes){
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
        jTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                index = jTable.getSelectedRow();
                Client [] clients = frmMenu.getClients();
                if (index != -1){
                    frmClientes.getJlbEditable().setText(String.valueOf(clients[index].getId()));
                    frmClientes.getJtfNombre().setText(clients[index].getName());
                    frmClientes.getJtfApellido().setText(clients[index].getLastname());
                    frmClientes.getJtfTelefono().setText(clients[index].getPhone());
                    frmClientes.getJtfDireccion().setText(clients[index].getAddress());
                    clientSelected = clients[index];
                }
            }
        });
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
                    cleanFields();
                }
            }
        };
    }

    @Override
    public ActionListener actualizar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isBlank()){
                    JOptionPane.showMessageDialog(frmClientes,"Favor de llenar todos los campos",
                            "Campos vacios",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    if (isSame(clientSelected)){
                        JOptionPane.showMessageDialog(frmClientes,"No se ha modificado nada",
                                "Sin cambios",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        if (clientSelected != null){
                            String name = frmClientes.getJtfNombre().getText();
                            String lastName = frmClientes.getJtfApellido().getText();
                            String phone = frmClientes.getJtfTelefono().getText();
                            String address = frmClientes.getJtfDireccion().getText();

                            clientSelected.setName(name);
                            clientSelected.setLastname(lastName);
                            clientSelected.setAddress(address);
                            clientSelected.setPhone(phone);
                            JOptionPane.showMessageDialog(frmClientes,"Se ha actualizado correctamente",
                                    "Actualización exitosa",JOptionPane.INFORMATION_MESSAGE);
                            updateTable(index);
                            cleanFields();
                        }
                    }
                }
            }
        };
    }

    @Override
    public ActionListener eliminar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isBlank()){
                    JOptionPane.showMessageDialog(frmClientes,"Favor de llenar todos los campos",
                            "Campos vacios",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    String name = frmClientes.getJtfNombre().getText();
                    String lastName = frmClientes.getJtfApellido().getText();
                    int indexThatMatch = getIndexIfMatch(name,lastName);
                    if(indexThatMatch != -1){
                        deleteClient(indexThatMatch);
                        updateTable(indexThatMatch);
                    }else{
                        JOptionPane.showMessageDialog(frmClientes,"No existe el cliente: "+name+" "+lastName,
                                "No se encontro el cliente",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
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

    private void updateTable(int indexThatMatch) {
        model.setValueAt(null,indexThatMatch,0);
        model.setValueAt(null,indexThatMatch,1);
        model.setValueAt(null,indexThatMatch,2);
        model.setValueAt(null,indexThatMatch,3);
        model.removeRow(indexThatMatch);
        jTable.setModel(model);
    }

    private void cleanFields(){
        frmClientes.getJtfNombre().setText("");
        frmClientes.getJtfApellido().setText("");
        frmClientes.getJtfTelefono().setText("");
        frmClientes.getJtfDireccion().setText("");
    }

    private boolean isSame(Client a){
        if (a != null){
            return a.getName().equals(frmClientes.getJtfNombre().getText()) && a.getLastname().equals(frmClientes.getJtfApellido().getText())
                    && a.getPhone().equals(frmClientes.getJtfTelefono().getText()) && a.getAddress().equals(frmClientes.getJtfDireccion().getText());
        }
        return false;
    }

    private boolean isBlank(){
        return frmClientes.getJtfNombre().getText().equals("") || frmClientes.getJtfApellido().getText().equals("")
                || frmClientes.getJtfTelefono().getText().equals("") || frmClientes.getJtfDireccion().getText().equals("");
    }

    private int getIndexIfMatch(String name, String lastName){
        Client [] clients = frmMenu.getClients();
        for (int i = 0; i < frmMenu.getSizeClient(); i++) {
            if ( name.equals(clients[i].getName()) && lastName.equals(clients[i].getLastname())){
                return i;
            }
        }
       return -1;
    }
    private void deleteClient(int indexThatMatch){
        int input = JOptionPane.showConfirmDialog(frmClientes,"¿Desea eliminar el cliente "
                        +frmMenu.getClients()[indexThatMatch].getName()+" "+frmMenu.getClients()[indexThatMatch].getLastname()+"?",
                "Confirmación para eliminar",JOptionPane.YES_NO_CANCEL_OPTION);
        if (input == JOptionPane.YES_OPTION){
            frmMenu.setClients(eliminar(indexThatMatch, frmMenu.getClients()));
            int id = frmMenu.getSizeClient();
            id--;
            frmMenu.setCountClients(id);
            JOptionPane.showMessageDialog(frmClientes,"Se elimino correctamente el cliente",
                    "Eliminación correcta",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(frmClientes,"No se elimino nada","Canelación de eliminación",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public Client[]eliminar(int indexEliminar, Client[]clients){
        if (clients.length == 1) {
            Arrays.fill(clients, null);
        }else{
            for (int i = 0; i < clients.length; i++) {
                if (i == indexEliminar) {
                    for (int j = i; j < clients.length; j++) {
                        if (j+1 < clients.length) {
                            clients[j] = clients[j+1] ;
                            clients[j+1] = null;
                        }
                    }
                }
            }
        }
        return clients;
    }
}
