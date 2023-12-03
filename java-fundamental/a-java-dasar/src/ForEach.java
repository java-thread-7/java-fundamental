public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Dimas", "Ady" ,"Yudhana",
                "Peter", "Zalai"
        };

        for(var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("For each implementation");
        for(String name : names) {
            System.out.println(name);
        }
    }
}
