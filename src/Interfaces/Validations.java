package Interfaces;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public interface Validations {

    private KeyListener validarNumeros(){
        return new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c= e.getKeyChar();
                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        };
    }

    private KeyListener validarLetras(){
        return new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if (!(Character.isAlphabetic(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
                    e.consume();
                }
            }
        };
    }

}
