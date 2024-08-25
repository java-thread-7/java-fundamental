import java.util.Arrays;
import java.security.SecureRandom;
import java.util.Random;;


public class Array {
    public static void main(String[] args) {
        
        int LOWER_BOUND = 1;
        int UPPER_BOUND = 100;
        int ARRAY_SIZE = 10;

        int arr[] = new int[ARRAY_SIZE];

        Arrays.setAll(arr, r -> new SecureRandom().nextInt(LOWER_BOUND, UPPER_BOUND));

        System.out.println(Arrays.toString(arr));

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
          arr[i] = random.nextInt(LOWER_BOUND,UPPER_BOUND);
        }

        System.out.println(Arrays.toString(arr));

        int arr1[] = random.ints(ARRAY_SIZE, LOWER_BOUND, UPPER_BOUND).toArray();

        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr.length; i++) {
          arr[i] = (int) (Math.random() * (UPPER_BOUND - LOWER_BOUND)) + LOWER_BOUND;
        }

        System.out.println(Arrays.toString(arr));

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Dimas";
        stringArray[1] = "Ady";
        stringArray[2] = "Yudhana";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Grace";

        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Dimas", "Ady", "Yudhana"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
          1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
          10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Peter", "Zalai"},
                {"Carlo", "Lodigiani"},
                {"Barker"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
