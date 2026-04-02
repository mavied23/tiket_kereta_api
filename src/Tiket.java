public abstract class Tiket {
  private String namaPenumpang; // Enkapsulasi pake private biar data ga bisa di akses langsung dari luar kelas
  protected double hargaTiket; // Protected biar bisa di akses sama kelas turunannya ( KelasEksekutif dan KelasEkonomi )


}