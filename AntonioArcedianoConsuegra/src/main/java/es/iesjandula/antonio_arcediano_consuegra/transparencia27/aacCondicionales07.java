package es.iesjandula.antonio_arcediano_consuegra.transparencia27;
import java.util.Scanner;
public class aacCondicionales07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime un numero");
		numero=sc.nextInt();
		if(numero%2==0) {
			System.out.print("El numero es par ");
		}else {
			System.out.print("El numero no es par ");
		}
		if(numero%5==0) {
			System.out.print("y divisible de cinco");
		}else {
			System.out.println("y el numero no es divisible de cinco");
		}
		sc.close();
	}

}
