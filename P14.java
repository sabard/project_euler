public class P14 {
    public static void main(String[] args) {
        StdOut.print("Enter N: "); 
        int N = StdIn.readInt(); 
        
        SeparateChainingHashST<Integer, Integer> st = new SeparateChainingHashST<Integer, Integer>(); 
        
        int current; 
        int chain; 
        int max = 0; 
        
        for (int i = 1; i < N; i++) {
            current = i; 
            chain = 0; 
            while (current != 1) {
                if (st.contains(current)) {
                    chain += st.get(current); 
                    break; 
                }
                else if (current % 2 == 0) {
                    current /= 2; 
                }
                else {
                    current = 3 * current + 1; 
                }
                chain++; 
            }
            st.put(i, chain); 
            StdOut.println(st.get(i)); 
            if (chain > max) max = i; 
        }
        
        StdOut.println(max); 
    }
}