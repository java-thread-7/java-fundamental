package b.java.oop;

import b.java.oop.Kendaraan.KendaraanBuilder;

public class Mobil extends Kendaraan{

    private String make;
    private String model;

    public Mobil(MobilBuilder builder) {
        super(builder);
        this.make = builder.make;
        this.model = builder.model;
    }

    public void cetakMobil() {
        System.out.println("Make: " + make + ", Model: " + model + ", Warna: " + getWarna() + ", Tipe Bahan Bakar: " + getTipeBahanBakar());
    }

    public static class MobilBuilder extends KendaraanBuilder {
        
        protected String make;
        protected String model;

        @Override
        public MobilBuilder warna(String warna) {
            this.warna = warna;
            return this;
        }

        @Override
        public MobilBuilder tipeBahanBakar(String tipeBahanBakar) {
            this.tipeBahanBakar = tipeBahanBakar;
            return this;
        }

        public MobilBuilder make(String make) {
            this.make = make;
            return this;
        }

        public MobilBuilder model(String model) {
            this.model = model;
            return this;
        }

        public Mobil build() {
            return new Mobil(this);
        }

    }

}
