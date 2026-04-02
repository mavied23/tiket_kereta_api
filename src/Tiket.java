public abstract class Tiket {
  private String namaPenumpang; // Enkapsulasi pake private biar data ga bisa di akses langsung dari luar kelas
  protected double hargaDasar; // Protected biar bisa di akses sama kelas turunannya ( KelasEksekutif dan KelasEkonomi )

  public Tiket(String nama, double harga) {
        this.namaPenumpang = nama;
        this.hargaDasar = harga;
    }

    // Getter untuk mengambil data private
    public String getNama() {
        return namaPenumpang;
    }

    // Abstract method: Wajib di-override oleh anak
    public abstract double hitungTotalHarga();
}