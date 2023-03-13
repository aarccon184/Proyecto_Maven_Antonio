package es.iesjandula.antonio_arcediano_consuegra.transparencia14;
import java.util.Scanner;
public class aacVariablesJava02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double euros, pesetas;
		System.out.println("Dime cuantos euros quieres que pasemos a peseta");
		euros=sc.nextDouble();
		pesetas=euros*166;
		System.out.println("El total de pesetas es de "+pesetas);
		sc.close();
	}

}
