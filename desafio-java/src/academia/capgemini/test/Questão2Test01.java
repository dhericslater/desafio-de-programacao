package academia.capgemini.test;

import java.util.Scanner;

public class Questão2Test01 {
	public static void main(String[] args) {
		// Classe Scanner p ler dados do teclado
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua senha: ");
		String senha = scan.nextLine();
		
		//Instanciação das variáveis
		int maiusculas = 0, minusculas = 0, numeros = 0, charEspeciais = 0, tamanhoSenha = 0, charFaltantes = 0;
		
		//Condição 1 - Pega e Verifica
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
			
			//O lenght de senha não é o tamanho!
			//Por isso
			tamanhoSenha = i + 1;
		}
		
		//Condição 2 - Tamanho Certo
		if (tamanhoSenha >= 6) {
			System.out.println("Essa é uma senha válida!");
			if(maiusculas >= 1) {
				System.out.println("Tem letras maiúsculas");
			}
			if(minusculas >= 1) {
				System.out.println("Tem letras minúsculas");
			}
			if(numeros >= 1) {
				System.out.println("Tem números");
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
				System.out.println("Senha incompatível!");
				System.out.println("A senha digitada não atende aos requisitos minímos de 6 characteres! ");
				System.out.println("Por Favor adicione " + charFaltantes + " characteres.");
			}
		}while(tamanhoSenha <= 6);

	}
}

