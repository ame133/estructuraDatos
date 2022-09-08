/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_copiaarreglo;

/**
 *
 * @author moviles
 */
public class Eva1_15_copiaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arregloDatos = new int[100]; 
        llenar(arregloDatos);
        imprimir(arregloDatos);
        //copiar los valores almacenados en el arreglo
        int[] arregloCopia = new int [arregloDatos.length];
        System.out.println("");
        System.out.println(arregloDatos);
        System.out.println(arregloCopia);
        int indice = arregloDatos.length -1;
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloCopia[i] =arregloDatos[indice];
            indice--;
        }
        //imprimir 
        imprimir(arregloCopia);
    }
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] =(int)(Math.random()*100);
        }
    }
     public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
    
        }
     }
}
