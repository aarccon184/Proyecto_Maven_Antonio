package es.iesjandula.antonio_arcediano_consuegra.transparencia10;
import java.util.Scanner;
public class aacPrimerosPasosJava11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double examen1, media, examen2;
		final double MEDIA1=0.40, MEDIA2=0.60;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la nota del primer examen");
		examen1=sc.nextDouble();
		System.out.println("Que nota quieres sacar en el trimestre?");
		media=sc.nextDouble();
		examen2=(media-(examen1*MEDIA1))/MEDIA2;
		System.out.println("Para tener un "+media+" en el trimestre necesitas sacar un "+examen2+" en el segundo examen");
		sc.close();
	}

}
