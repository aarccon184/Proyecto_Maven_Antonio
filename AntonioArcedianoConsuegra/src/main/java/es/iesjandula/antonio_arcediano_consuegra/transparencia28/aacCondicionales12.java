package es.iesjandula.antonio_arcediano_consuegra.transparencia28;
import java.util.Scanner;

public class aacCondicionales12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Dime la nota numero 1");
		nota1=sc.nextDouble();
		System.out.println("Dime la nota numero 2");
		nota2=sc.nextDouble();
		media=(nota1+nota2)/2;
		if (media>=5) {
			System.out.println("La media del alumno es "+media);
		}else {
			System.out.println("Cual ha sido el resultado de la recuperacion apto/no apto");
			String recuperacion=sc.next();
			if (recuperacion.equals("apto")){
				System.out.println("Tu nota de Programacion es 5");
			}else {
				System.out.println("Tu nota de Programacion es "+media);
			}
		}
		sc.close();
		

	}

}
