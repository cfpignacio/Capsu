/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capsu;

/**
 *
 * @author Notebook
 */
public class Capsu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mesa m1;
        m1 = new Mesa();
        
        
        m1.setAncho(-1);
        m1.setLargo(250);
        
        
        System.out.println("Ancho " + m1.getAncho());
        
        System.out.println("Largo " + m1.getLargo());
        
        
        
        
    }
    
}
