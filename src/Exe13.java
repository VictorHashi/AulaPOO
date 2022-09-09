import java.util.Scanner;

public class Exe13 {
	public static void main13() {
		
		Scanner scan = new Scanner(System.in);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho das colunas: ");
		int coluna = entrada.nextInt();
		
		System.out.print("Informe o tamanho das linhas: ");
		int linha = entrada.nextInt();
				
		System.out.println();
		System.out.println(UtilsShowCode.moldura(coluna, linha));
		
		entrada.close();
		
		
		scan.close();
	}
}
