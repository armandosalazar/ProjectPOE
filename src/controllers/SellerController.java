package controllers;

import Interfaces.Operations;
import View.frmMenu;
import View.frmVendedores;
import models.Seller;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class SellerController implements Operations {

    private final frmMenu frameMenu;
    private final frmVendedores frameVendedores;

    private final JTable jTable;
    private final DefaultTableModel model;
    private final String [] header = {"ID","Nombre","Apellido","Teléfono","Puesto"};
    private Seller sellerSelected;
    private int index;

    public SellerController(frmMenu frameMenu, frmVendedores frameVendedores){
        this.frameVendedores = frameVendedores;
        this.frameMenu = frameMenu;
        model = frameVendedores.getModel();
        jTable = frameVendedores.getjTable1();
        addListeners();
        showTable();
    }


    private void addListeners(){
        frameVendedores.getJbnRegresar().addActionListener(regresar());
        frameVendedores.getJbnRegistrar().addActionListener(registrar());
        frameVendedores.getJbnEliminar().addActionListener(eliminar());
        frameVendedores.getJbnActualizar().addActionListener(actualizar());
        jTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                index = jTable.getSelectedRow();
                Seller [] sellers = frameMenu.getSellers();
                if (index != -1){
                    frameVendedores.getJlbEditable().setText(String.valueOf(sellers[index].getId()));
                    frameVendedores.getJtfNombre().setText(sellers[index].getName());
                    frameVendedores.getJtfApellido().setText(sellers[index].getLastname());
                    frameVendedores.getJtfTelefono().setText(sellers[index].getPhone());
                    frameVendedores.getJtfPuesto().setText(sellers[index].getType());
                    sellerSelected = sellers[index];
                }
            }
        });
    }
    @Override
    public ActionListener registrar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = frameVendedores.getJtfNombre().getText();
                String lastName = frameVendedores.getJtfApellido().getText();
                String phone = frameVendedores.getJtfTelefono().getText();
                String address = frameVendedores.getJtfPuesto().getText();

                if (name.equals("") || lastName.equals("") || phone.equals("") || address.equals("")){
                    JOptionPane.showMessageDialog(frameVendedores,"Por favor llene todos los campos","Falta llenar campos",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int id = frameMenu.getSizeSellers();
                    Seller seller = new Seller(id,name,lastName,phone,address);
                    //Actualizo la tabla cada que se registra
                    Object[] a = new Object[5];
                    a[0] = seller.getId();
                    a[1] = seller.getName();
                    a[2] = seller.getLastname();
                    a[3] = seller.getPhone();
                    a[4] = seller.getType();
                    frameMenu.addSeller(seller,id);
                    JOptionPane.showMessageDialog(frameVendedores,"Se registro correctamente el vendedor","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
                    model.addRow(a);
                    jTable.setModel(model);
                    id++;
                    frameMenu.setCountSellers(id);
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
                    JOptionPane.showMessageDialog(frameVendedores,"Favor de llenar todos los campos",
                            "Campos vacios",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    if (isSame(sellerSelected)){
                        JOptionPane.showMessageDialog(frameVendedores,"No se ha modificado nada",
                                "Sin cambios",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        if (sellerSelected != null){
                            String name = frameVendedores.getJtfNombre().getText();
                            String lastName = frameVendedores.getJtfApellido().getText();
                            String phone = frameVendedores.getJtfTelefono().getText();
                            String address = frameVendedores.getJtfPuesto().getText();

                            sellerSelected.setName(name);
                            sellerSelected.setLastname(lastName);
                            sellerSelected.setType(address);
                            sellerSelected.setPhone(phone);
                            JOptionPane.showMessageDialog(frameVendedores,"Se ha actualizado correctamente",
                                    "Actualización exitosa",JOptionPane.INFORMATION_MESSAGE);
                            cleanFields();
                            updateUITable();
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
                    JOptionPane.showMessageDialog(frameVendedores,"Favor de llenar todos los campos",
                            "Campos vacios",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    String name = frameVendedores.getJtfNombre().getText();
                    String lastName = frameVendedores.getJtfApellido().getText();
                    int indexThatMatch = getIndexIfMatch(name,lastName);
                    if(indexThatMatch != -1){
                        deleteClient(indexThatMatch);
                        updateTable(indexThatMatch);
                        cleanFields();
                    }else{
                        JOptionPane.showMessageDialog(frameVendedores,"No existe el cliente: "+name+" "+lastName,
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
                frameMenu.setVisible(true);
                frameVendedores.dispose();
            }
        };
    }

    private void updateUITable(){
        String name = sellerSelected.getName();
        int id = sellerSelected.getId();
        String lastName = sellerSelected.getLastname();
        String phone = sellerSelected.getPhone();

        model.setValueAt(id,index,0);
        model.setValueAt(name,index,1);
        model.setValueAt(lastName,index,2);
        model.setValueAt(phone,index,3);

        jTable.setModel(model);
        jTable.getSelectionModel().clearSelection();
        jTable.clearSelection();
    }

    private void updateTable(int indexThatMatch) {
        model.setValueAt(null,indexThatMatch,0);
        model.setValueAt(null,indexThatMatch,1);
        model.setValueAt(null,indexThatMatch,2);
        model.setValueAt(null,indexThatMatch,3);
        model.removeRow(indexThatMatch);
        jTable.setModel(model);
    }

    private void showTable() {
        model.setColumnIdentifiers(header);
        Object [][] info = new Object[frameMenu.getSizeSellers()][5];
        for (int i = 0; i < frameMenu.getSizeSellers(); i++) {
            Seller seller = frameMenu.getSellers()[i];
            for (int j = 0; j < 1; j++) {
                info[i][0] = seller.getId();
                info[i][1] = seller.getName();
                info[i][2] = seller.getLastname();
                info[i][3] = seller.getPhone();
                info[i][4] = seller.getType();
                model.addRow(info[i]);
            }
        }
        jTable.setModel(model);
    }

    private void cleanFields(){
        frameVendedores.getJtfNombre().setText("");
        frameVendedores.getJtfApellido().setText("");
        frameVendedores.getJtfTelefono().setText("");
        frameVendedores.getJtfPuesto().setText("");
    }

    private boolean isSame(Seller a){
        if (a != null){
            return a.getName().equals(frameVendedores.getJtfNombre().getText()) && a.getLastname().equals(frameVendedores.getJtfApellido().getText())
                    && a.getPhone().equals(frameVendedores.getJtfTelefono().getText()) && a.getType().equals(frameVendedores.getJtfPuesto().getText());
        }
        return false;
    }

    private boolean isBlank(){
        return frameVendedores.getJtfNombre().getText().equals("") || frameVendedores.getJtfApellido().getText().equals("")
                || frameVendedores.getJtfTelefono().getText().equals("") || frameVendedores.getJtfPuesto().getText().equals("");
    }

    private int getIndexIfMatch(String name, String lastName){
        Seller[] sellers = frameMenu.getSellers();
        for (int i = 0; i < frameMenu.getSizeClient(); i++) {
            if ( name.equals(sellers[i].getName()) && lastName.equals(sellers[i].getLastname())){
                return i;
            }
        }
        return -1;
    }
    private void deleteClient(int indexThatMatch){
        int input = JOptionPane.showConfirmDialog(frameVendedores,"¿Desea eliminar el cliente "
                        +frameMenu.getSellers()[indexThatMatch].getName()+" "+frameMenu.getSellers()[indexThatMatch].getLastname()+"?",
                "Confirmación para eliinar",JOptionPane.YES_NO_CANCEL_OPTION);
        if (input == JOptionPane.YES_OPTION){
            frameMenu.setSellers(eliminar(indexThatMatch, frameMenu.getSellers()));
            int id = frameMenu.getSizeClient();
            id--;
            frameMenu.setCountSellers(id);
            JOptionPane.showMessageDialog(frameVendedores,"Se elimino correctamente el cliente",
                    "Eliminación correcta",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(frameVendedores,"No se elimino nada","Canelación de eliminación",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public Seller[]eliminar(int indexEliminar, Seller[]sellers){
        if (sellers.length == 1) {
            Arrays.fill(sellers, null);
        }else{
            for (int i = 0; i < sellers.length; i++) {
                if (i == indexEliminar) {
                    for (int j = i; j < sellers.length; j++) {
                        if (j+1 < sellers.length) {
                            sellers[j] = sellers[j+1] ;
                            sellers[j+1] = null;
                        }
                    }
                }
            }
        }
        return sellers;
    }
}
