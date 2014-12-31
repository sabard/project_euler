public class P12 {
    public static void main(String[] args) {
        StdOut.print("Enter N: "); 
        int N = StdIn.readInt(); 
        
        int divisors = 0; 
        int count = 0; 
        long c = 0; 
        
        while (divisors < N) {
            divisors = 0; 
            count ++; 
            c += count; 
            
            for (int i = 1; i * i <= c; i++) {
                if (c % i == 0) {
                    divisors += 2; 
                }
            }  
        }
        
        StdOut.println(c); 
    }
}