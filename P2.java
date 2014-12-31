import java.util.Scanner; 
public class P2 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter N: "); 
        int N = s.nextInt(); 
        long sum = 0; 
        int n1 = 1, n2 = 1; 
        while (n1 + n2 < N) {
            int nSum = n1 + n2; 
            if (nSum % 2 == 0) {
                sum += nSum; 
            }
            if (n1 > n2) n2 = nSum; 
            else n1 = nSum; 
        }
        System.out.println("Sum: " + sum); 
    }   
}