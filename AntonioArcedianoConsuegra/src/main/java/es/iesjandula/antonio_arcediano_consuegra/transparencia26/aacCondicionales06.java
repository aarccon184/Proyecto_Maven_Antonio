package es.iesjandula.antonio_arcediano_consuegra.transparencia26;
import java.util.Scanner;
public class aacCondicionales06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, numero3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime el numero 1");
		numero1=sc.nextInt();
		System.out.println("Dime el numero 2");
		numero2=sc.nextInt();
		System.out.println("Dime el numero 3");
		numero3=sc.nextInt();
		
		if (numero1>numero2 && numero2>numero3) {
			System.out.println("El orden es el siguiente "+numero1+" - "+numero2+" - "+numero3);
		}else if (numero1>numero3 && numero3>numero2) {
			System.out.println("El orden es el siguiente "+numero1+" - "+numero3+" - "+numero2);
		}else if (numero2>numero1 && numero1>numero3) {
			System.out.println("El orden es el siguiente "+numero2+" - "+numero1+" - "+numero3);
		}else if (numero2>numero3 && numero3>numero1) {
			System.out.println("El orden es el siguiente "+numero2+" - "+numero3+" - "+numero1);
		}else if (numero3>numero1 && numero1>numero2) {
			System.out.println("El orden es el siguiente "+numero3+" - "+numero1+" - "+numero2);
		}else if (numero3>numero2 && numero2>numero1) {
			System.out.println("El orden es el siguiente "+numero3+" - "+numero2+" - "+numero1);
		}else if (numero1>numero3 && numero1==numero2) {
			System.out.println("El orden es el siguiente "+numero1+" - "+numero2+" - "+numero3);
		}else if (numero1>numero2 && numero1==numero3) {
			System.out.println("El orden es el siguiente "+numero1+" - "+numero3+" - "+numero2);
		}else if (numero2>numero1 && numero2==numero3) {
			System.out.println("El orden es el siguiente "+numero2+" - "+numero3+" - "+numero1);
		}else if(numero3>numero1 && numero1==numero2){
			System.out.println("El numero mayor es "+numero3+" y los siguientes numeros son iguales "+numero1+" - "+numero2);
		}else {
			System.out.println("Los siguientes numeros son iguales "+numero1+" - "+numero2+" - "+numero3);
		}
		sc.close();

	}

}
