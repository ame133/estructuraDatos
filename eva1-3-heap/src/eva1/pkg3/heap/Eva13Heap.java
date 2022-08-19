/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1.pkg3.heap;

/**
 *
 * @author moviles
 */
public class Eva13Heap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 10;
        //obj y obj2 guardan REFERENCIAS (direcciones de memoria, java), en otros lenguajes se les llama APUNTADORES
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(i);
        System.out.println(obj.valor);
        System.out.println(obj2);
    }
    
}

class Prueba{
    public int valor = 5;
}
