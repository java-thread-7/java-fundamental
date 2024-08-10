package b.java.oop;

import b.java.oop.Mobil.MobilBuilder;;

public class ProductApp {

    public static void main(String[] args) {

        // Product product01 = new Product();
        
        // product01.generateRandomAlphaStringII();
        // product01.Nama = "CRV";
        // product01.Merek = "Honda";

        // Product product02;
        // product02 = new Product();

        // product02.generateRandomAlphaStringII();
        // product02.Nama = "XPorce";
        // product02.Merek = "Mitsubishi";

        Product product01 = new Product("CRV", "Honda");
        product01.generateRandomAlphaStringII();
        product01.cetakProduct();

        Product product02;
        product02 = new Product("XPorce", "Mitsubishi");
        product02.generateRandomAlphaStringII();
        product02.cetakProduct();

        MobilBuilder mobilBuilder = new MobilBuilder();
        Mobil mobil01 = mobilBuilder
        .make("Ford")
        .model("F")
        .tipeBahanBakar("solar")
        .warna("hitam")
        .build();

        mobil01.cetakMobil();

        Mobil mobil02 = mobilBuilder
        .make("Jimny")
        .warna("putih")
        .tipeBahanBakar("bensin")
        .model("F")
        .build();

        mobil02.cetakMobil();

    }

}
