package TareasEntorno;

import java.util.Scanner;

public class Tarea4 {
	
	public static void main(String[] args) {
		
		int numDia;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número del 1 al 7 y calcularemos el dia de la semana equivalente");
		numDia = (int)scanner.nextInt();
		
		while (numDia < 1 || numDia > 7){
			
			System.out.println("El número no es válido, por favor introduce un numero entre el 1 y el 7");
			numDia = (int)scanner.nextInt();
		
		}
	
		if (numDia == 1) {
		System.out.println("Lunes");
		}
		
		if (numDia == 2) {
		System.out.println("Martes");
		}
		
		if (numDia == 3) {
		System.out.println("Miércoles");
		}
		
		if (numDia == 4) {
		System.out.println("Jueves");
		}
		
		if (numDia == 5) {
		System.out.println("Viernes");
		}
		
		if (numDia == 6) {
		System.out.println("Sábado");
		}
		
		if (numDia == 7) {
		System.out.println("Domingo");
		}
		 	
	}
}
