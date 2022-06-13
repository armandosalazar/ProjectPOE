package controllers;

import Interfaces.Operations;
import Lists.ProductsList;
import View.frmMenu;
import View.frmVentas;
import models.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesController implements Operations {

    private final frmMenu frameMenu;
    private final frmVentas frameVentas;
    private final JTextField jtfTotal;
    private final JTable jtaProducts;
    private final DefaultTableModel model;

    private final JComboBox<Client> jcbClients;
    private final JComboBox<Product>jcbProducts;
    private final JComboBox<Seller>jcbSeller;
    private DefaultComboBoxModel<Client> cBClientModel;
    private DefaultComboBoxModel<Product> cbProductModel;
    private DefaultComboBoxModel<Seller> cbSellerModel;
    private ProductsList productsList;
    private int listElementsCount = 0;

    private final String [] header = {"ID","Nombre","Precio","Cantidad"};
    public SalesController(frmMenu frameMenu, frmVentas frameVentas){
        productsList = new ProductsList();
        this.frameMenu = frameMenu;
        this.frameVentas = frameVentas;
        jtfTotal = frameVentas.getJtfTotal();
        jtaProducts = frameVentas.getJtaProducts1();

        model = frameVentas.getModel();
        model.setColumnIdentifiers(header);
        cbSellerModel = frameVentas.getCbSellerModel();
        cbProductModel = frameVentas.getCbProductModel();
        cBClientModel = frameVentas.getCbClientModel();

        jcbSeller = frameVentas.getJcbVendedor();
        jcbClients = frameVentas.getJcbCliente();
        jcbProducts = frameVentas.getJcbProductos();

        addListeners();
        addJComboBoxModels();
        jtaProducts.setModel(model);

        jcbClients.setSelectedItem(null);
        jcbSeller.setSelectedItem(null);
        jcbProducts.setSelectedItem(null);
    }

    private void addListeners(){
        frameVentas.getJbnRegresar().addActionListener(regresar());
        frameVentas.getJbnAddToCar().addActionListener(addToCar());
        frameVentas.getJbnDeleteFromCar().addActionListener(deleteFromCar());
        frameVentas.getJbnRegistrar().addActionListener(registrar());

       new KeySelectionRenderer(jcbClients) {
            @Override
            public String getDisplayValue(Object item) {
                Client client = (Client) item;
                return client.getName()+" "+client.getLastname();
            }
        };

       new KeySelectionRenderer(jcbSeller) {
            @Override
            public String getDisplayValue(Object item) {
                Seller seller = (Seller) item;
                return seller.getName()+" "+seller.getLastname();
            }
        };

       new KeySelectionRenderer(jcbProducts){

           @Override
           public String getDisplayValue(Object item) {
               Product product = (Product) item;
               return product.getName();
           }
       };
    }

    @Override
    public ActionListener registrar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int clientsIndex = jcbClients.getSelectedIndex();

                int sellerIndex = jcbSeller.getSelectedIndex();

                Client client = jcbClients.getItemAt(clientsIndex);
                Seller seller = jcbSeller.getItemAt(sellerIndex);

            }
        };
    }

    private void addJComboBoxModels(){
        for (int i = 0; i < frameMenu.getSizeClient(); i++) {
            cBClientModel.insertElementAt(frameMenu.getClients()[i],i);
        }
        for (int i = 0; i <= frameMenu.getSizeSellers(); i++) {
            cbSellerModel.insertElementAt(frameMenu.getSellers()[i],i );
        }

        ProductsList list = frameMenu.getProductsList();
        for (int i = 0; i < list.getSize(); i++) {
            cbProductModel.insertElementAt(list.getNode(i),i);
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

    private ActionListener addToCar(){
        return  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int productIndex = jcbProducts.getSelectedIndex();
                Product product = jcbProducts.getItemAt(productIndex);


            }
        };
    }

    private ActionListener deleteFromCar(){
        return  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }

    private void cleanFields(){
        jtfTotal.setText("");
        jcbClients.setSelectedItem(null);
        jcbSeller.setSelectedItem(null);
        jcbProducts.setSelectedItem(null);
    }
}
