package academia.capgemini.test;

import java.util.Scanner;

public class Quest�o2Test01 {
	public static void main(String[] args) {
		// Classe Scanner p ler dados do teclado
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua senha: ");
		String senha = scan.nextLine();
		
		//Instancia��o das vari�veis
		int maiusculas = 0, minusculas = 0, numeros = 0, charEspeciais = 0, tamanhoSenha = 0, charFaltantes = 0;
		
		//Condi��o 1 - Pega e Verifica
		if(senha == null) return;
		for (int i = 0; i <= senha.length() -1; i++) {
			//Pegando valor de um char por vez
			char c = senha.charAt(i);
			
			//Verifica um character por vez 
			if (Character.isUpperCase(c)) {
				maiusculas++;
			} else if (Character.isLowerCase(c)) {
				minusculas++;
			} else if (Character.isDigit(c)) {
				numeros++;
			}			
			//!@#$%^&*()-+
			switch (c) {
			case '!': charEspeciais++; break;
			case '@': charEspeciais++; break;
			case '#': charEspeciais++; break;
			case '$': charEspeciais++; break;
			case '%': charEspeciais++; break;
			case '^': charEspeciais++; break;
			case '&': charEspeciais++; break;
			case '*': charEspeciais++; break;
			case '(': charEspeciais++; break;
			case ')': charEspeciais++; break;
			case '-': charEspeciais++; break;
			case '+': charEspeciais++; break;
			}
			
			//O lenght de senha n�o � o tamanho!
			//Por isso
			tamanhoSenha = i + 1;
		}
		
		//Condi��o 2 - Tamanho Certo
		if (tamanhoSenha >= 6) {
			System.out.println("Essa � uma senha v�lida!");
			if(maiusculas >= 1) {
				System.out.println("Tem letras mai�sculas");
			}
			if(minusculas >= 1) {
				System.out.println("Tem letras min�sculas");
			}
			if(numeros >= 1) {
				System.out.println("Tem n�meros");
			}
			if(charEspeciais >= 1) {
				System.out.println("Tem characteres especiais");
			}
			if(charEspeciais >= 1 && numeros >= 1 && minusculas >= 1 && maiusculas >= 1) {
				System.out.println("SENHA ULTRA FORTE!!!");
			}
		}
		do {
			tamanhoSenha++;
			charFaltantes++;
			if(tamanhoSenha == 6 ) {
				System.out.println("Senha incompat�vel!");
				System.out.println("A senha digitada n�o atende aos requisitos min�mos de 6 characteres! ");
				System.out.println("Por Favor adicione " + charFaltantes + " characteres.");
			}
		}while(tamanhoSenha <= 6);

	}
}

