import java.util.Scanner;
public class P28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        StdOut.print("Enter N: "); 
        int N = StdIn.readInt(); 
        int i = 0; 
        int j = N - 1; 
        int count = N*N-1; 
        int[][] diagonals = new int[N][N];
        diagonals[i][j] = N*N; 
        int d = 0; 
        j--; 


        for (int a = N / 2 * 4 + 1; a > 0; a--) {
            if (d % 4 == 0) {
                while (j != -1 && (diagonals[i][j] == 0)) { 
                    diagonals[i][j] = count;
                    count--; 
                    j--; 
                }
                j++; 
                i++; 
            }
            else if (d % 4 == 1) {
                while (i != N && (diagonals[i][j] == 0)) { 
                    diagonals[i][j] = count;
                    count--; 
                    i++; 
                } 
                i--; 
                j++; 
            }
            else if (d % 4 == 2) {
                while (j != N && (diagonals[i][j] == 0)) { 
                    diagonals[i][j] = count;
                    count--; 
                    j++; 
                }
                j--; 
                i--; 
            }
            else if (d % 4 == 3) {
                while (i != -1 && (diagonals[i][j] == 0)) { 
                    diagonals[i][j] = count;
                    count--; 
                    i--; 
                }
                i++; 
                j--; 
            }
            d++; 
        }
        
        int sum = 0; 
        for (int k = 0; k < N; k++) {
            sum += diagonals[k][k] + diagonals[N-k-1][k]; 
        }
        
        StdOut.println(sum-1); 
    }
}