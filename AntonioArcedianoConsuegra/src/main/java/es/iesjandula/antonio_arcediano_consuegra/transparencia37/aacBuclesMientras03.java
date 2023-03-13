package es.iesjandula.antonio_arcediano_consuegra.transparencia37;

import java.util.Scanner;
public class aacBuclesMientras03 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x, y, salida;
	System.out.println("Dime un numero");
	x=sc.nextInt();
	System.out.println("Dime un numero");
	y=sc.nextInt();
	do {
		System.out.println("La suma de "+x+" + "+y+" es "+(x+y));
		System.out.println("La resta de "+x+" - "+y+" es "+(x-y));
		System.out.println("La division de "+x+" / "+y+" es "+(x/y));
		System.out.println("El resto de "+x+" / "+y+" es "+(x%y));
		System.out.println("La potencia de "+x+" ^ "+y+" es "+Math.pow(x, y));
		System.out.println("La suma de la raiz cuadrada de "+x+" la raiz cuadrada de "+y+" es "+(Math.sqrt(x)+Math.sqrt(y)));
		System.out.println("Quieres seguir realizando otras operaciones");
		salida=sc.nextInt();
		if (salida!=0){
			System.out.println("Dime un numero");
			x=sc.nextInt();
			System.out.println("Dime un numero");
			y=sc.nextInt();	
		}
	}while (salida!=0);
	
	System.out.println("Ya se ha salido de la calculadora");
	sc.close();
}
}	
