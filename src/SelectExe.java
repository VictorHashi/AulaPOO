import java.util.Scanner;

public class SelectExe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		boolean valid = false;
		
		while (!valid) {
			
			valid = true;
			
		
			System.out.println(UtilsShowCode.mostraMenu());
			answer = scan.nextInt();
			
			switch (answer) {
			case 0:
				break;
			case 7:
				
				Exe07.coletaValores();
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
	
			default:
				valid = false;
				System.out.println("\nValor Inválido");
				break;
			}
		}
		
		scan.close();
		
	}

}
