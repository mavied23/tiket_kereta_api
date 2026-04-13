package main;

import model.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Double> daftarKeretaa = new HashMap<>();
        daftarKeretaa.put("Argo Bandung", 150000.0);
        daftarKeretaa.put("Argo Jogja", 400000.0);
        daftarKeretaa.put("Argo Jakarta", 250000.0);
        daftarKeretaa.put("Argo Surabaya", 550000.0);

        System.out.println("=== Sistem Pemesanan Tiket Kereta Api ===");

        System.out.print("Masukkan nama penumpang: ");
        String nama = input.nextLine();

        System.out.println("\nDaftar Kereta Tersedia:");
        daftarKeretaa.forEach((kereta, harga) -> {
            System.out.println("- " + kereta + " (Harga Dasar: Rp " + harga + ")");
        });

        System.out.println("\nKetik Nama Kereta Yang Dipilih: ");
        String pilihanKereta = input.nextLine();

try {
    if (daftarKeretaa.containsKey(pilihanKereta)) {
        double hargaTerpilih = daftarKeretaa.get(pilihanKereta);

        System.out.println("Pilih Kelas:");
        System.out.println("1. Eksekutif");
        System.out.println("2. Ekonomi");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihanKelas = input.nextInt();

        Tiket tiketAnda;
        if (pilihanKelas == 1) {
            tiketAnda = new KelasEksekutif(nama, hargaTerpilih);
        } else if (pilihanKelas == 2) {
            tiketAnda = new KelasEkonomi(nama, hargaTerpilih);
        } else {
            // Melempar error buatan jika angka bukan 1 atau 2
            throw new Exception("Pilihan kelas tidak tersedia!");
        }

        
        System.out.println("\n=============================");
        System.out.println("TIKET BERHASIL DIBUAT");
        System.out.println("=============================");
        System.out.println("Nama : " + tiketAnda.getNama());
        System.out.println("Total Bayar : Rp " + tiketAnda.hitungTotalHarga());
        
    } else {
        System.out.println("\nError: Nama kereta tidak terdaftar.");
    }
} catch (Exception e) {
    System.out.println("Terjadi kesalahan bro: " + e.getMessage());
} finally {
    input.close();
}
    }
}