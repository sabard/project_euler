public class P9 {
    public static void main(String[] args) {
        int N = 1000; 
        int c; 
        for (int a = 1; a < 1000; a++) {
           for (int b = a; b < 1000; b++) {
               c = 1000 - a - b; 
                   if (a*a + b*b == c*c) StdOut.println(a*b*c); 
           } 
        }
    }
}