/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_22_fibonacci;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class Eva1_22_fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int posicion;
        System.out.println("Ingrese la posicion: ");
        posicion=scn.nextInt();
        System.out.println("el numero en la posicion ingresada es: " + Fibonacci(5));
        for (int i = 0; i <= posicion; i++) {
            System.out.print(Fibonacci(i) + " , ");
        }

    }
    public static int Fibonacci (int num){
        if (num == 0){
            return 1;
        }else if (num == 1){
            return 1;
        }else{
            return Fibonacci(num-1) + Fibonacci(num-2);
        }
            
        
    }
    
}
