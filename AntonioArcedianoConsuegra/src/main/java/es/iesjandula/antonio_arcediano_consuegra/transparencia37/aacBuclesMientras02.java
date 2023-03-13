package es.iesjandula.antonio_arcediano_consuegra.transparencia37;
import java.util.Scanner;
public class aacBuclesMientras02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nJugador, nAleatorio;
		nAleatorio=(int)(Math.random()*10+1);
		System.out.println("Dime un numero entre 1 y 10");
		nJugador=sc.nextInt();
	
		while (nAleatorio!=nJugador){
			if (nAleatorio>nJugador) {
				System.out.println("El numero aleatorio es mayor");
			}else {
				System.out.println("El numero aleatorio es menor");
			}
			System.out.println("El numero introducido no es el correcto");
			System.out.println("Introduce un nuevo numero");
			nJugador=sc.nextInt();
		}
		if (nAleatorio==nJugador){
			System.out.println("Enhorabuena el numero es el correcto");
		}
		sc.close();
	}

}
