package es.iesjandula.antonio_arcediano_consuegra.transparencia27;
import java.util.Scanner;
public class aacCondicionales11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int numero;
	Scanner sc=new Scanner(System.in);
	System.out.println("Dime un numero que tenga un maximo de 5 cifras");
	numero=sc.nextInt();
	
	if(numero>9999) {
		if(numero/10000==numero%10) {
			if((numero/1000)%10==(numero%100)/10) {
				System.out.println("El numero "+numero+" es capicua");
			}
		}
	}else if(numero>999){
		if(numero/1000==numero%10) {
			if((numero/100)%10==(numero%100)/10) {
				System.out.println("El numero "+numero+" es capicua");
			}
		}
	}else if(numero>99) {
		if(numero/100==numero%10) {
			System.out.println("El numero "+numero+" es capicua");
		}
	}else if(numero>9) {
		if(numero/10==numero%10) {
		System.out.println("El numero "+numero+" es capicua");
		}
	}else {
		System.out.println("El numero "+numero+" es capicua");
	}
	sc.close();
	}

}
