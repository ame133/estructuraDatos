/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_gdc;

/**
 *
 * @author moviles
 */
public class Eva1_19_GDC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(gcd(48,36));
    }
    public static int gcd(int dividendo, int divisor){
        int residuo;
        residuo = dividendo % divisor;

        if (residuo == 0) {
            return divisor;
        }else{
            return gcd(divisor, residuo);
        }
    }
}
