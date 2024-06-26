package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numArr = 5;
		String[] nombres = new String[numArr];
		
		//solicitar ingresar los nombres para el array
		System.out.println("Ingresar 5 nombres: ");
		for (int i = 0; i < nombres.length; i++) {	
			nombres[i] = sc.nextLine();
	    }
		
		//mostrar los valores del array
		int j = 0;
		while (j < nombres.length) {
			System.out.println("[" + j + "] = "+ nombres[j]);
			j++;
		}
		
		//mostrar el tamaño del array nombres
		System.out.println("\nTamaño del array = " + nombres.length + "\n");
        
        //eliminar un nombre
		System.out.println("\nIngrese la posición del nombre a eliminar (0 - " + (nombres.length -1) + ")");
		byte posicion = sc.nextByte();
        elimiarNombre(nombres, posicion);
        
        //nuevo array (sin elemento eliminado)
		for (int i = 0; i < nombres.length; i++) {
            System.out.println("[" + i + "] = " + nombres[i]);
        }
        sc.close();
	}        

	//ingreso y eliminación de un elemento del array
	public static void elimiarNombre(String[] nombres, byte posicion) {
		byte pos;
		do {
			pos = posicion;
		} while (pos < 0 || pos >= nombres.length);
		//método para eliminar el elemento
		if (pos >= 0 && pos < nombres.length) {
			for (int i = (int) pos; i < nombres.length - 1; i++) {
				nombres[i] = nombres[i + 1];
			}
			nombres[nombres.length - 1] = " ";
		}
	}

}