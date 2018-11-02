/**
 * @author Cahyadi Hartanto 2016730036
 * @author Gunawan Chris 2016730011
 */

/**
 * Kelas ini berguna untuk melakukan proses aritmatika.
 */
public class Calculator {
    /**
     * Constructor kelas Calculator
     */
    public Calculator(){
    
        
    }
    
    /**
     * Method ini berguna untuk melakukan proses perjumlahan a dengan b
     * 
     * @param a merupakan angka yang ingin di tambah dengan b
     * @param b merupakan angka yang akan ditambah ke a
     * @return jumlah a dengan b
     */
    public float plus(float a, float b){
        return a+b;
    }
    
    /**
     * Method ini berguna untuk melakukan proses pengurangan a dengan b
     * 
     * @param a merupakan angka yang ingin di kurangi oleh b
     * @param b merupakan angka yang akan mengurangi a
     * @return hasil pengurangan a dengan b
     */
    public float minus(float a, float b){
        return a-b;
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
    
    /**
     * Find the most minimum value on given 2 numbers.
     * 
     * @param a a
     * @param b b
     * @return the most minimum number.
     */
    public float min(float a, float b){
        return (a<b)? a:b;
    }
}
