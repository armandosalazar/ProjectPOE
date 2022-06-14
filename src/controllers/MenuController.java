package controllers;

import View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController {

    private final frmMenu frmMenu;
    private final frmUser frameUser;
    private final JMenuItem registroClientes;
    private final JMenuItem registroProveedores;
    private final JMenuItem registroVentas;
    private final JMenuItem registroProductos;
    private final JMenuItem registroVendedores;

    public MenuController(frmUser frameuser, frmMenu frmMenu) {
        this.frmMenu = frmMenu;
        this.frameUser = frameuser;
        registroClientes = frmMenu.getJmiVerCliente();
        registroProveedores = frmMenu.getJmiVerProveedor();
        registroProductos = frmMenu.getJmiVerProducto();
        registroVentas = frmMenu.getJmiVerVenta();
        registroVendedores = frmMenu.getJmiVerVendedor();
        addListeners();
    }

    public void addListeners() {
        registroClientes.addActionListener(registrarClientes());
        registroVendedores.addActionListener(registrarVendedor());
        registroVentas.addActionListener(registrarVenta());
        registroProductos.addActionListener(registrarProducto());
        registroProveedores.addActionListener(registrarProveedor());
        frmMenu.getJmiVerUsuarios().addActionListener(verUsuarios());

        frmMenu.getJmiComprasCliente().addActionListener(mostrarClientes());
        frmMenu.getJmiEditarProducto().addActionListener(mostrarProductos());
        frmMenu.getJmiProductosProveedor().addActionListener(mostrarProveedores());
        frmMenu.getJmiVentasVendedor().addActionListener(mostrarVendedores());
        frmMenu.getJmiEditarVenta().addActionListener(mostrarVentas());

        frmMenu.getJmiSalr().addActionListener(salir());
        frmMenu.getJmiRegresar().addActionListener(logOut());
    }

    private ActionListener registrarClientes() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frmClientes frmClientes = new frmClientes();
                frmClientes.setVisible(true);
                new ClientController(frmMenu, frmClientes);
            }
        };
    }

    private ActionListener registrarProveedor() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frmProveedores frmProveedor = new frmProveedores();
                frmProveedor.setVisible(true);
                new ProvidersController(frmMenu, frmProveedor);
            }
        };
    }

    private ActionListener registrarVenta() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frmVentas frmVentas = new frmVentas();
                frmVentas.setVisible(true);
                new SalesController(frmMenu, frmVentas);
            }
        };
    }

    private ActionListener registrarProducto() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frmProductos frmProductos = new frmProductos();
                frmProductos.setVisible(true);
                new ProductsController(frmMenu, frmProductos);
            }
        };
    }

    private ActionListener registrarVendedor() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frmVendedores frmVendedores = new frmVendedores();
                frmVendedores.setVisible(true);
                new SellerController(frmMenu, frmVendedores);
            }
        };
    }

    private ActionListener mostrarProductos() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmVerProductos frmVerProductos = new frmVerProductos(frmMenu);
                frmMenu.setVisible(false);
                frmVerProductos.setVisible(true);
            }
        };
    }

    private ActionListener mostrarClientes() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmVerClientes frmVerClientes = new frmVerClientes(frmMenu);
                frmMenu.setVisible(false);
                frmVerClientes.setVisible(true);
            }
        };
    }

    private ActionListener mostrarProveedores() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmVerProveedores frmVerProveedores = new frmVerProveedores(frmMenu);
                frmMenu.setVisible(false);
                frmVerProveedores.setVisible(true);
            }
        };
    }

    private ActionListener mostrarVentas() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmVerVentas frmVerVentas = new frmVerVentas();
                frmMenu.setVisible(false);
                frmVerVentas.setVisible(true);
            }
        };
    }

    private ActionListener mostrarVendedores() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmVerVendedores frmVerVendedores = new frmVerVendedores(frmMenu);
                frmMenu.setVisible(false);
                frmVerVendedores.setVisible(true);
            }
        };
    }

    private ActionListener salir() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.dispose();
                frameUser.dispose();
            }
        };
    }

    private ActionListener logOut() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frameUser.cleanAllFields();
                frameUser.setVisible(true);
            }
        };
    }

    private ActionListener verUsuarios(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMenu.setVisible(false);
                frmVerUsuarios verUsuarios = new frmVerUsuarios(frmMenu);
                verUsuarios.setVisible(true);
            }
        };
    }

}
