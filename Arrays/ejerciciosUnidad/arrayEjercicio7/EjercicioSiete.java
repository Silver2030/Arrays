package arrayEjercicio7;

import java.util.Scanner;

public class EjercicioSiete {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n = new int [10];
		
		for(int i = 0; i < n.length; i++) {
			System.out.print("Introduzca el n�" + (i+1) + " : ");
			n[i] = in.nextInt();
		}
		System.out.println();
		for(int i = 9; i >= 0; i--) {
			System.out.println("N�" + (i+1) + ": " + n[i]);
		}

	}

}
