import java.util.Arrays;
import java.util.List;

public class LoopControlForEach {
    
    public static void main(String[] args) {
        
        List<Integer> n = Arrays.asList(10, 20, 30, 40, 50);

        for(Integer i : n) {
            System.out.print( i );
            System.out.print(", ");
        }

        Customer[] customers = {
            new Customer(1, "A"), 
            new Customer(2, "B"),
            new Customer(3, "C")
        };

        for(Customer customer:customers) {
            System.out.print(customer);
            System.out.print(", ");
        }

    }

}

class Customer {
    int id;
    String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "( " + this.id + ". " + this.name + ")";
    }

}