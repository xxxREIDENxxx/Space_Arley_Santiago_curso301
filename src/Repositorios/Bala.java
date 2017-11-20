/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author home
 */
public class Bala {
    
    int x;
    int y;
    
    Toolkit t = Toolkit.getDefaultToolkit ();
    Image imagen = t.getImage ("img/bala2.png");
    
    JLabel figura;

    public Bala(int x, int y) {
        this.x = x;
        this.y = y;
        /*
        String path = "../imagenes/bala.png";
        URL url = this.getClass().getResource(path);  
        ImageIcon icon = new ImageIcon(url);*/
        ImageIcon imagen = new ImageIcon("img/bala2.png");
        
        figura = new JLabel();
       // figura.setText("hola");
        figura.setSize(30, 30);
        figura.setLocation(x, y);
        figura.setIcon(imagen);
        //figura.setIcon(icon);
    }
    
    public void avanzar(){
        y -= 1;
        figura.setLocation(x, y);
    }
    
    public boolean fueraPantalla(){
        if(y <= 0){
            return true;
        }
        return false;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
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

    public JLabel getFigura() {
        return figura;
    }

    public void setFigura(JLabel figura) {
        this.figura = figura;
    }
    
    
    
}
