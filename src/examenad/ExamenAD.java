/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenad;

import java.awt.EventQueue;

/**
 *
 * @author Usuario
 */
public class ExamenAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable() {
            @Override
                public void run() {
                    try {
                        Ventana ventana = new Ventana();
                        ventana.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        });
    }
    
}
