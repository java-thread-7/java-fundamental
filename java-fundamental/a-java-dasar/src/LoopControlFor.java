public class LoopControlFor {
    
    public static void main(String[] args) {
        
        /*
        for (init; condition; increment) {
            block conditional code
        }
        */

        /*
        for (int x = 10; x < 20; x = x + 1) {
            System.out.print("nilai x : " + x);
            System.out.print("\n");
        }
        */

        // infinite loop
        int x = 10;
        for(;;) {
            
            System.out.print("nilai x : " + x);
            
            x++;

            System.out.print("\n");
            
        }

    }

}
