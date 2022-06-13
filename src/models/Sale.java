package models;

/**
 *
 * @author armando
 */
public class Sale {

    private int number;
    private Product[] products;
    private Client client;
    private Seller seller;
    private double total;
    private Sale next;

    public Sale(int number, Product[] products, Client client, Seller seller, double total) {
        this.number = number;
        this.products = products;
        this.client = client;
        this.seller = seller;
        this.total = total;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
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
}
