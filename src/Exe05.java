import java.util.Scanner;

public class Exe05 {

	public static void main5() {
		Scanner scan = new Scanner(System.in);
		

		System.out.print("\nInforme o custo do item: ");
		float preco = scan.nextFloat();
		
		System.out.print("\nInforme o percentual do imposto (No formato 1,1 = 10%): ");
		float percentual = scan.nextFloat();
		
		float resultado = somaImposto(percentual, preco);
						
		System.out.print("\nPreço final: R$" + String.format("%.2f",resultado));
		
		scan.close();
	}

	
	public static float somaImposto(float taxaImposto, float custo) {
		return (taxaImposto * custo);
	}
	
}
