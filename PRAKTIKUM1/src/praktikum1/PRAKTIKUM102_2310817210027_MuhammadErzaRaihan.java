package praktikum1;

import java.util.Scanner;

public class PRAKTIKUM102_2310817210027_MuhammadErzaRaihan {

	public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       System.out.println("Masukkan deret (n)");
       int angka, bilangan = 0;
       angka = input.nextInt();
       
       while (bilangan < 11) {
    	   if (angka % 5 == 0) {
    		   int hitung = (angka / 5) - 1;
    		   System.out.print(hitung);
    	   } else {
    		   System.out.print(angka);
    	   }
    	   
    	   if (bilangan < 10) {
    		   System.out.print(",");
    		   
    	   }
    	   angka++;
    	   bilangan++;
       }
       input.close();
	}

}
