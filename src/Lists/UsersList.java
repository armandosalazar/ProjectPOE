package Lists;

import models.Product;
import models.User;

public class UsersList {

    private User start;
    private User end;
    private int size;

    public UsersList(){
        size = 0;
    }

    public void add(int id, String userName, String pass,String name, String lastname, String phone, String type){
        User user = new User(id,userName,pass,name,lastname,phone,type);
        if (isEmpty()){
            start = user;
            end = user;
            user.setNext(null);
            start.setNext(null);
        }else{
            User aux = start;
            if (aux == end){
                start.setNext(user);
            }else{
                while (aux != end){
                    aux = aux.getNext();
                }
                aux.setNext(user);
                user.setNext(null);
            }
            end = user;
        }
        size++;
    }
    public boolean compareElements(String user, String pass){
        User temp;
        temp = start;
        for (int i = 0; i < getSize() ; i++) {
            if (temp != null){
                if (temp.getUser().equals(user) && temp.getPass().equals(pass)){
                    return true;
                }
                temp = temp.getNext();
            }
        }
        return false;
    }

    public boolean compareElements(String user){
        User temp;
        temp = start;
        for (int i = 0; i < getSize() ; i++) {
            if (temp != null){
                if (temp.getUser().equals(user)){
                    return true;
                }
                temp = temp.getNext();
            }
        }
        return false;
    }

    public User getNode(String name){
        User aux = start;
        User temp = null;
        if(isEmpty()){
            return null;
        }else{
            if (getSize() == 1){
                return start;
            }else{
                while(aux != null  && !aux.getUser().equals(name)){
                    aux = aux.getNext();
                }
                if (aux != null){
                    return aux;
                }
            }
        }
        return null;
    }

    public User getNode(int index) {
        int i = 0;
        if (isEmpty()) {
            return null;
        } else {
            User aux = start;
            while (i <= index) {
                if (i == index) {
                    return aux;
                } else {
                    aux = aux.getNext();
                }
                i++;
            }
        }
        return null;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize()== 0;
    }
}
