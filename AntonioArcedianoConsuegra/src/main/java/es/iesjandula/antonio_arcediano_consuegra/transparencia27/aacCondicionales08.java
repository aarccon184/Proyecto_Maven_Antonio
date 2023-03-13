package es.iesjandula.antonio_arcediano_consuegra.transparencia27;
import java.util.Scanner;
public class aacCondicionales08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, ultimoDigito;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		numero=sc.nextInt();
		ultimoDigito=numero%10;
		System.out.println("La ultima cifra del numero "+numero+" es "+ultimoDigito);
		sc.close();
	}

}
