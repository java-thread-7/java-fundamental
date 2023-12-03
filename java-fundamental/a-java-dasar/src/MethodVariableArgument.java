public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80,50,50,50,80};
        sayCongrats("Zalai", values);
        sayCongrats("Dimas", 80,90,76,88);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for(var value : values) {
            total += value;
        }

        var finalValue = total / values.length;
        if(finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus.");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }
}
