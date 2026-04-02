public class KelasEkonomi extends Tiket {
  public KelasEkonomi(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungTotalHarga() {
        // Harga ekonomi tetap sesuai harga dasar
        return this.hargaDasar;
    }
}
