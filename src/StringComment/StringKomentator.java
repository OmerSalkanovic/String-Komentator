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

		System.out.print("\nKarakteri na neparnim pozicijama su : ");

		for (int i = 0; i < s.length(); i++) {

			if ((i + 1) % 2 != 0) {
				System.out.print(s.charAt(i) + " ");
			}
		}
	}

	public static void brojUpercaseKaraktera(String s) {

		int counter = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i))) {
				counter++;
			}
		}
		System.out.print("\nBroj uppercase karaktera je: " + counter);
	}

	public static void brojLowrcaseKaraktera(String s) {

		int counter = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isLowerCase(s.charAt(i))) {
				counter++;
			}
		}
		System.out.print("\nBroj lowercase karaktera je: " + counter);
	}

	public static void karakteriKojiNisuSlova(String s) {

		System.out.print("\nKarakteri koji nisu slova su : ");

		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i))) {
				System.out.print(s.charAt(i));

			}

		}
	}

}
