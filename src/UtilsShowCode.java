
public class UtilsShowCode {

	public static String mostraMenu() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("-=#####     MENU     #####=-");
		sb.append("\nInforme o exercício a ser exibido");
		sb.append("\n7 - Valor de Prestação da conta");
		sb.append("\n8 - Conta Dígitos");
		sb.append("\n9 - Reverso do Número");
		sb.append("\n10 - Jogo de Craps");
		sb.append("\n-----------------------------");
		sb.append("\nDigite 0 para encerrar");
		sb.append("\n-----------------------------");
		
		return sb.toString();
		
	}

	public static String repita(int num) {
		String saida = "";
		for(int x = 1; x <= num; x++) {
			for (int y = 1; y <= x + 1; y++) {
				saida += Integer.toString(x) + "  ";
			}
			saida += "\n";
		}
		return saida;
	}  
	
	public static String repitaAte(int num) {
		String saida = "";
		for(int x = 1; x <= num; x++) {
			for (int y = 1; y <= x + 1; y++) {
				saida += Integer.toString(y) + "  ";
			}
			saida += "\n";
		}
		return saida;
	}
}
