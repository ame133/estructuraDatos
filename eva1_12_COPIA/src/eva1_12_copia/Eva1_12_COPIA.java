/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_copia;

/**
 *
 * @author moviles
 */
public class Eva1_12_COPIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, copiaValor;
        valor =100;
        copiaValor = valor;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        valor++;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        //AHORA CON OBJETOS
        PruebaValor prueba = new PruebaValor();
        prueba.x = 1000;
        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia.x = prueba.x;
        System.out.println("AHORA CON OBJETOS");
        System.out.println("Prueba: " + prueba.x);
        System.out.println("Pureba copia: " + pruebaCopia.x);
        prueba.x++;
        System.out.println("Prueba: " + prueba.x);
        System.out.println("Pureba copia: " + pruebaCopia.x);
    }
    
}

class PruebaValor{
    int x; 
    
}
