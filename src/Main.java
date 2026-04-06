public class Main {
  
  public static void main (String[] args) {
    System.out.println("--- SISTEM PENJUALAN TIKET KERETA API ---");
    System.out.println("1. Kelas Eksekutif: Rp. 600.000 + Fasilitas");

        // Polimorfisme: Tipe data 'Tiket' tapi isinya 'KelasEksekutif'
        Tiket t1 = new KelasEksekutif("Reza", 600000);
        Tiket t2 = new KelasEkonomi("Mavied", 200000);

        // Cetak Tiket 1
        System.out.println("\nPenumpang: " + t1.getNama());
        System.out.println("Total Bayar: Rp. " + t1.hitungTotalHarga());
        
        // Pengecekan apakah t1 punya layanan tambahan (Downcasting)
        if (t1 instanceof LayananTambahan) {
            LayananTambahan layanan = (LayananTambahan) t1;
            layanan.servisMakan();
            layanan.bagasiEkstra();
        }

        System.out.println("-----------------------------------------");
        System.out.println("2. Kelas Ekonomi: Rp. 200.000 (Tanpa Fasilitas)");
        // Cetak Tiket 2
        System.out.println("Penumpang: " + t2.getNama());
        System.out.println("Total Bayar: Rp. " + t2.hitungTotalHarga());
        System.out.println("Layanan: Standar Ekonomi.");
    }
}
