package View;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ImagenFondo extends JPanel {
//Atributo de imagen de fondo
    private Image imagen;
    private ImageIcon imagenICono;    
    
    public ImagenFondo(String ruta){
        //Establecemos la ruta del recurso (imagen) a utilizar
        imagenICono = new ImageIcon(ruta);
    }
    
    //Método para pintar la imagen de fondo
    public void paint (Graphics g){
        //Se relaciona con el objeto de la clase Image
        imagen = imagenICono.getImage();
        //Se redibuja en todo el espacio del JFrame
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        //Se establece el fondo transparente
        setOpaque(false);
        //Llamar al método
        super.paint(g);
    }//pintarImagen
}//class
