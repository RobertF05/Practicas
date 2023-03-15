package Triangulos;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Ingrese el primer lado");
		a = teclado.nextInt();
		
		System.out.println("Ingrese el segundo lado");
		b = teclado.nextInt();
		
		System.out.println("Ingrese el tercer lado");
		c = teclado.nextInt();
		
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("No es un Triangulo");
		}
		
		if (a == b && b == c) {
			System.out.println("Es un triangulo Equilatero");
		}else if (a == b && a != c) {
			System.out.println("Es un triangulo Isosceles");
		}else if (a != b && b == c ) {
			System.out.println("Es un triangulo Isosceles");
		}else if (a == c && c != b) {
			System.out.println("Es un triangulo Isosceles");
		}

		if (a != b && a != c && b != c) {
			System.out.println("Es un triangulo Escaleno");
		}
	}

}
