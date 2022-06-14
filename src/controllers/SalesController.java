package controllers;

import Interfaces.Operations;
import Lists.ProductsList;
import Lists.SalesList;
import View.frmMenu;
import View.frmVentas;
import models.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SalesController implements Operations {

    private final frmMenu frameMenu;
    private final frmVentas frameVentas;
    private final JTextField jtfTotal;
    private final JTable jtaProducts;
    private DefaultTableModel model;

    private final JComboBox<Client> jcbClients;
    private final JComboBox<Product> jcbProducts;
    private final JComboBox<Seller> jcbSeller;
    private DefaultComboBoxModel<Client> cBClientModel;
    private DefaultComboBoxModel<Product> cbProductModel;
    private DefaultComboBoxModel<Seller> cbSellerModel;
    private ProductsList productsList;
    private SalesList salesList;
    private int listElementsCount = 0;
    private double total;
    private int indexClients;
    private int indexSellers;
    int index;
    private int id = 1;
    private int idCar = 1;

    private final String[] header = {"ID", "Nombre", "Precio", "Cantidad"};

    public SalesController(frmMenu frameMenu, frmVentas frameVentas) {
        productsList = new ProductsList();
        this.frameMenu = frameMenu;
        this.frameVentas = frameVentas;
        jtfTotal = frameVentas.getJtfTotal();
        jtaProducts = frameVentas.getJtaProducts1();
        salesList = frameMenu.getCurrentUser().getSalesList();

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

    private void addListeners() {
        frameVentas.getJbnRegresar().addActionListener(regresar());
        frameVentas.getJbnAddToCar().addActionListener(addToCar());
        frameVentas.getJbnDeleteFromCar().addActionListener(deleteFromCar());
        frameVentas.getJbnRegistrar().addActionListener(registrar());

        jtaProducts.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                index = jtaProducts.getSelectedRow();
                System.out.println(index);
            }
        });

        new KeySelectionRenderer(jcbClients) {
            @Override
            public String getDisplayValue(Object item) {
                Client client = (Client) item;
                return client.getName() + " " + client.getLastname();
            }
        };

        new KeySelectionRenderer(jcbSeller) {
            @Override
            public String getDisplayValue(Object item) {
                Seller seller = (Seller) item;
                return seller.getName() + " " + seller.getLastname();
            }
        };

        new KeySelectionRenderer(jcbProducts) {

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
                Client client = jcbClients.getItemAt(indexClients);
                Seller seller = jcbSeller.getItemAt(indexSellers);

                System.out.println();
                Date date = new Date();
                SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
                String stringDate = DateFor.format(date);
                if (!isBlank()) {
                    JOptionPane.showMessageDialog(frameMenu, "Favor de llenar todos los campos",
                            "Campos vacíos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (productsList.getSize() > 0) {
                        double total = 0;
                        for (int j = 0; j < productsList.getSize(); j++) {
                            total += productsList.getNode(j).getPrice();
}
                        salesList.add(id, productsList, client, seller, total, stringDate);
                        JOptionPane.showMessageDialog(frameMenu, "Se registro correctamente la venta",
                                "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                        jtaProducts.getSelectionModel().clearSelection();

                        model = new DefaultTableModel();
                        model.setColumnIdentifiers(header);
                        jtaProducts.setModel(model);
                        id++;
                    } else {
                        JOptionPane.showMessageDialog(frameMenu, "No tiene ningun producto añadido en el carro", "Carro vacío", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }
        };
    }

    private void addJComboBoxModels() {
        for (int i = 0; i < frameMenu.getSizeClient(); i++) {
            cBClientModel.insertElementAt(frameMenu.getClients()[i], i);
        }
        for (int i = 0; i < frameMenu.getSizeSellers(); i++) {
            cbSellerModel.insertElementAt(frameMenu.getSellers()[i], i);
        }

        ProductsList list = frameMenu.getProductsList();
        for (int i = 0; i < list.getSize(); i++) {
            cbProductModel.insertElementAt(list.getNode(i), i);
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

    private ActionListener addToCar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int productIndex = jcbProducts.getSelectedIndex();
                Product product = jcbProducts.getItemAt(productIndex);
                int size = productsList.getSize();
                if (size == 0){
                    indexClients = jcbClients.getSelectedIndex();
                    indexSellers = jcbSeller.getSelectedIndex();
                }

                if (!isBlank()) {
                    int temp;
                    System.out.println(product.getName());
                    int id = product.getId();
                    String name = product.getName();
                    double price = product.getPrice();
                    Provider provider = product.getProvider();
                    int quantity = product.getQuantity();
                    String providerName = provider.getName() + " " + provider.getLastname();

                    Object[] a = {product.getId(), product.getName(), product.getPrice(), product.getQuantity(), providerName};
                    JOptionPane.showMessageDialog(frameVentas, "Se añadio el producto al carro", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                    model.addRow(a);
                    jtaProducts.setModel(model);
                    productsList.add(idCar, name, price, quantity, provider);
                    temp = productsList.getSize();

                    if (temp >= 1) {
                        jcbClients.setEnabled(false);
                        jcbSeller.setEnabled(false);
                        jcbProducts.setSelectedItem(null);
                        total += price;
                        jtfTotal.setText(String.valueOf(total));
                    } else {
                        jcbClients.setEnabled(true);
                        jcbSeller.setEnabled(true);
                        cleanFields();
                        jtfTotal.setText("");
                        idCar = 1 ;
                    }
                    idCar++;
                } else {
                    JOptionPane.showMessageDialog(frameMenu, "Favor de llenar todos los campos",
                            "Campos vacíos", JOptionPane.ERROR_MESSAGE);
                }

            }
        };
    }

    private ActionListener deleteFromCar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int option = JOptionPane.showConfirmDialog(frameMenu, "¿Desea quitar el producto del carro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.out.println(index);
                    if (index != -1) {
                        updateTable(index);
                        productsList.delete(index);
                        JOptionPane.showMessageDialog(frameVentas, "Se elimino el producto ", "Se elimino del carro", JOptionPane.INFORMATION_MESSAGE);
                        cleanFields();
                        jtaProducts.getSelectionModel().clearSelection();
                        System.out.println(index);
                    }
                } else {
                    JOptionPane.showMessageDialog(frameVentas, "No se elimino nada del carro",
                            "Cancelarción", JOptionPane.INFORMATION_MESSAGE);
                    jtaProducts.getSelectionModel().clearSelection();
                }

                if (productsList.getSize() == 0) {
                    cleanFields();
                    jcbClients.setEnabled(true);
                    jcbSeller.setEnabled(true);
                }
            }
        };
    }

    private void cleanFields() {
        jtfTotal.setText("");
        jcbClients.setSelectedItem(null);
        jcbSeller.setSelectedItem(null);
        jcbProducts.setSelectedItem(null);
    }

    private boolean isBlank() {
        return jcbClients.getSelectedItem() == null || jcbProducts.getSelectedItem() == null
                || jcbProducts.getSelectedItem() == null;
    }

    private void updateTable(int indexThatMatch) {
        model.setValueAt(null, indexThatMatch, 0);
        model.setValueAt(null, indexThatMatch, 1);
        model.setValueAt(null, indexThatMatch, 2);
        model.setValueAt(null, indexThatMatch, 3);
        model.removeRow(indexThatMatch);
        jtaProducts.setModel(model);
    }
}
