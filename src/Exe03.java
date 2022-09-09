import java.util.Scanner;

public class Exe03 {

	public static void main3() {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nInforme o 1º número: ");
		int n1 = scan.nextInt();
		System.out.print("\nInforme o 2º número: ");
		int n2 = scan.nextInt();
		System.out.print("\nInforme o 3º número: ");
		int n3 = scan.nextInt();
		
		System.out.println("A soma dos números é " + soma3(n1,n2,n3));
		
		scan.close();
		
	}
	
	public static int soma3(int n1, int n2, int n3) {
		return (n1+n2+n3);
	}

}
