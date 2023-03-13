package es.iesjandula.antonio_arcediano_consuegra.transparencia45;
import java.util.Scanner;
public class aacBuclesHacerHastaQue02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x, y, total=1;
		do{
			System.out.println("Dime x");
			x=sc.nextInt();
		}while(x<=0);
		do{
			System.out.println("Dime y");
			y=sc.nextInt();
		}while(x<=0);
		
		for (int i=1; i<=y; i++) {
			total=total*x;
		}
		System.out.println(total);
		sc.close();
	}

}
