/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Clint
 */
public class MovimientoCara extends Thread{
    
    ArrayList<Bala> balas;
      
    int i=0;
    JLabel bala,disparo;
    int x,y;
    
    
    public MovimientoCara(JLabel bala,int x,int y,JLabel disparo){
       
        this.bala=bala;
        this.disparo=disparo;
        this.x=x;
        this.y=y;
        
    }
   
    
    
    @Override
    public void run(){
            try {
                for(i=0;i<450;i++){
                                
                    bala.setLocation(x,i);
                    sleep(5);
                
                    if((bala.getY() == disparo.getY())&&(bala.getX()==disparo.getX())){
                        i=0;
                    }
                        if((bala.getY())==450){
                            i=0;
                        } 
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MovimientoCara.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
    
    public void reset(){
        this.i=0;
    }

    
    
    
}
