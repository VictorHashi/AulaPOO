import java.util.Iterator;
import java.util.Scanner;

public class SelectExe {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Exe10.geraNum());
		}
		
		
		
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
			
			case 1:
				
				Exe01.main1();
				
				break;
			case 2:
				
				Exe02.main2();
				
				break;
			case 3:
				
				Exe03.main3();
				
				break;
			case 4:
				
				Exe04.main4();
				
				break;
			case 5:
				
				Exe05.main5();
				
				break;
			case 6:
				
				Exe06.main6();
				
				break;
			case 7:
				
				Exe07.main7();
				
				break;
			case 8:
				
				Exe08.main8();
				
				break;
			case 9:
				
				Exe09.main9();
				
				break;
			case 10:
				
				Exe10.main10();
				
				break;
			case 11:
				
				Exe11.main11();
				
				break;
			case 12:
				
				Exe12.main12();
				
				break;
			case 13:
				
				Exe013.main13();
				
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
