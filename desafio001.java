package desafioCapgemini;

public class desafio001 {

	public static void main(String[] args) {
		int n = 6;
		String texto = "*";
		for (int i = 0; i < n - 1; i++) {
			texto = " " + texto;
		}
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.println(texto);
				continue;
			}
			String valorPraTrocar = new String(new char[i]).replace("\0", "*");
			String novoValor = valorPraTrocar + "*";
			texto = texto.replace(" " + valorPraTrocar, novoValor);
			System.out.println(texto);
		}
	}
}