package praktikum1;

import java.util.Scanner;

public class PRAKTIKUM101_2310817210027_MuhammadErzaRaihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TGL, BL, TB, Tahun;
        double BB;

        String[] bulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String TL = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        TGL = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        BL = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        Tahun = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        TB = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        BB = input.nextDouble();

        if (BL < 1 || BL > 12) {
            System.out.println("Error: Bulan tidak valid.");
        } else {
            System.out.println("Nama Lengkap: " + nama + ", Lahir di " + TL + " pada Tanggal " 
                    + TGL + " " + bulan[BL] + " " + Tahun + ", Tinggi Badan: " + TB 
                    + " cm dan Berat Badan: " + BB + " kilogram.");
        }

        input.close();
    }
}