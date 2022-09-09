import java.util.Scanner;

public class Exe01 {

	public static void main1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nInforme o número base: ");
		System.out.println();
		int num = scan.nextInt();
		System.out.println(UtilsShowCode.repita(num));
	
		scan.close();
	}
	
}
