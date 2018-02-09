package StringComment;

import java.util.Scanner;

public class StringKomentator {

	public static void window() {

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi string : ");
		String string = unos.nextLine();

		stringLenght(string);
		karakteriNaParnimPozicijama(string);
		karakteriNaNeparnimPozicijama(string);
		brojUpercaseKaraktera(string);
		brojLowrcaseKaraktera(string);
		karakteriKojiNisuSlova(string);

		unos.close();
	}

	public static void stringLenght(String s) {
		System.out.println("Duzina stringa iznosi : " + s.length());
	}

	public static void karakteriNaParnimPozicijama(String s) {

		System.out.print("Karakteri na parnim pozicijama su : ");

		for (int i = 0; i < s.length(); i++) {

			if ((i + 1) % 2 == 0) {
				System.out.print(s.charAt(i) + " ");
			}
		}
	}
	
	public static void karakteriNaNeparnimPozicijama(String s) {
		
	}
	
	public static void brojUpercaseKaraktera(String s) {
		
	}
	
	public static void brojLowrcaseKaraktera(String s) {
		
	}
	
	public static void karakteriKojiNisuSlova(String s) {
		
	}
}
