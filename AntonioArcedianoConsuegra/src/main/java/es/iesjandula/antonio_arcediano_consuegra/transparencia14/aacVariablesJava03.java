package es.iesjandula.antonio_arcediano_consuegra.transparencia14;
import java.util.Scanner;
public class aacVariablesJava03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double precio, iva, precioTotal;
		System.out.println("Dime el precio total sin IVA");
		precio=sc.nextDouble();
		System.out.println("Dime el IVA que se le aplica");
		iva=sc.nextDouble();
		precioTotal=precio*(1+(iva/100));
		System.out.println("El precio total es de "+precioTotal);
		sc.close();
	}

}
