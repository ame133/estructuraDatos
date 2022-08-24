/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1.pkg4.arreglos;

/**
 *
 * @author moviles
 */
public class Eva14Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TDA tipo abstractos de datos (objetos y clases), arreglos en java
        //TIPO DE DATO [] IDENTIFICADOR = new TIPO DE DATO ();
        //ARREGLO DE ENTEROS PARA CAPTURAR EDADES
        int [] arregloEdades, arregloSalario, arregloCali;
        double arregloPromedio [], porcentaje;
        //los arreglos son objetos
        arregloEdades = new int [50];
        System.out.println(arregloEdades);
        for (int i=0; i<arregloEdades.length; i++){
            arregloEdades[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i<arregloEdades.length; i++){
            System.out.println("["+ i + "] =" + arregloEdades);
        }
    }
    
}
