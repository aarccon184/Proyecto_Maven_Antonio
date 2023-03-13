package es.iesjandula.antonio_arcediano_consuegra.transparencia9;
import java.util.Scanner;

public class aacPrimerosPasosJava06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero1, numero2, numero3;
		System.out.println("Dime el primer numero");
		numero1=sc.nextInt();
		System.out.println("Dime el segundo numero");
		numero2=sc.nextInt();
		System.out.println("Dime el tercer numero");
		numero3=sc.nextInt();
		System.out.println("El resultado de la multiplicacion de los tres numeros es "+numero1*numero2*numero3);
		sc.close();
	
	}
	

}
