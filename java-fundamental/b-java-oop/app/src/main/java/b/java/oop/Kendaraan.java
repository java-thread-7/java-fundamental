package b.java.oop;

public class Kendaraan {
    
    private String tipeBahanBakar;
    private String warna;

    public Kendaraan(KendaraanBuilder builder) {
        
        this.tipeBahanBakar = builder.tipeBahanBakar;
        this.warna = builder.warna;

    }

    public String getTipeBahanBakar() {
        return tipeBahanBakar;
    }

    public String getWarna() {
        return warna;
    }

    public static class KendaraanBuilder {
        
        protected String tipeBahanBakar;
        protected String warna;

        public KendaraanBuilder tipeBahanBakar(String tipeBahanBakar) {
            this.tipeBahanBakar = tipeBahanBakar;
            return this;
        }

        public KendaraanBuilder warna(String warna) {
            this.warna = warna;
            return this;
        }

        public Kendaraan build() {
            return new Kendaraan(this);
        }

    }

}
