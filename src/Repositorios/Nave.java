
package Repositorios;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import movimiento.Ventana;

/**
 *
 * @author home
 */
public class Nave {
    
    int x;
    int y;
    
    int inc = 15;
    
    Ventana ventana;
    
    Toolkit t = Toolkit.getDefaultToolkit ();
    Image imagen = t.getImage ("img/nave2.png");

    public Nave() {
    }
    
    public void izquierda(){
        if(x > 0){
            x -= inc;
        }
        else{
            x = 0;
        }
        
        ventana.repaint();
    }
    
    public void derecha(){
        if( (x + imagen.getWidth(ventana)) < ventana.getWidth()){
            x += inc;
        }
        else{
            x = ventana.getWidth() - imagen.getWidth(ventana);
        }
        ventana.repaint();
    }
    
    public void disparar(){
        Bala b = new Bala(x, y);
        
        b.setX(x + imagen.getWidth(ventana)/2 - b.getImagen().getWidth(ventana)/2);
        b.setY(y - b.getImagen().getHeight(ventana)/2);
        
        Hilo_Bala hilo = new Hilo_Bala(b, ventana);
        
        hilo.start();
        
        ventana.getHilos().add(hilo);
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
    
}
