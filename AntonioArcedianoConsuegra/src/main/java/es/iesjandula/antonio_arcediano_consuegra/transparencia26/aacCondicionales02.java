package es.iesjandula.antonio_arcediano_consuegra.transparencia26;
import java.util.Scanner;
public class aacCondicionales02 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	int hora;
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Dime una hora entre 00 y 23");
	hora=sc.nextInt();
	if (hora>=21 && hora<=23 || hora>=0 && hora<=5) {
		System.out.println("Buenas noches");
	}else if (hora>=6 && hora<=12){
		System.out.println("Buenos dias");
	}else if (hora>=13 && hora<=20) {
		System.out.println("Buenas tardes");
	}else {
		System.out.println("La hora introducida no esta en el rango horario del dia");
	}
	sc.close();
	}
}

