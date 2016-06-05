/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular;

import java.util.Scanner;

/**
 *
 * @author faride
 */
public class Modular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("calcule sus pesos");
        Scanner S = new Scanner(System.in);
        System.out.print("ingrese la cantidad de centavos:");
        int centavos = Integer .parseInt(S.next ());
        int pesos = centavos / 100;
        int residuo = centavos % 100;
        
           System.out.println("pesos: " + pesos);
           System.out.println("centavos: " + residuo);
           
           System.out.println(" $ " + pesos + "." + residuo);


        
}
}
