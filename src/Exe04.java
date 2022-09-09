import java.util.Scanner;

public class Exe04 {

	public static void main4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInforme um número: ");
		int num = scan.nextInt();
		
		System.out.println(validaInt(num));
		
		scan.close();

	}

	public static char validaInt(int num) {
		
		if (num > 0) {
			return 'p';
		}
		
		return 'n';
	}
	
}
