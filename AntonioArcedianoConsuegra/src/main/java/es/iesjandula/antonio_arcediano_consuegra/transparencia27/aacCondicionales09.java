package es.iesjandula.antonio_arcediano_consuegra.transparencia27;
import java.util.Scanner;
public class aacCondicionales09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Dime un numero que contenga cinco digitos");
			numero=sc.nextInt();
		}while (numero>=100000 || numero<0);
		if (numero>=10000) {
			System.out.println("El primer digito es "+numero/10000);
		}else if (numero>=1000) {
			System.out.println("El primer digito es "+numero/1000);
		}else if (numero>=100) {
			System.out.println("El primer digito es "+numero/100);
		}else if (numero>=10) {
			System.out.println("El primer digito es "+numero/10);
		}else {
			System.out.println("El primer digito es "+numero);
		}
		
		 sc.close();
	}

}
