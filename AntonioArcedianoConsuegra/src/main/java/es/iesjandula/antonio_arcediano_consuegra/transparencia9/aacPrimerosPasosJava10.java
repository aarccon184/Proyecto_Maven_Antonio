package es.iesjandula.antonio_arcediano_consuegra.transparencia9;
import java.util.Scanner;
public class aacPrimerosPasosJava10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int horas, dia;
		final int euro=12;
		System.out.println("Dime cuantas horas hecha al dia trabajando");
		horas=sc.nextInt();
		System.out.println("Dime cuantos dias trabaja a la semana");
		dia=sc.nextInt();
		System.out.println("El salario semanal es de "+horas*dia*euro);
		sc.close();

	}

}
