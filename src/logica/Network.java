package logica;

// Autor: Flávio da Silva
// Data: 2024

public class Network {
	
	private int[][] arr_connexoes = { {}, {} };
	private int[] arr_numeros = {};
	
	
	private boolean conexaoExiste(int a, int b) {
		// percorre as conexoes e testa se já existe 
		for (int indice = 0; indice < this.arr_connexoes.length; indice++) {
			if (a == b) {
				return true;
			}
		}
		return false;
		
	}
	
	private boolean numeroExiste(int a) {
 
		for (int b : arr_numeros) {
			if (a == b) {
				return true;
			}
		}
		return false;
		
	}

	// Construtor da Classe
	public Network(int total_numeros) {
		if (total_numeros < 2) {
			throw new ArrayIndexOutOfBoundsException("A quantidade de elementos deve ser maior do que 1.");
		}
		if (total_numeros > 100) {
			throw new ArrayIndexOutOfBoundsException("Lista de elementos muito longa, o máximo permitido é 100.");
		}
		this.arr_numeros = new int[total_numeros];
		for (int i = 1; i <= total_numeros; i++) {
			this.arr_numeros[i-1] = i;
		}
	}

	/* Will take two integers indicating the elements to connect. This method should throw
	 * exceptions as appropriate 
	 * */
	public boolean connect(int a, int b) throws Exception {
		if (! this.numeroExiste(a)) {
			throw new Exception("Numero " + a + " não encontrado.");
		}
		if (! this.numeroExiste(b)) {
			throw new Exception("Numero " + b + " não encontrado.");
		}
		if (this.conexaoExiste(a, b)) {
			throw new Exception("A conexão entre "+ a + " e " + b + " já existe.");
		}
		
		return false;
	}
	
	/*
	 * It takes two Integers and Should
	 * Also Throw an Exception as appropriate. 
	 * 	It should return true if the elements are connected,
	 * 	directly or indirectly, and false if the elements are not connected. 
	 * */
	public boolean query() {
		return false;
	}

}
