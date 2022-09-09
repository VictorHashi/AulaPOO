import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exe12 {
	public static void main12() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a palavra a ser embaralhada: ");
		String palavra = scan.next();
		
		String result = anagrama(palavra);
		
		System.out.println("Embaralhada: " + result);
		
		
		scan.close();
	}
	
	public static String anagrama(String str) {
		
		StringBuilder saida = new StringBuilder();
		String [] res = str.split("");
					
		List<String> embaralhar  = Arrays.asList(res);
		Collections.shuffle(embaralhar);
								
		String embaralhada = String.join("", embaralhar);
		saida.append(embaralhada);
			
		return saida.toString();
	}
	
}
