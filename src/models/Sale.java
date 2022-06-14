package models;

import Lists.ProductsList;

import java.util.Date;

/**
 *
 * @author armando
 */
public class Sale {

    private int number;
    private ProductsList products;
    private Client client;
    private Seller seller;
    private double total;
    private Sale next;

    private String date;

    public Sale(int number, ProductsList products, Client client, Seller seller, double total, String date) {
        this.number = number;
        this.products = products;
        this.client = client;
        this.seller = seller;
        this.total = total;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ProductsList getProducts() {
        return products;
    }

    public void setProducts(ProductsList products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Sale getNext() {
        return next;
    }

    public void setNext(Sale next) {
        this.next = next;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
