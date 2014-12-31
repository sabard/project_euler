import java.util.Scanner; 
public class P1 {
    
    private static final int n1 = 3, n2 = 5; 
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter N: "); 
        int N = s.nextInt(); 
        long sum = 0; 
        for (int i = 1; i < N; i ++) {
            if (i % n1 == 0 || i % n2 == 0) {
                sum += i; 
            }
        }
        System.out.println("Sum: " + sum); 
    }   
}