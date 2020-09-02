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
public class Mesa {
    // Encapsulamiento
    private int largo;
    private int ancho;
    
    // set largo
    public void setLargo(int largo){
        if(largo>0) this.largo = largo;
    }
    
    // get largo
    public int getLargo(){
        return largo;
    }
    
    //set ancho
    public void setAncho(int ancho){
        if(ancho>0) this.ancho = ancho;
    }
    
    // get ancho
    public int getAncho(){
         return ancho;
    }
    
}
