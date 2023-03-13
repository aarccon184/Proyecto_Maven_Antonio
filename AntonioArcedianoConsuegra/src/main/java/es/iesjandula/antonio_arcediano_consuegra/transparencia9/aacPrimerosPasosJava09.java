package es.iesjandula.antonio_arcediano_consuegra.transparencia9;
import java.util.Scanner;
public class aacPrimerosPasosJava09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pesetas=166.386;
		double euros;
		Scanner sc=new Scanner (System.in);
		System.out.println("Dime cuantos euros quieres pasar a pesetas");
		euros=sc.nextDouble();
		System.out.println("El total de pesetas es de "+euros*pesetas);
		sc.close();
	}

}
