package es.iesjandula.antonio_arcediano_consuegra.transparencia26;
import java.util.Scanner;
public class aacCondicionales05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int medianoche=24;
		int hora, minutos, segundos;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime la hora");
		hora=sc.nextInt();
		System.out.println("Dime los minutos de la hora");
		minutos=sc.nextInt();
		segundos=(medianoche*3600)-(hora*3600+minutos*60);
		System.out.println("El tiempo que falta para llegar a media noche es de "+segundos+" segundos");
		sc.close();
	}

}
