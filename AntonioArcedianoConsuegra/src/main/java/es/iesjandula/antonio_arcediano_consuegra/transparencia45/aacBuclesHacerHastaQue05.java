package es.iesjandula.antonio_arcediano_consuegra.transparencia45;
import java.util.Scanner;
public class aacBuclesHacerHastaQue05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int altura;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime de cuanta altura te hacemos la escalera invertida");
		altura=sc.nextInt();
		for (int fila=1; fila<=altura;fila++) {
			for (int columna=fila; columna<=altura;columna++) {
				System.out.print("*");
			}
		System.out.println("");
		}
		sc.close();
	}

}
