package praktikum1;

import java.util.Scanner;
public class PRAKTIKUM105_2310817210027_MuhammadErzaRaihan {
	public static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double jari = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();

        double volume = hitungvolum(jari, tinggi);

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n", jari, tinggi, volume);
        scanner.close();
    }
  
    private static double hitungvolum(double jari, double tinggi) {
        return PHI * jari * jari * tinggi;

    }

}
