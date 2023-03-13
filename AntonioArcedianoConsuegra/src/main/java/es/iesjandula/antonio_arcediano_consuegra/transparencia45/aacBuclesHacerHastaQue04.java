package es.iesjandula.antonio_arcediano_consuegra.transparencia45;
import java.util.Scanner;
public class aacBuclesHacerHastaQue04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividendo, divisor;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el dividendo");
		dividendo=sc.nextInt();
		System.out.println("Dime el divisor");
		divisor=sc.nextInt();
		System.out.println("El cociente de la division "+dividendo+" / "+divisor+" es igual a "+dividendo/divisor+" y el resto es de "+dividendo%divisor);
		sc.close();

	}

}
