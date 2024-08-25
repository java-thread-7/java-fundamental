public class StatementIfElse {
    
    public static void main(String[] args) {
        
        /*
        int x = 50;

        if(x < 25) {
            System.out.println("kondisi di dalam blok 'if' akan di eksekusi.");
        } else {
            System.out.println("kondisi di dalam blok 'else' akan di eksekusi.");
        }
        */

        /*
        double x = 30.0;

        if (x == 10.0) {
            System.out.println("nilai x adalah 10.0");
        } else if (x == 20.0) {
            System.out.println("nilai x adalah 20.0");
        } else if (x == 30.0) {
            System.out.println("nilai x adalah 30.0");
        } else {
            System.out.println("kondisi di dalam blok 'else' akan di eksekusi");
        }
        */

        double x = 10.0, y = 20.0, z = 30.0;

        if ( x >= y ) {
            
            if ( x > z ) {
                System.out.println(x + " paling besar");
            } else {
                System.out.println(z + " paling besar");
            }

        } else {

            if ( y >= z ) {
                System.out.println(y + " paling besar");
            } else {
                System.out.println(z + " paling besar");
            }

        }

    }
    
}
