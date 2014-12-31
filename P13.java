import java.math.BigInteger; 
public class P13 {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("0"); 
        while (!StdIn.isEmpty()) {
            BigInteger j = new BigInteger(StdIn.readLine()); 
            i = i.add(j); 
        }
        
        StdOut.println(i); 
    }
}