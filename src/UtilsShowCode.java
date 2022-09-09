
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
	
	public static String moldura(int col, int row){
		
		if (col < 1 || col > 20) {
			col = 10;
		}
					
		if (row < 1 || row > 20) {
			row = 7;
		}
					
		StringBuilder saida = new StringBuilder();
					
		for (int i = 0; i < row; i++) {
						
			if (i == 0||i == row-1) {
				saida.append("+");
			}else {
				saida.append("|");
			}
						
						
			for (int j = 0; j < col; j++) {
				saida.append("-");
			}
						
						
			if (i == 0||i == row-1) {
				saida.append("+");
			}else {
				saida.append("|");
			}
						
			saida.append("\n");
		}
					
		return saida.toString();
					
	}
	
}
