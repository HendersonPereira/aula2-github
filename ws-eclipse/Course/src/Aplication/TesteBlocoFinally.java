package Aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteBlocoFinally {

	public static void main(String[] args) {

		File file = new File("C:\\Program Files\\Arq.txt.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("funcionou");
		}

	}

}
