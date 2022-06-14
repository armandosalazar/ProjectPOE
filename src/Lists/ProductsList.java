package Lists;

import models.Product;
import models.Provider;

public class ProductsList {

    private Product start;
    private Product end;
    private Product current;
    private int size;

    public ProductsList() {
        size = 0;
    }

    public void add(int id, String name, double price, int quantity, Provider provider) {
        Product user = new Product(id, name, price, quantity, provider);
        if (isEmpty()) {
            start = user;
            end = user;
            user.setNext(null);
            start.setNext(null);
        } else {
            Product aux = start;
            if (aux == end) {
                start.setNext(user);
            } else {
                while (aux.getNext() != null) {
                    aux = aux.getNext();
                }
                aux.setNext(user);
            }
            end = user;
        }
        size++;
    }

    public void delete(int id) {
        int i = 0;
        Product temp = start;
        Product prev = null;
        if (getSize() == 1) {
            start = null;
            end = null;
            size--;
        } else {
            if (!isEmpty()) {
                while (temp != null && temp.getId() != id) {
                    prev = temp;
                    temp = temp.getNext();
                }
                if (temp != null && prev != null) {
                    if (temp == end) {
                        prev.setNext(null);
                    } else {
                        temp = temp.getNext();
                        prev.setNext(temp);
                        end = temp;
                        end.setNext(null);
                    }
                    size--;
                }
            }
        }
    }

    public Product getNode(int index) {
        int i = 0;
        if (isEmpty()) {
            return null;
        } else {
            Product aux = start;
            while (i <= index) {
                if (i == index) {
                    return aux;
                } else {
                    aux = aux.getNext();
                }
                i++;
            }
        }
        return current;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }
}
