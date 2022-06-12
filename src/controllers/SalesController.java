package controllers;

import Interfaces.Operations;
import Lists.ProductsList;
import View.frmMenu;
import View.frmVentas;
import models.Client;
import models.Product;
import models.Seller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesController implements Operations {

    private final frmMenu frameMenu;
    private final frmVentas frameVentas;
    private final JTextField jtfTotal;
    private final JTextArea jtaProducts;
    private final DefaultTableModel model;

    private final JComboBox<Client> jcbClients;
    private final JComboBox<Product>jcbProducts;
    private final JComboBox<Seller>jcbSeller;
    private DefaultComboBoxModel<Client> cBClientModel;
    private DefaultComboBoxModel<Product> cbProductModel;
    private DefaultComboBoxModel<Seller> cbSellerModel;

    private final String [] header = {"No.","Product","Client","Seller","Total"};
    public SalesController(frmMenu frameMenu, frmVentas frameVentas){
        this.frameMenu = frameMenu;
        this.frameVentas = frameVentas;
        jtfTotal = frameVentas.getJtfTotal();
        jtaProducts = frameVentas.getJtaProducts1();
        model = frameVentas.getModel();
        jcbSeller = frameVentas.getJcbVendedor();
        jcbClients = frameVentas.getJcbCliente();
        jcbProducts = frameVentas.getJcbProductos();

        addListeners();
        addJComboBoxModels();
    }

    private void addListeners(){
        frameVentas.getJbnRegresar().addActionListener(regresar());
        frameVentas.getJbnAddToCar().addActionListener(actualizar());
        frameVentas.getJbnDeleteFromCar().addActionListener(eliminar());
        frameVentas.getJbnRegistrar().addActionListener(registrar());
    }

    @Override
    public ActionListener registrar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }

    private void addJComboBoxModels(){
        for (int i = 0; i < frameMenu.getSizeClient(); i++) {
            cBClientModel.addElement(frameMenu.getClients()[i]);
        }
        for (int i = 0; i < frameMenu.getSizeSellers(); i++) {
            cbSellerModel.addElement(frameMenu.getSellers()[i]);
        }

        ProductsList list = frameMenu.getProductsList();
        for (int i = 0; i < list.getSize(); i++) {
            cbProductModel.addElement(list.getNode(i));
        }

        jcbProducts.setModel(cbProductModel);
        jcbSeller.setModel(cbSellerModel);
        jcbClients.setModel(cBClientModel);
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
                frameVentas.dispose();
                frameMenu.setVisible(true);
            }
        };
    }

    private void cleanFields(){
        jtfTotal.setText("");
    }
}
