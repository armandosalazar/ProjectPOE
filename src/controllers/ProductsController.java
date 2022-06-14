package controllers;

import Interfaces.Operations;
import Lists.ProductsList;
import models.KeySelectionRenderer;
import View.frmMenu;
import View.frmProductos;
import models.Product;
import models.Provider;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductsController implements Operations {

    private final frmMenu frameMenu;
    private final frmProductos frameProductos;

    private final JTable jTable;
    private Product productSelected;
    private int index;
    private final DefaultTableModel model;
    private final JTextField jtfName;
    private final JTextField jtfPrice;
    private final JComboBox<Provider> jcbProvider;
    private final JRadioButton rbOpcion1;
    private final JRadioButton rbOpcion2;
    private final JRadioButton rbOpcion3;
    private DefaultComboBoxModel<Provider> cBoxModel;

    private final String[] header = {"ID", "Nombre", "Precio", "Cantidad", "Proveedor"};

    public ProductsController(frmMenu frameMenu, frmProductos frameProductos) {
        this.frameProductos = frameProductos;
        this.frameMenu = frameMenu;
        jtfName = frameProductos.getJtfNombre();
        jtfPrice = frameProductos.getJtfPrecio();
        jcbProvider = frameProductos.getJcbProveedor();
        jTable = frameProductos.getjTable1();
        model = frameProductos.getModel();
        rbOpcion1 = frameProductos.getJrbOpcion1();
        rbOpcion2 = frameProductos.getJrbOpcion2();
        rbOpcion3 = frameProductos.getJrbOpcion3();
        cBoxModel = new DefaultComboBoxModel<>();

        for (int i = 0; i < frameMenu.getSizeProviders(); i++) {
            cBoxModel.insertElementAt(frameMenu.getProviders()[i], i);
        }
        jcbProvider.setSelectedItem(null);
        jcbProvider.setModel(cBoxModel);
        addListeners();
        showTable();
    }

    private void addListeners() {
        frameProductos.getJbnRegresar().addActionListener(regresar());
        frameProductos.getJbnRegistrar().addActionListener(registrar());
        frameProductos.getJbnActualizar().addActionListener(actualizar());
        frameProductos.getJbnEliminar().addActionListener(eliminar());

        //Para poder mostrar atributos en lugar del objeto en el JComboBox
        KeySelectionRenderer keySelectionRenderer = new KeySelectionRenderer(jcbProvider) {
            @Override
            public String getDisplayValue(Object item) {
                Provider provider = (Provider) item;
                return provider.getName() + " " + provider.getLastname();
            }
        };
        jTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                index = jTable.getSelectedRow();
                if (index != -1) {
                    Product product = frameMenu.getProductsList().getNode(index);

                    Provider provider = product.getProvider();

                    String name = product.getName();
                    double price = product.getPrice();
                    String priceString = String.valueOf(price);
                    int option = product.getQuantity();

                    jtfName.setText(name);
                    jtfPrice.setText(priceString);
                    jcbProvider.setSelectedItem(provider);
                    selectCurrentOption(option);
                }
            }
        });
    }

    @Override
    public ActionListener registrar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jtfName.getText();
                double price;
                try {
                    price = Double.parseDouble(jtfPrice.getText());
                } catch (NumberFormatException error) {
                    JOptionPane.showMessageDialog(null, "El precio tiene que ser un número", "Error de tipo", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int indexCB = jcbProvider.getSelectedIndex();
                Provider provider = jcbProvider.getItemAt(indexCB);
                int opcion = getSelectedOption();

                ProductsList list = frameMenu.getProductsList();
                int id = list.getSize();

                if (!isBlank()) {
                    list.add((id + 1), name, price, opcion, provider);
                    Product product = new Product((id + 1), name, price, opcion, provider);
                    String providerName = provider.getName() + " " + provider.getLastname();
                    Object[] a = new Object[5];
                    a[0] = product.getId();
                    a[1] = product.getName();
                    a[2] = product.getPrice();
                    a[3] = product.getQuantity();
                    a[4] = providerName;
                    JOptionPane.showMessageDialog(frameProductos, "Se registró correctamente el producto", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                    model.addRow(a);
                    jTable.setModel(model);
                    cleanFields();
                } else {
                    JOptionPane.showMessageDialog(frameMenu, "Favor de llenar todos los campos",
                            "Campos vacíos", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
    }

    @Override
    public ActionListener actualizar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isBlank()) {
                    JOptionPane.showMessageDialog(frameMenu, "Favor de llenar todos los campos",
                            "Campos vacíos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (index != -1) {
                        Product product = frameMenu.getProductsList().getNode(index);
                        System.out.println(product);
                        if (!isSame(product)) {
                            String name = jtfName.getText();
                            product.setName(name);
                            ;
                            double price;
                            try {
                                price = Double.parseDouble(jtfPrice.getText());
                                product.setPrice(price);
                            } catch (NumberFormatException error) {
                                JOptionPane.showMessageDialog(null, "El precio tiene que ser un número", "Error de tipo", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            int indexCB = jcbProvider.getSelectedIndex();
                            Provider provider = jcbProvider.getItemAt(indexCB);
                            int opcion = getSelectedOption();
                            product.setProvider(provider);
                            product.setQuantity(opcion);
                            JOptionPane.showMessageDialog(frameMenu, "Se ha actualizado correctamente",
                                    "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
                            cleanFields();
                            model.setValueAt(product.getId(), index, 0);
                            model.setValueAt(product.getName(), index, 1);
                            model.setValueAt(product.getPrice(), index, 2);
                            model.setValueAt(product.getQuantity(), index, 3);
                            model.setValueAt(product.getProvider().getName() + " " + product.getProvider().getLastname(), index, 4);

                            jTable.setModel(model);
                            jTable.getSelectionModel().clearSelection();
                            jTable.clearSelection();

                        } else {
                            JOptionPane.showMessageDialog(frameMenu, "No se modificó nada",
                                    "Sin cambios", JOptionPane.INFORMATION_MESSAGE);
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
                if (isBlank()) {
                    JOptionPane.showMessageDialog(frameMenu, "Favor de llenar todos los campos",
                            "Campos vacíos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (index != -1) {
                        Product product = frameMenu.getProductsList().getNode(index);
                        if (isSame(product)) {
                            deleteProduct(product);
                            cleanFields();
                        } else {
                            JOptionPane.showMessageDialog(frameMenu, "Los datos no coinciden",
                                    "Verifique el producto a eliminar", JOptionPane.INFORMATION_MESSAGE);
                        }
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
                frameProductos.dispose();
            }
        };
    }

    private int getSelectedOption() {
        if (rbOpcion1.isSelected()) {
            return Integer.parseInt(rbOpcion1.getText());
        }
        if (rbOpcion2.isSelected()) {
            return Integer.parseInt(rbOpcion2.getText());
        }
        if (rbOpcion3.isSelected()) {
            return Integer.parseInt(rbOpcion3.getText());
        }
        return -1;
    }

    private void updateUITable() {
        /*String name = sellerSelected.getName();
        int id = sellerSelected.getId();
        String lastName = sellerSelected.getLastname();
        String phone = sellerSelected.getPhone();

        model.setValueAt(id,index,0);
        model.setValueAt(name,index,1);
        model.setValueAt(lastName,index,2);
        model.setValueAt(phone,index,3);

        jTable.setModel(model);
        jTable.getSelectionModel().clearSelection();
        jTable.clearSelection();*/
    }

    public void showTable() {
        ProductsList list = frameMenu.getProductsList();
        model.setColumnIdentifiers(header);
        if (list != null) {
            Object[][] informacion = new Object[list.getSize()][5];
            for (int i = 0; i < list.getSize(); i++) {
                Product aux = frameMenu.getProductsList().getNode(i);
                for (int j = 0; j < 1; j++) {
                    informacion[i][0] = aux.getId();
                    informacion[i][1] = aux.getName();
                    informacion[i][2] = aux.getPrice();
                    informacion[i][3] = aux.getQuantity();
                    String nameProvider = aux.getProvider().getName() + " " + aux.getProvider().getLastname();
                    informacion[i][4] = nameProvider;
                    model.addRow(informacion[i]);
                }
            }
        }
        jTable.setModel(model);
    }

    private void updateTable(int indexThatMatch) {
        model.setValueAt(null, indexThatMatch, 0);
        model.setValueAt(null, indexThatMatch, 1);
        model.setValueAt(null, indexThatMatch, 2);
        model.setValueAt(null, indexThatMatch, 3);
        model.removeRow(indexThatMatch);
        jTable.setModel(model);
    }

    private void deleteProduct(Product aux) {
        int input = JOptionPane.showConfirmDialog(frameProductos, "¿Desea eliminar el producto "
                        + aux.getName() + "?",
                "Confirmación para eliminar", JOptionPane.YES_NO_OPTION);
        if (input == JOptionPane.YES_OPTION) {
            frameMenu.getProductsList().delete(aux.getId());
            JOptionPane.showMessageDialog(frameProductos, "Se eliminó correctamente el cliente",
                    "Eliminación correcta", JOptionPane.INFORMATION_MESSAGE);
            updateTable(index);
            cleanFields();
        } else {
            JOptionPane.showMessageDialog(frameProductos, "No se eliminó nada", "Cancelación de eliminación", JOptionPane.INFORMATION_MESSAGE);
            jTable.getSelectionModel().clearSelection();
        }
    }

    private void cleanFields() {
        jtfName.setText("");
        jtfPrice.setText("");
        jcbProvider.setSelectedItem(null);
        frameProductos.getGrupo1().clearSelection();
    }

    private void selectCurrentOption(int number) {
        if (number == 1) {
            rbOpcion1.setSelected(true);
        }
        if (number == 12) {
            rbOpcion2.setSelected(true);
        }
        if (number == 24) {
            rbOpcion3.setSelected(true);
        }
    }

    private boolean isJRadioSelected() {
        if (rbOpcion1.isSelected()) {
            return false;
        }
        if (rbOpcion2.isSelected()) {
            return false;
        }
        if (rbOpcion3.isSelected()) {
            return false;
        }
        return true;
    }

    private boolean isBlank() {
        return jtfName.getText().equals("") || jtfPrice.getText().equals("")
                || isJRadioSelected() || jcbProvider.getSelectedItem() == null;
    }

    private boolean isSame(Product product) {
        return product.getName().equals(jtfName.getText()) && product.getPrice() == Double.parseDouble(jtfPrice.getText())
                && product.getProvider().equals(jcbProvider.getItemAt(jcbProvider.getSelectedIndex()))
                && product.getQuantity() == getSelectedOption();
    }

}
