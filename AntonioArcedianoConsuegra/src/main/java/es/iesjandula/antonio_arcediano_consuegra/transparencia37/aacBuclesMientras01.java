package es.iesjandula.antonio_arcediano_consuegra.transparencia37;
import java.util.Scanner;
public class aacBuclesMientras01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nAsteriscos;
		System.out.println("Dime cuantos asteriscos quieres que te imprima");
		nAsteriscos=sc.nextInt();
		for (int comienzo=1;comienzo<=nAsteriscos;comienzo++) {
			System.out.print("* ");
		}
		sc.close();

	}

}
