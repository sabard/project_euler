import java.util.LinkedList; 
import java.math.BigInteger; 
public class P266 {
    
    public static void main(String[] args) { 
        StdOut.println("Enter N: "); //enter 190
        int N = StdIn.readInt(); 
        
        int[] primes = new int[N]; 
        
        for (int i = 2; i < N; i++) {
            primes[i-2]=i; 
        }
        
        
        for (int i = 2; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (primes[j] % i == 0  && primes[j] != i) primes[j] = 0;  
            }
        }
        
        BigInteger product = new BigInteger("1"); 
        for (int i = 0; i < N; i++) {
            BigInteger j = new BigInteger(Integer.toString(primes[i])); 
            if (primes[i] != 0) product = product.multiply(j); 
        }
       
        BigInteger psr = new BigInteger(product.toString()); 
        while (psr.pow(2).compareTo(product) == 1) {
            psr = psr.divide(new BigInteger("2")); 
        }
        while (psr.pow(2).compareTo(product) == -1) {
            psr = psr.add(new BigInteger("1"));    
        }
        while (true) {
            if (product.mod(psr).intValue() == 0) {
                break; 
            }
            psr  = psr.subtract(new BigInteger("1")); 
        }
        StdOut.println(psr.mod(new BigInteger("10000000000000000"))); 
    }   
}