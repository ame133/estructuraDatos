/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_tiempo;

/**
 *
 * @author moviles
 */
public class Eva1_7_TIEMPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros [] = new int[9000000];
        long ini =System.nanoTime();
        for (int i = 0; i < numeros.length; i++){
        numeros[i] = 100;
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
    
}
