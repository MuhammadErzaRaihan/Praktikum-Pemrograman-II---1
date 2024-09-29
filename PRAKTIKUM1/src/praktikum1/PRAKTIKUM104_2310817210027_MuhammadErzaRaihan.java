package praktikum1;

import java.util.Scanner;

public class PRAKTIKUM104_2310817210027_MuhammadErzaRaihan {
	    
	    public static String pilihpemenang(char abu, char bagas) {
	        if (abu == bagas) {
	            return "Seri";
	        } else if ((abu == 'B' && bagas == 'G') || 
	                   (abu == 'G' && bagas == 'K') || 
	                   (abu == 'K' && bagas == 'B')) {
	            return "Abu";
	        } else {
	            return "Bagas";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Tangan Abu: ");
	        String abuInput = scanner.nextLine();
	        char[] pilihabu = abuInput.replaceAll(" ", "").toCharArray();

	        System.out.print("Tangan Bagas: ");
	        String bagasInput = scanner.nextLine();
	        char[] pilihbagas = bagasInput.replaceAll(" ", "").toCharArray();

	        int skorabu = 0;
	        int skorbagas = 0;

	  
	        for (int i = 0; i < 3; i++) {
	            String menang = pilihpemenang(pilihabu[i], pilihbagas[i]);
	            if (menang.equals("Abu")) {
	                skorabu++;
	            } else if (menang.equals("Bagas")) {
	                skorbagas++;
	            }
	        }

	        if (skorabu > skorbagas) {
	            System.out.println("Abu");
	        } else if (skorbagas > skorabu) {
	            System.out.println("Bagas");
	        } else {
	            System.out.println("Seri");
	        }

	        scanner.close();
	    }
	}

