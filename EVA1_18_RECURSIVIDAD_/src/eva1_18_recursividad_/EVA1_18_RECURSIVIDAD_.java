/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_recursividad_;

/**
 *
 * @author moviles
 */
public class EVA1_18_RECURSIVIDAD_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        falsoForDes(5);
        System.out.println("");
        falsoForAsc(1,5);
    }
    
    //FALSO FOR
    //IMPRIMIR UNA LISTA EDE NUMEROS DE MAYOR A MENOR (DE MANERA RECURSIVA)
    //RECIBO UN VALOR FALSOFORDES (5) ---> 5-4-3-2-1
    
    public static void falsoForDes(int valor){
        
        /*
        que voy a hacer "IMPRIMIR VALOR"
        llamada recursiva "falsoForDes(valor - 1)"
        detener la llamada recursiva "cuando valor - 1"
        Si es 1 me dentengo, si no, llamada recursiva
        */
        
        if (valor > 0) {
            System.out.print(valor + " - ");
            falsoForDes(valor-1);
        }
    }
    
    /*
    falsoForAsc (5,1) ----> 1-2-3-4-5
    */
    
    public static void falsoForAsc(int valor, int ini){
        if (valor <= ini) {
            System.out.print(valor + " - ");
            falsoForAsc(valor+1,ini);
        }
    }
}
