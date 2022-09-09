import java.util.Scanner;

public class Exe02 {

	public static void main2() {
		Scanner scan = new Scanner(System.in);

		System.out.print("\nInforme o número base: ");
		System.out.println();
		int num = scan.nextInt();
		System.out.println(UtilsShowCode.repitaAte(num));
	
		
		scan.close();
	}

}
