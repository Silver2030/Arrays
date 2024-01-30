package matriz;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [][] matriz = new int [5][3];

		matriz = cargarMatriz(matriz);
		System.out.println();
		mostrarMatriz(matriz);
		
	}

	public static int[][] cargarMatriz(int[][] matriz) {
		Scanner in = new Scanner(System.in);
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				System.out.print("Introduce el valor de la fila n�" + (j+1) + " y columna n�" + (i+1) + ": ");
				matriz[j][i] = in.nextInt();
				}
			}
		return matriz;
	}
	
	public static void mostrarMatriz(int [][] matriz) {
		int contador = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				if(contador == 0) System.out.print("("); /*Marca el inicio de cada linea con un (*/
				contador++;
				System.out.print(matriz[j][i]);
				if(matriz[j].length == contador) {
					System.out.print(") \n");  /*Marca el final de cada linea con un ) y salta a la siguiente linea*/
					contador = 0;
				}
				else System.out.print(" ");
				if(i == matriz[j].length) System.out.println();
			}
		}
	}
}

