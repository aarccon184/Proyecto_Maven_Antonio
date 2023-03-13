package es.iesjandula.antonio_arcediano_consuegra.transparencia9;
import java.util.Scanner;
public class aacPrimerosPasosJava08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime un numero");
		x=sc.nextInt();
		System.out.println("Dime otro numero");
		y=sc.nextInt();
		
		System.out.println("La suma de "+x+" + "+y+" es "+(x+y));
		System.out.println("La resta de "+x+" - "+y+" es "+(x-y));
		System.out.println("La division de "+x+" / "+y+" es "+(x/y));
		System.out.println("El resto de "+x+" / "+y+" es "+(x%y));
		System.out.println("La potencia de "+x+" ^ "+y+" es "+Math.pow(x, y));
		System.out.println("La suma de la raiz cuadrada de "+x+" la raiz cuadrada de "+y+" es "+(Math.sqrt(x)+Math.sqrt(y)));
		
		sc.close();
	}

}
