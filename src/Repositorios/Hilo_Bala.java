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
    
    boolean vivo = true;
    
    Ventana ventana;

    public Hilo_Bala(Bala b, Ventana v) {
        this.ventana = v;
        this.bala = b;
        System.out.println("SE creo el hilo");
    }

    @Override
    public void run() {
        while(!this.bala.fueraPantalla()){
            try {
                this.bala.avanzar();
                sleep(5);
            } catch (Exception e) {
            }
        }
        
        ventana.remove(bala.getFigura());
        ventana.repaint();
        
        vivo = false;
        
    }
    
    public boolean vivo(){
        return vivo;
    }

    public Bala getBala() {
        return bala;
    }

    public void setBala(Bala bala) {
        this.bala = bala;
    }
    
    
}
