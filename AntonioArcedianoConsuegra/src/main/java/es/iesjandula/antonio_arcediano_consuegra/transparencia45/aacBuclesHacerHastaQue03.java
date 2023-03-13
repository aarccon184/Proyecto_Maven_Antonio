package es.iesjandula.antonio_arcediano_consuegra.transparencia45;
import java.util.Scanner;
public class aacBuclesHacerHastaQue03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x, y;
		do{
			System.out.println("Dime x");
			x=sc.nextInt();
		}while(x<=0);
		do{
			System.out.println("Dime y");
			y=sc.nextInt();
		}while(y<=0);
		System.out.println("La multiplicacion de "+x+" x "+y+" es igual "+x*y);
		sc.close();
		

	}

}
