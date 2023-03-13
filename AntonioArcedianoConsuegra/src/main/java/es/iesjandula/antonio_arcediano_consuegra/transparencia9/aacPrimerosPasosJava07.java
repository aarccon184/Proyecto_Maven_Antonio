package es.iesjandula.antonio_arcediano_consuegra.transparencia9;
import java.util.Scanner;

public class aacPrimerosPasosJava07 {
	public static void main(String[] args) {
		int x, f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		x=sc.nextInt();
		f=x*x+x+1;
		System.out.println("El resultado de la ecuacion es "+f);
		sc.close();
	}

}
