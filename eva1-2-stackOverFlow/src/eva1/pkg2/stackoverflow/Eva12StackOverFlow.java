/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1.pkg2.stackoverflow;

/**
 *
 * @author moviles
 */
public class Eva12StackOverFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A();
    }
    
    public static void A(){
        B();
    }
    
    public static void B(){
        A();
    }
    
}
