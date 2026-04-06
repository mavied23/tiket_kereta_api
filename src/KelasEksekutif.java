public class KelasEksekutif extends Tiket implements LayananTambahan {

    public KelasEksekutif(String nama, double harga) {
        super(nama, harga); // superclass Mengirim data ke konstruktor induk atau tiket
    }

    @Override
    public double hitungTotalHarga() {
        // Polimorfisme: Harga Eksekutif ditambah biaya fasilitas 500rb
        return this.hargaDasar + 500000;
    }

    @Override
    public void servisMakan() { // Implementasi method dari interface LayananTambahan
        System.out.println("Layanan: Mendapatkan paket nasi box dan air mineral.");
    }

    @Override
    public void bagasiEkstra() {// Implementasi method dari interface LayananTambahan
        System.out.println("Layanan: Mendapatkan kuota bagasi ekstra hingga 20kg.");
    } 
  
}
