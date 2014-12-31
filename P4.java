public class P4 {
    
    public static void main(String[] args) {
        int sum; 
        int b, e, x = 10000, max = 0; 
        String tmp; 
        boolean p; 
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                sum = i*j; 
                tmp = Integer.toString(sum); 
                p = true; 
                
                for (int a = 0; a < tmp.length(); a++) {
                    if (tmp.charAt(a) != tmp.charAt(tmp.length()-a-1)) p = false; 
                    if (tmp.length() - 1 < 2 * a) break; 
                }
                
                if (p && sum > max) max = sum; 
            }
        }
        System.out.println(max); 
    }   
}