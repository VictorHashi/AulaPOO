import java.util.Scanner;

/*
 * Faça um programa que converta da notação de 24 horas para a notação de 12 horas.
Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em
dois inteiros. Deve haver pelo menos duas funções: uma para fazer a conversão e
uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e
‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal
para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita
esse cálculo para novos valores de entrada todas as vezes que desejar.
 */

public class Exe06 {

	public static void main6() {
		Scanner scan = new Scanner(System.in);
		
		String formato24 = "";
		String[] separados = new String[2];
		int hr = 0;
		int min = 0;
					
		do {
			System.out.println("Digite a hora (HH:MM) na notação 24 horas: ");
			formato24 = scan.nextLine();
			separados = formato24.split(":");	
			hr =Integer.valueOf(separados[0]);
			min = Integer.valueOf(separados[1]);
			if (hr < 0 || hr > 24) {
				System.out.println("Entrada inválida!");
			}
			if (min < 0 || min > 60) {
				System.out.println("Entrada inválida!");
			}
		} while ((hr > 0 || hr < 24)&&(min > 0 || min < 60));			
			
		System.out.println(converteHoras(hr) + ":" + min + (amPm(hr)));	
		
		scan.close();

	}

	private static int converteHoras(int hr) {
		if (hr >= 12) {
			hr = hr % 12;
		}
		return hr;
	}

	private static String amPm(int hr) {
		String saida = "";
		if (hr < 12 || hr == 24) {
			saida = "A.M.";
		} else if (hr >= 12) {
			saida = "P.M.";
		}
		return saida;
	}
	
	
	

}
