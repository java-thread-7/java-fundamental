package b.java.oop;

import java.nio.charset.Charset;
import java.util.Random;

class Product {
    String id;
    String nama;
    String merek;

    Product(String nama, String merek){
        this.nama = nama;
        this.merek = merek;
    }

    String generatedRandomUnboundedString() {
        
        byte[] array = new byte[7];
        new Random().nextBytes(array);

        String generatedId = new String(array, Charset.forName("UTF-8"));

        id = generatedId;

        return id;
    
    }

    String generateRandomAlphaStringI() {
        int leftLimit = 65;
        int rightLimit = 90;
        int length = 5;
        Random random = new Random();

        String generatedId = random.ints(leftLimit, rightLimit + 1)
            .limit(length)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

            id = generatedId;
        return id;
    }

    String generateRandomAlphaStringII() {
        int leftLimit = 0;
        int rightLimit = 35;
        int length = 5;
        Random random = new Random();

        String generatedId = random.ints(leftLimit, rightLimit + 1)
            .map(i -> i < 10 ? i + 48 : i + 55)
            .limit(length)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

        id = generatedId;
        return id;
    }

     void cetakProduct() {
        System.out.println("id: " + this.id + " Nama: " + this.nama + " Merek: " + this.merek);
     }
    
}
