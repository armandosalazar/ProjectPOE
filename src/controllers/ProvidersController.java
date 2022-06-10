package controllers;

import Interfaces.Operations;
import View.frmMenu;
import View.frmProveedores;
import models.Client;
import models.Provider;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ProvidersController implements Operations {

    private frmMenu frameMenu;
    private frmProveedores frameProveedores;
    private JTable jTable;
    private Provider providerSelected;
    private int index;
    private DefaultTableModel model;

    private final String [] header = {"ID","Nombre","Apellido","Telefono"};
    public ProvidersController(frmMenu frmMenu, frmProveedores frmProveedores){
        this.frameMenu = frmMenu;
        this.frameProveedores = frmProveedores;
        jTable = frmProveedores.getjTable1();
        model = frmProveedores.getModel();
        addListeners();
        showTable();
    }

    public void addListeners(){
        frameProveedores.getJbnRegresar().addActionListener(regresar());
        frameProveedores.getJbnRegistrar().addActionListener(registrar());
        frameProveedores.getJbnEliminar().addActionListener(eliminar());
        frameProveedores.getJbnActualizar().addActionListener(actualizar());
        jTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                index = jTable.getSelectedRow();
                Provider [] providers = frameMenu.getProviders();
                if (index != -1){
                    frameProveedores.getJlbEditable().setText(String.valueOf(providers[index].getId()));
                    frameProveedores.getJtfNombre().setText(providers[index].getName());
                    frameProveedores.getJtfApellido().setText(providers[index].getLastname());
                    frameProveedores.getJtfTelefono().setText(providers[index].getPhone());
                    providerSelected = providers[index];
                }
            }
        });
    }


    @Override
    public ActionListener registrar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = frameProveedores.getJtfNombre().getText();
                String lastName = frameProveedores.getJtfApellido().getText();
                String phone = frameProveedores.getJtfTelefono().getText();
                //String address = frmClientes.getJtfDireccion().getText();

                if (name.equals("") || lastName.equals("") || phone.equals("")){
                    JOptionPane.showMessageDialog(frameProveedores,"Por favor llene todos los campos","Falta llenar campos",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int id = frameMenu.getSizeProviders();
                    Provider provider = new Provider(id,name,lastName,phone);
                    //Actualizo la tabla cada que se registra
                    Object[] a = new Object[4];
                    a[0] = provider.getId();
                    a[1] = provider.getName();
                    a[2] = provider.getLastname();
                    a[3] = provider.getPhone();
                    frameMenu.addProvider(provider,id);
                    JOptionPane.showMessageDialog(frameProveedores,"Se registro correctamente el proveedor","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
                    model.addRow(a);
                    jTable.setModel(model);
                    id++;
                    frameMenu.setCountProviders(id);
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
                    JOptionPane.showMessageDialog(frameProveedores,"Favor de llenar todos los campos",
                            "Campos vacios",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    if (isSame(providerSelected)){
                        JOptionPane.showMessageDialog(frameProveedores,"No se ha modificado nada",
                                "Sin cambios",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        if (providerSelected != null){
                            String name = frameProveedores.getJtfNombre().getText();
                            String lastName = frameProveedores.getJtfApellido().getText();
                            String phone = frameProveedores.getJtfTelefono().getText();

                            model.setValueAt(name,index,1);
                            model.setValueAt(lastName,index,2);
                            model.setValueAt(phone,index,3);
                            jTable.setModel(model);

                            providerSelected.setName(name);
                            providerSelected.setLastname(lastName);
                            //providerSelected.setAddress(address);
                            providerSelected.setPhone(phone);
                            JOptionPane.showMessageDialog(frameProveedores,"Se ha actualizado correctamente",
                                    "Actualización exitosa",JOptionPane.INFORMATION_MESSAGE);
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
                    JOptionPane.showMessageDialog(frameProveedores,"Favor de llenar todos los campos",
                            "Campos vacios",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    String name = frameProveedores.getJtfNombre().getText();
                    String lastName = frameProveedores.getJtfApellido().getText();
                    int indexThatMatch = getIndexIfMatch(name,lastName);
                    if(indexThatMatch != -1){
                        deleteProvider(indexThatMatch);
                        updateTable(indexThatMatch);

                    }else{
                        JOptionPane.showMessageDialog(frameProveedores,"No existe el proveedor: "+name+" "+lastName,
                                "No se encontro el proveedor",JOptionPane.INFORMATION_MESSAGE);
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
                frameProveedores.dispose();
                frameMenu.setVisible(true);
            }
        };
    }

    private void showTable() {
        model.setColumnIdentifiers(header);
        Object [][] info = new Object[frameMenu.getSizeProviders()][4];
        for (int i = 0; i < frameMenu.getSizeProviders(); i++) {
            Provider provider = frameMenu.getProviders()[i];
            for (int j = 0; j < 1; j++) {
                info[i][0] = provider.getId();
                info[i][1] = provider.getName();
                info[i][2] = provider.getLastname();
                info[i][3] = provider.getPhone();
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
        System.out.println(frameMenu.getSizeProviders());
    }

    private void cleanFields(){
        frameProveedores.getJtfNombre().setText("");
        frameProveedores.getJtfApellido().setText("");
        frameProveedores.getJtfTelefono().setText("");
    }

    private boolean isSame(Provider a){
        if (a != null){
            return a.getName().equals(frameProveedores.getJtfNombre().getText()) && a.getLastname().equals(frameProveedores.getJtfApellido().getText())
                    && a.getPhone().equals(frameProveedores.getJtfTelefono().getText());
        }
        return false;
    }

    private boolean isBlank(){
        return frameProveedores.getJtfNombre().getText().equals("") || frameProveedores.getJtfApellido().getText().equals("")
                || frameProveedores.getJtfTelefono().getText().equals("");
    }

    private int getIndexIfMatch(String name, String lastName){
        Provider [] providers = frameMenu.getProviders();
        for (int i = 0; i < frameMenu.getSizeProviders(); i++) {
            if ( name.equals(providers[i].getName()) && lastName.equals(providers[i].getLastname())){
                return i;
            }
        }
        return -1;
    }
    private void deleteProvider(int indexThatMatch){
        int input = JOptionPane.showConfirmDialog(frameProveedores,"¿Desea eliminar el proveedor "
                        +frameMenu.getProviders()[indexThatMatch].getName()+" "+frameMenu.getProviders()[indexThatMatch].getLastname()+"?",
                "Confirmación para eliminar",JOptionPane.YES_NO_CANCEL_OPTION);
        if (input == JOptionPane.YES_OPTION){
            frameMenu.setProviders(eliminar(indexThatMatch, frameMenu.getProviders()));
            int id = frameMenu.getSizeProviders();
            id--;
            frameMenu.setCountProviders(id);
            JOptionPane.showMessageDialog(frameProveedores,"Se elimino correctamente el proveedor",
                    "Eliminación correcta",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(frameProveedores,"No se elimino nada","Canelación de eliminación",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private Provider[]eliminar(int indexEliminar, Provider[]providers){
        if (providers.length == 1) {
            Arrays.fill(providers, null);
        }else{
            for (int i = 0; i < providers.length; i++) {
                if (i == indexEliminar) {
                    for (int j = i; j < providers.length; j++) {
                        if (j+1 < providers.length) {
                            providers[j] = providers[j+1] ;
                            providers[j+1] = null;
                        }
                    }
                }
            }
        }
        return providers;
    }
}
