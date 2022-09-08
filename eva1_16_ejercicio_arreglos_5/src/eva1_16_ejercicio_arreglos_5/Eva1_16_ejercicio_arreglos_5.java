/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_ejercicio_arreglos_5;

/**
 *
 * @author moviles
 */
public class Eva1_16_ejercicio_arreglos_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = new int [50];
        int cont = 0;
        int j= 0;
        
        System.out.println("Arreglo original: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*100)+1;
            System.out.print(numeros[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Numeros pares: ");
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                cont++;
                System.out.print(numeros[i] + " ");
            }  
        }
        int [] pares = new int [cont];
        System.out.println(" ");
        System.out.println("Arreglo pares");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                pares [j] = numeros[i];
                j++;
                System.out.print(pares[j]);
            }  
        }
    }
    
}
