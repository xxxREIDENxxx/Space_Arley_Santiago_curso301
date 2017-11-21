/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import java.util.ArrayList;
import movimiento.Ventana;

/**
 *
 * @author home
 */
public class Hilo_Bala extends Thread{
    
    Bala bala;
    
    Ventana ventana;

    public Hilo_Bala(Bala b, Ventana v) {
        this.ventana = v;
        this.bala = b;
    }

    @Override
    public void run() {
        while(!this.bala.fueraPantalla()){
            try {
                this.bala.avanzar();
                         
                ventana.repaint();
                for(int i = 0; i < ventana.getAliens().size(); i++){
                    if(bala.choque(ventana.getAliens().get(i)) == true){
                        ventana.getAliens().remove(i);
                        i--;
                    }
                }    
                 
                sleep(5);
            } catch (Exception e) {
            }
        }
       
        ventana.getHilos().remove(this);
        
    }

    public Bala getBala() {
        return bala;
    }

    public void setBala(Bala bala) {
        this.bala = bala;
    }
    
    
}
