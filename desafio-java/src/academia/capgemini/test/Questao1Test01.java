package academia.capgemini.test;

public class Questao1Test01 {

	public static void main(String[] args) {
		//Variáveis
		int n = 7;
		char degrau = '*';
		char espaco = ' ';
		char[] escada = new char[n];

		//Condições
		if(n == 0) return;
		for(int i = 0; i < n; i++) {
			escada[i] = espaco;
		}
		for(int i = 0; i < n; i++) {
			escada[i] = degrau;
			System.out.println(escada);
		}
	}

}

