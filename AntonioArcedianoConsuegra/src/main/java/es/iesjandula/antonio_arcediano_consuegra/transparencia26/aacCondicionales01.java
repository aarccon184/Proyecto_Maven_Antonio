package es.iesjandula.antonio_arcediano_consuegra.transparencia26;
import java.util.Scanner;

public class aacCondicionales01 {
	public static void main(String[] args) {
	int dia;
	Scanner sc=new Scanner(System.in);
	System.out.println("Lunes - 1");
	System.out.println("Martes - 2");
	System.out.println("Miercoles - 3");
	System.out.println("Jueves - 4");
	System.out.println("Viernes - 5");
	System.out.println("Dime de que dia te muestro la primera hora");
	dia=sc.nextInt();
	if (dia==1) {
		System.out.println("El Lunes a primera hora tenemos Base de Datos");
	}else if (dia==2) {
		System.out.println("El Martes a primera hora tenemos Programacion");
	}else if (dia==3) {
		System.out.println("El Miercoles a primera hora tenemos Sistemas Informaticos");
	}else if (dia==4) {
		System.out.println("El Jueves a primera hora tenemos Formacion y Orientacion Laboral");
	}else if (dia==5) {
		System.out.println("El Viernes a primera hora tenemos Programacion");
	}else {
		System.out.println("El dato introducido es incorrecto y no se encuentra dentro de los estandares");
	}
	sc.close();
}
}
