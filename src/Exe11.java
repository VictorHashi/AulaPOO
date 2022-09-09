import java.util.Scanner;

public class Exe11 {
	public static void main11() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a data (DD/MM/AAAA)");
		String data = scan.nextLine();
		
		System.out.println(dataExtenso(data));
		
		scan.close();
	}
	
	public static String dataExtenso(String data) {
		
		String juntos[] = new String[3];
		int separados[] = new int[3];
		StringBuilder saida = new StringBuilder();
		String meses = "";
		
		juntos = data.split("/");
		
		for(int i = 0 ; i < separados.length; i++) {
			separados[i] = Integer.parseInt(juntos[i]);
		}
		
		if (separados[1] == 01) {
			meses = "janeiro";
		}
		if (separados[1] == 02) {
			meses = "fevereiro";
		}
		if (separados[1] == 03) {
			meses = "março";
		}
		if (separados[1] == 4) {
			meses = "abril";
		}
		if (separados[1] == 5) {
			meses = "maio";
		}
		if (separados[1] == 6) {
			meses = "junho";
		}
		if (separados[1] == 7) {
			meses = "julho";
		}
		if (separados[1] == 8) {
			meses = "agosto";
		}
		if (separados[1] == 9) {
			meses = "setembro";
		}
		if (separados[1] == 10) {
			meses = "outubro";
		}
		if (separados[1] == 11) {
			meses = "novembro";
		}
		if (separados[1] == 12) {
			meses = "dezembro";
		}
		if (separados[0]<=0 || separados[1]<=0 || separados[2]<=0) {
			saida.append("NULL");
		}else {
			saida.append(juntos[0]);
			saida.append(" de " + meses + " de ");
			saida.append(juntos[2] + ".");
		}
		return saida.toString();
		
	}
