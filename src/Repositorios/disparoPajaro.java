/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Clint
 */
public class disparoPajaro extends Thread {
    
    
    int i=0;
    JLabel cara,disparo;
    int x,y;
    
    
    public disparoPajaro(JLabel cara,JLabel disparo){
        this.cara=cara;
        this.disparo=disparo;
        this.x=x;
        this.y=y;
        
    }
    
    
    @Override
    public void run(){
        
        int x = cara.getX();
            try {
                for(i=450;i>1;i--){
                    
                
                disparo.setLocation(x,i);
                sleep(5);
                
                
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(disparoPajaro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
    
    public void reset(){
        this.i=0;
    }
    
    
}
