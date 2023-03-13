package es.iesjandula.antonio_arcediano_consuegra.transparencia45;
import java.util.Scanner;
public class aacBuclesHacerHastaQue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x, factorial=1;
		do{
			System.out.println("Dime hasta que numero te calcule el factorial");
			x=sc.nextInt();
		}while(x<0);
		for (int i=1;i<=x;i++){
			factorial=factorial*i;
		}
		System.out.println("El factorial de "+x+" es "+factorial);
		sc.close();
	}

}
