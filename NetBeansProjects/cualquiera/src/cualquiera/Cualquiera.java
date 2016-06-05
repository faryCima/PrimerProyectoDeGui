/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cualquiera;

import java.util.Scanner;

/**
 *
 * @author faride
 */
public class Cualquiera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("calcule el area de cualquier triangulo");
          double a, b, c;
          System.out.print("ingrese el lado a:");
           a = Double.parseDouble (s.next());
      System.out.print("ingrese el lado b:");
           b = Double.parseDouble (s.next());
 System.out.print("ingrese el lado c:");
           c = Double.parseDouble (s.next());   
           double p, area;
             p = (a + b + c) / 2;
           area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
           System.out.println("El area es:" + Double.toString(area));
    }
    
}
