package academia.capgemini.test;

public class Questao1Test01 {

	public static void main(String[] args) {
		//Vari�veis
		int n = 7;
		char degrau = '*';
		char espaco = ' ';
		char[] escada = new char[n];

		//Condi��es
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

