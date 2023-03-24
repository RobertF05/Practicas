package Uni;

import java.util.Scanner;

public class LoginDeUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user = "usuario123";
		int contador = 0;
		
		Scanner tc = new Scanner(System.in);
		
		while (contador <3) {
			System.out.println("Ingrese su Usuario:");
			String tcuser = tc.nextLine();
			
			if(tcuser.equals(user)) {
				System.out.println("Inicio de sesion exitoso");
				return;
			}else {
				contador++;
				System.out.println("Nombre de Usuario incorrecto");
			}
		}
		System.out.println("Demasiados intentos fallidos");

	}

}
