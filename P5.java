import java.util.Scanner; 
public class P5 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter N: "); 
        int N = s.nextInt(); 
        boolean solved = false; 
        int i = N;  
        while(!solved) {
            for (int j = 1; j <= N; j++) {
                if (i % j != 0) break; 
                if (j == N) solved = true; 
            }
            i++; 
        }
        System.out.println(i-1); 

    }   
}