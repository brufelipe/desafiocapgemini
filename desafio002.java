package desafioCapgemini;

import java.util.Scanner;

public class desafio002 {
	public static boolean verifica(String senha) {
		if (senha.length() < 6)
			return false;
		boolean procNum = false;
		boolean procMaius = false;
		boolean procMinus = false;
		boolean procSimb = false;
		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				procNum = true;
			} else if (c >= 'A' && c <= 'Z') {
				procMaius = true;
			} else if (c >= 'a' && c <= 'z') {
				procMinus = true;
			} else {
				procSimb = true;
			}
		}
		return procNum && procMaius && procMinus && procSimb;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		String dados = entrada.next();
		System.out.println(verifica(dados));
	}
}