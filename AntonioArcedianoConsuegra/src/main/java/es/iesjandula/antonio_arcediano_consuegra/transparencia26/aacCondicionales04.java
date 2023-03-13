package es.iesjandula.antonio_arcediano_consuegra.transparencia26;
import java.util.Scanner;
public class aacCondicionales04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, x;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime el numero a");
		a=sc.nextInt();
		System.out.println("Dime el numero b");
		b=sc.nextInt();
		x=(0-b)/a;
		System.out.println("La ecuacion quedaria de la siguiente forma "+a+" x "+x+" + "+b+" = 0");

		sc.close();
	}

}
