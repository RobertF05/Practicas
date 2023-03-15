package bisiesto;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecla= new Scanner(System.in);
		int año;
		
		System.out.println("Ingrese un año:");
		año= tecla.nextInt();
		
		if((año%4 == 0) && (año%100 != 0 || año%400 == 0)) {
			System.out.println("Es año bisiesto");
			}else{
				System.out.println("El año no es bisiesto");	
			}
		}
}
