package main;

import model.*;
import service.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Double> daftarKereta = new HashMap<>();
        daftarKereta.put("Argo Bandung", 150000.0);
        daftarKereta.put("Argo Jogja", 400000.0);
        daftarKereta.put("Argo Jakarta", 250000.0);
        daftarKereta.put("Argo Surabaya", 550000.0);

        System.out.println("=== Sistem Pemesanan Tiket Kereta Api ===");

        System.out.print("Masukkan nama penumpang: ");
        String nama = input.nextLine();

        System.out.println("\nDaftar Kereta Tersedia:");
        daftarKereta.forEach((kereta, harga) -> {
            System.out.println("- " + kereta + " (Harga Dasar: Rp " + harga + ")");
        });

        System.out.println("\nKetik Nama Kereta Yang Dipilih: ");
        String pilihanKereta = input.nextLine();


        if (daftarKereta.containsKey(pilihanKereta)) {
            double hargaTerpilih = daftarKereta.get(pilihanKereta);

            System.out.println("Pilih Kelas:");
            System.out.println("1. Eksekutif");
            System.out.println("2. Ekonomi");
            System.out.print("Masukkan pilihan (1/2): ");
            int pilihanKelas = input.nextInt();
        

        Tiket tiketAnda;
        if (pilihanKelas == 1) {
            tiketAnda = new KelasEksekutif(nama, hargaTerpilih);
        } else {
            tiketAnda = new KelasEkonomi(nama, hargaTerpilih);
        }

        System.out.println("\n=============================");
        System.out.println("TIKET BOOKING BERHASIL DIBUAT");
        System.out.println("===============================");
        System.out.println("Nama Penumpang : " + tiketAnda.getNama());
        System.out.println("Kereta : " + pilihanKereta);
        System.out.println("Total Bayar : Rp " + tiketAnda.hitungTotalHarga());

        if (tiketAnda instanceof LayananTambahan) {
            System.out.println("--- Fasilitas Eksekutif ---");
            ((LayananTambahan) tiketAnda).servisMakan();
        }
        System.out.println("=============================");

        } else {
            System.out.println("\nError Nama kereta tidak ditemukan. Coba Jalankan ulang");
        }

        input.close();
    }
}
