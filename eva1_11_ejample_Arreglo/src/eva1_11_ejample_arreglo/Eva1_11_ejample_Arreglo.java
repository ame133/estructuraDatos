/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_ejample_arreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Eva1_11_ejample_Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] info ;
        String grupo = JOptionPane.showInputDialog(null, "Ingresa numero de grupos");
        int grupos = Integer.parseInt(grupo);
        info = new int [grupos][];
        //System.out.println(info.length);
        for (int i = 0; i < info.length; i++) {
            String alumno = JOptionPane.showInputDialog(null, "Ingresa numero de alumnos en el grupo: " + (i+1));
            int alumnos =  Integer.parseInt(alumno);
            info [i] = new int [alumnos];
            System.out.println(info[i].length);
            
            for (int j = 0; j < info[i].length; j++) {                
                String calif = JOptionPane.showInputDialog(null, "Ingresa la calificacion");
                int calificaciones = Integer.parseInt(calif);
                info [i][j] = calificaciones;
            }
        }
        
    }
    
}
