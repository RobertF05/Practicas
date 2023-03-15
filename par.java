package par_impar;
import java.util.Scanner;
public class par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecla= new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un numero");
		numero= tecla.nextInt();
		
		if (numero%2==0) {
			System.out.println("El numero ingresado es par");
		}
		else {
			System.out.println("El numero ingresado es impar");
		}

	}

}
