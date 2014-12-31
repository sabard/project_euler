import java.math.BigInteger; 
public class P16 {
    public static void main(String[] args) {
        StdOut.println("Enter N: "); 
        int N = StdIn.readInt(); 
        BigInteger b = new BigInteger("2"); 
   
        b = b.pow(N); 
        
        String s = b.toString(); 
        int sum = 0; 
        for (int i = 0; i < s.length(); i++) {
           sum += Integer.parseInt(s.substring(i, i+1));    
        }
        
        StdOut.println(sum); 
    }
}