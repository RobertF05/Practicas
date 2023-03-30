package EjercicioPractico;

import java.util.Scanner;

public class Voltajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		int cant;
		double vMax, vMin, prom = 0;
		
		System.out.println("¿Cuantos Voltajes va a ingresar");
		cant = tc.nextInt();
		
		double[] v = new double[cant];

	      for (int i = 0; i < cant; i++) {
	         System.out.println("Ingrese el voltaje #" + (i+1) + ": ");
	         v[i] = tc.nextDouble();
	      }

	      for (int i = 0; i < cant; i++) {
	         prom += v[i];
	      }
	      prom /= cant;
	       vMax = v[0];
	       vMin = v[0];
	      for (int i = 1; i < cant; i++) {
	         if (v[i] > vMax) {
	            vMax = v[i];
	         }
	         if (v[i] < vMin) {
	            vMin= v[i];
	         }
	      }
	      System.out.println("El promedio de los voltajes es: " + prom);
	      System.out.println("El maximo voltaje es: " + vMax);
	      System.out.println("El minimo voltaje es: " + vMin);
	}
}