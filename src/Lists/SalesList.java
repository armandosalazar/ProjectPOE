package Lists;

import models.*;

public class SalesList {

    private Sale start;
    private Sale end;
    private Sale current;
    private int size;

    public SalesList(){
        size = 0;
    }

    public void add(int number, ProductsList products, Client client, Seller seller, double total, String data){
        Sale user = new Sale(number, products, client, seller, total,data);
        if (isEmpty()){
            start = user;
            end = user;
            user.setNext(null);
            start.setNext(null);
        }else{
            Sale aux = start;
            if (aux == end){
                start.setNext(user);
            }else{
                while (aux.getNext() != null){
                    aux = aux.getNext();
                }
                aux.setNext(user);
            }
            end = user;
        }
        size++;
    }

    public void delete(int id){
        Sale temp = start;
        Sale prev = null;
        if (getSize() == 1){
            start = null;
            end = null;
            size--;
        }else{
            if(!isEmpty()){
                while (temp != null && temp.getNumber() != id){
                    prev = temp;
                    temp = temp.getNext();
                }
                if (temp != null && prev != null){
                    if (temp == end){
                        prev.setNext(null);
                    }else{
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

    public Sale getNode(int index){
        int i = 0;
        if(isEmpty()){
            return null;
        }else{
            Sale aux = start;
            while(i <= index){
                if (i == index){
                    return aux;
                }else{
                    aux = aux.getNext();
                }
                i++;
            }
        }
        return current;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize()== 0;
    }
}
