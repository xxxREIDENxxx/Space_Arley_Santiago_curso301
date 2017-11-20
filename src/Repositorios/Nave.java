
package Repositorios;

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
    }
    
    public void derecha(){
        if(x < ventana.getWidth()){
            x += inc;
        }
        else{
            x = ventana.getWidth();
        }
    }
    
    public void disparar(){
        
    }
    
}
