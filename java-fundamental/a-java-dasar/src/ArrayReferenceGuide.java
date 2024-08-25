import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.reflect.Array;
import java.util.List;
public class ArrayReferenceGuide {
    
    public static void main(String[] args) {

        declaration();

        initialization();

        getLength();

        access();

        iterating();

        varArgs();

        transformIntoList();

        sort();

        search();

        merge();

    }   
    
    private static void declaration() {
        
        int[] anArray;
        int anotherArray[];
    
    }

    private static void initialization() {
        
        int[] anArray = new int[10];
        anArray[0] = 10;
        anArray[5] = 4;

        int[] anotherArray = new int[] { 1,2,3,4,5 };

    }

    private static void getLength() {
        int[] anArray = new int[] { 1,2,3,4,5 };
        System.out.println("anArray's length: " + anArray.length);
    
        System.out.println("[Array.getLength()] anArray's length: " + Array.getLength(anArray));

        Object arrayAsObj = anArray;
        System.out.println("the array object (anArray) 's length: " + Array.getLength(arrayAsObj));
    }

    private static void access() {
        int[] anArray = new int[10];
        anArray[0] = 10;
        anArray[5] = 4;

        System.out.println(anArray[0]);
    }

    private static void iterating() {
        int[] anArray = new int[] { 1,2,3,4,5 };
        for ( int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }

        for (int element : anArray) {
            System.out.println(element);
        }

        int j = 0;
        while(j < anArray.length) {
            System.out.println(anArray[j]);
            j++;
        }

        int k = 0;
        do {
            System.out.println(anArray[k]);
            k++;
        } while(k < anArray.length);
    }

    private static void varArgs() {
        String[] groceries = new String[] {
            "Indomie",
            "Cap Panda",
            "Merica Bubuk",
        };

        varArgMethod(groceries);

        varArgMethod("Babi", "Ayam", "Lele");
        
    }

    private static void varArgMethod(String... varArgs) {
        for (String element: varArgs) {
            System.out.println(element);
        }
    }

    private static void transformIntoList() {

        Integer[] anArray = new Integer[] {
            1,
            2,
            3,
            4,
            5,
        }; 

        // native impl
        List<Integer> aList = new ArrayList<>();
        for (int element : anArray) {
            aList.add(element);
        }

        // pretty impl
        aList = Arrays.asList(anArray);

        try {
            aList.remove(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("remove(0)" + e.getMessage());
        }

        try {
            aList.add(6);
        } catch (UnsupportedOperationException e) {
            System.out.println("add(6)" + e.getMessage());
        }

        // int[] anotherArray = new int[] {
        //     1,
        //     2,
        //     3,
        //     4,
        //     5,
        // }; 

        // List<Integer> bList = Arrays.asList(anotherArray); 

        // System.out.println(bList);

    }

    private static void sort() {
        int[] anArray = new int[] { 5,4,3,2,1 };
        Arrays.sort(anArray);

        for (int i = 0; i < anArray.length; i++ ) {
            System.out.println(anArray[i]);
        }

        Integer[] anotherArray = new Integer[] { 5,4,3,2,1 };
        Arrays.sort(anotherArray);

        Integer i = 0;
        while (i < anArray.length) {
            System.out.println(anotherArray[i]);
            i++;
        }

        String[] yetAnotherArray = new String[] { "A", "E", "Z", "B",  "C" };
        Arrays.sort(yetAnotherArray, 1, 3, Comparator.comparing(String::toString).reversed());

        for (String element: yetAnotherArray) {
            System.out.println(element);
        }
        
    }

    private static void search() {
        int[] anArray = new int[] { 5,4,3,8,2 };
        
        // native impl
        for (int i = 0; i < anArray.length; i++ ) {
            if (anArray[i] == 8) {
                System.out.println("8 at index ke : " + i);
                break;
            }
        }

        // pretty impl
        Arrays.sort(anArray);
        int i = Arrays.binarySearch(anArray, 8);

        System.out.println("8 at index ke : " + i);

    }

    private static void merge() {

        int[] anArray = new int[] { 3,9,5,7,6 };
        int[] anotherArray = new int[] { 2,8,4,7,6 };

        System.out.println("---");

        // klasik impl
        int[] resultArray = new int[anArray.length + anotherArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (i < anArray.length ? anArray[i] : anotherArray[i - anArray.length]);
        }

        int i = 0;
        while (i < resultArray.length) {    
            System.out.println(resultArray[i]);
            i++;
        }

        System.out.println("---");

        // pretty impl
        Arrays.setAll(resultArray, j -> (j < anArray.length ? anArray[j] : anotherArray[j - anArray.length]));
        for (int element : resultArray){
            System.out.println(element);
        }

    }

}
