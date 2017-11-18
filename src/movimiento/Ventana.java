/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimiento;

import Repositorios.Bala;
import Repositorios.Hilo_Bala;
import Repositorios.MovimientoCara;
import Repositorios.disparoPajaro;
import java.util.ArrayList;

/**
 *
 * @author Clint
 */
public class Ventana extends javax.swing.JFrame {
    
    ArrayList<Hilo_Bala> hilos;

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        hilos = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cañon = new javax.swing.JLabel();
        bala = new javax.swing.JLabel();
        cara = new javax.swing.JLabel();
        disparo = new javax.swing.JLabel();
        cañon1 = new javax.swing.JLabel();
        bala1 = new javax.swing.JLabel();
        cañon2 = new javax.swing.JLabel();
        bala2 = new javax.swing.JLabel();
        cañon3 = new javax.swing.JLabel();
        bala3 = new javax.swing.JLabel();
        cañon4 = new javax.swing.JLabel();
        bala4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        cañon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panda.jpg"))); // NOI18N

        bala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/what.png"))); // NOI18N

        cara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cara.jpg"))); // NOI18N
        cara.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                caraAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        disparo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pajaro.png"))); // NOI18N

        cañon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panda.jpg"))); // NOI18N

        bala1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/what.png"))); // NOI18N

        cañon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panda.jpg"))); // NOI18N

        bala2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/what.png"))); // NOI18N

        cañon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panda.jpg"))); // NOI18N

        bala3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/what.png"))); // NOI18N

        cañon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panda.jpg"))); // NOI18N

        bala4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/what.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bala)
                    .addComponent(cañon))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bala1)
                    .addComponent(cañon1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bala2)
                            .addComponent(cañon2))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bala3)
                            .addComponent(cañon3))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bala4)
                            .addComponent(cañon4)))
                    .addComponent(disparo)
                    .addComponent(cara))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon)
                        .addGap(38, 38, 38)
                        .addComponent(bala))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon1)
                        .addGap(38, 38, 38)
                        .addComponent(bala1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon2)
                        .addGap(38, 38, 38)
                        .addComponent(bala2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon3)
                        .addGap(38, 38, 38)
                        .addComponent(bala3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon4)
                        .addGap(38, 38, 38)
                        .addComponent(bala4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(disparo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cara)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_caraAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_caraAncestorAdded

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        int x = cara.getX();
        int y = cara.getY();
        
        
        //System.out.println(x+y);
        //System.out.println(evt.getKeyChar());
        if(evt.getKeyCode()==39){
            x=x+15;
            if(x>450){
                x=450;
            }
            cara.setLocation(x, y);
        }
        if(evt.getKeyCode()==37){
            x=x-15;
            if(x<5){
                x=5;
            }
            cara.setLocation(x, y);
        }
        
        if(evt.getKeyCode()==38){
            //disparoPajaro d = new disparoPajaro(cara,disparo);
            //d.start();
            int posX = cara.getX();
            int posY = cara.getY();
            
            Bala b = new Bala(posX, posY);
            
            this.add(b.getFigura());
            
            Hilo_Bala hilo;
            hilo = new Hilo_Bala(b, this);
            hilo.start();
            
            hilos.add(hilo);
            
            for(int i = 0; i < hilos.size(); i++){
                if(!hilos.get(i).vivo()){
                    hilos.remove(i);
                    i--;
                }
            }
            
        }
        
        if(evt.getKeyChar()=='x'){
        MovimientoCara accion1 = new MovimientoCara(bala1,bala1.getX(),bala1.getY(),disparo);      
        accion1.start();
        }
        
        if(evt.getKeyChar()=='c'){
        MovimientoCara accion2 = new MovimientoCara(bala2,bala2.getX(),bala2.getY(),disparo);
        accion2.start();
        }
        
        if(evt.getKeyChar()=='v'){
        MovimientoCara accion3 = new MovimientoCara(bala3,bala3.getX(),bala3.getY(),disparo);
        accion3.start();
        }
        
        if(evt.getKeyChar()=='b'){
        MovimientoCara accion4 = new MovimientoCara(bala4,bala4.getX(),bala4.getY(),disparo);
        accion4.start();
        }
        
        if(evt.getKeyChar()=='z'){
        MovimientoCara accion5 = new MovimientoCara(bala,bala.getX(),bala.getY(),disparo);
        accion5.start();
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bala;
    private javax.swing.JLabel bala1;
    private javax.swing.JLabel bala2;
    private javax.swing.JLabel bala3;
    private javax.swing.JLabel bala4;
    private javax.swing.JLabel cara;
    private javax.swing.JLabel cañon;
    private javax.swing.JLabel cañon1;
    private javax.swing.JLabel cañon2;
    private javax.swing.JLabel cañon3;
    private javax.swing.JLabel cañon4;
    private javax.swing.JLabel disparo;
    // End of variables declaration//GEN-END:variables
}