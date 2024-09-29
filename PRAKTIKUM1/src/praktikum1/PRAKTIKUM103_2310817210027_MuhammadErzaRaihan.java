package praktikum1;

import java.util.Scanner; 

public class PRAKTIKUM103_2310817210027_MuhammadErzaRaihan {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);

	        System.out.print("Masukkan banyak deret bilangan yang diinginkan (n) dan bilangannya: ");
	        int n = input.nextInt();
	        int angka = input.nextInt();
	        int i = 0;
	        int num = angka;
	        while (i < n) {
	            if (num % 2 != 0) {
	                System.out.print(num);
	                
	            if (i < n - 1) {
	                    System.out.print(",");
	            }
	            i++;
	        } 
	            num++;
	}
	        input.close();
	}
}
