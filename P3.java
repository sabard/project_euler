import java.util.Scanner; 
import java.util.LinkedList; 
public class P3 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter N: "); 
        long N = s.nextLong(); 
        
        LinkedList<Integer> factors = new LinkedList<Integer>(); 
        int i = 2, largest = 0; 
        
        while (N > 1) {
            if (N % i == 0) {
               factors.add(i); 
               N /= i;  
            }
            i++; 
        }
        
        boolean prime = true; 
        
        for (int a : factors) {
            prime = true; 
            for (int b = 2; b < a; b++) {
                if (a % b == 0) prime = false;
            }
            if (prime) largest = a; 
        }
        System.out.println(largest); 
    }   
}