import java.util.Scanner; 
public class P7 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter N: "); 
        int N = s.nextInt(); 
        int i = 1; 
        int prime = 2;
        boolean isPrime; 
        while (i < N) {
            prime++;
            isPrime = true; 
            for (int j = 2; j < prime; j++) {
                if (prime % j == 0) isPrime = false; 
            }
            if (isPrime) i++; 
        }
        System.out.println(prime); 

    }   
}