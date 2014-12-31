public class P30 {
    public static void main(String[] args) {
     
        int sum, totSum = 0; 
        Bag<Integer> b = new Bag<Integer>(); 
        for (int i = 10; i < 354294; i++) { // 6*9**5
            String s = Integer.toString(i); 
            sum = 0; 
            for (int j = 0; j < s.length(); j++) {
                int d = Integer.parseInt(s.substring(j, j+1)); 
                sum += Math.pow(d, 5); 
            }
            if (sum == i) {
                totSum += sum; 
            }
        }
        
       StdOut.println(totSum); 
    }
}