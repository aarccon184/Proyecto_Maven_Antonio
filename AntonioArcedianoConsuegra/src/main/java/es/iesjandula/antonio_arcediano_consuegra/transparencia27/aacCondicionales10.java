package es.iesjandula.antonio_arcediano_consuegra.transparencia27;

import java.util.Scanner;

public class aacCondicionales10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dime un numero que contenga cinco digitos");
			numero=sc.nextInt();
		}while (numero>=100000 || numero<=-100000);
		
		
		if (numero>=10000 || numero<=-10000) {
			System.out.println("El numero tiene cinco digitos");
		}else if (numero>=1000 || numero<=-1000 ) {
			System.out.println("El numero tiene cuatro digitos");
		}else if (numero>=100 || numero<=-100) {
			System.out.println("El numero tiene tres digitos");
		}else if (numero>=10 || numero<=-10) {
			System.out.println("El numero tiene dos digios");
		}else {
			System.out.println("El numero tiene un digito");
		}
		
		 sc.close();
	}

}
