/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_6_nanotime;

/**
 *
 * @author moviles
 */
public class Eva_1_6_nanoTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long ini =System.nanoTime();
        System.out.println(ini);
        long fin = System.nanoTime();
        System.out.println(fin);
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
    
}
