/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i16036
 */
public class Calculator {
    public Calculator(){
    
        
    }
    
    public float plus(float a, float b){
        
        
    }
    
    public float minus(float a, float b){
        
        
    }
    
    /**
     * Multiplies between 2 numbers.
     * @param a a
     * @param b b
     * @return a*b
     */
    public float multiply(float a, float b){
        return a*b;
    }
    
    /**
     * Divide between 2 given numbers.
     * 
     * This method will eventually returns 0 whenever b is 0.
     * @param a a
     * @param b b
     * @return a/b
     */
    public float division(float a, float b){
        if(b==0) {
            return 0;
        }
        return a/b;
    }
}
