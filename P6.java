import java.util.Scanner; 
public class P6 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter N: "); 
        int N = s.nextInt(); 
        
        int sumSquares = 0, squareSum = 0;
        
        for (int i = 1; i <= N; i ++) {
            sumSquares += i * i; 
            squareSum += i; 
        }
        
        System.out.println(squareSum * squareSum - sumSquares); 

    }   
}