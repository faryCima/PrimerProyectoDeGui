/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyectogui;

import gui.Bienvenido;

/**
 *
 * @author faride
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bienvenido ventana = new Bienvenido();
        ventana.setVisible(true);
    }
     public static void p(double d ) { 
        System.out.printf("%.2f",d);
        System.out.println();
    }
 
}
