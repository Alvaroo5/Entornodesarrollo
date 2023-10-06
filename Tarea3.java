package TareasEntorno;

import java.util.Scanner;

public class Tarea3 {
	
	public static void main(String[] args) {
	
		float num1;
		float num2;
		float num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un primer numero:");
		num1=sc.nextFloat();
		
		System.out.println("Introduzca un segundo numero:");
		num2=sc.nextFloat();
		
		System.out.println("Introduzca un tercer numero:");
		num3=sc.nextFloat();
		
		float mayor = Math.max(Math.max(num1, num2), num3);
        
        System.out.println("El número mayor es: " + mayor);
		
	}

}
