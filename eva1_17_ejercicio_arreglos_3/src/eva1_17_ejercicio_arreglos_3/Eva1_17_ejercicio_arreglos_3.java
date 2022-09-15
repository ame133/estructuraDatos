/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_ejercicio_arreglos_3;

/**
 *
 * @author moviles
 */
public class Eva1_17_ejercicio_arreglos_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int [5][5];
        llenar(matriz);
        imprimir(matriz);
        //CREAR UNA COPIA DE LA MATRIZ EN ORDEN INVERTIDO
        int [][] copia = new int [matriz.length][matriz.length];
        int indice = matriz.length -1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                copia[i][j] =[matriz(matriz.length-1)-i];
            indice--;
            }
        }
        imprimir(copia);
    }
    public static void llenar(int[][] arreglo){
        for (int i = 0; i <arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = (int)(Math.random()*100)+1;
            }
        }
    }
     public static void imprimir(int[][] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
