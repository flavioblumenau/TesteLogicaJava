package logica;

import java.util.Arrays;

// Autor: Flávio da Silva
// E-mail: programadorflavio@hotmail.com
// Data: 2024

public class Network {

	/* a ideia adotada é adicionar um vetor bidimensional 
	 a dimensão 0 significa a conexao
	 a dimensão 1 significa os elementos concetados
	 
	 Exemplo  conectando os elementos 1 e 6
	 
	  arr_connexoes[0][0] = 1;
	  arr_connexoes[0][1] = 6;
	  
	  Signifia que na conexao 0 tem dois elementos: 1 e 6
	*/
	
	private int[][] arr_connexoes = {};
	
	private int[] arr_numeros = {};	
	
	private boolean conexaoExiste(int a, int b) {
		// percorre as conexoes e testa se já existe 
		for (int indice = 0; indice < this.arr_connexoes.length; indice++) {
			if ((this.arr_connexoes[indice].length==2) && 
				(this.arr_connexoes[indice][0] == a || this.arr_connexoes[indice][0] == b) &&
				(this.arr_connexoes[indice][1] == a || this.arr_connexoes[indice][1] == b)) {
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
		
		if (this.query(a, b)) {
			throw new Exception("A conexão entre "+ a + " e " + b + " já existe.");
		}
		
		arr_connexoes = Arrays.copyOf(arr_connexoes, arr_connexoes.length + 1);
		arr_connexoes[arr_connexoes.length - 1] = new int[2];
		arr_connexoes[arr_connexoes.length - 1][0] = a;
		arr_connexoes[arr_connexoes.length - 1][1] = b;
			
		
		
		return true;
	}
	
	/*
	 * It takes two Integers and Should
	 * Also Throw an Exception as appropriate. 
	 * 	It should return true if the elements are connected,
	 * 	directly or indirectly, and false if the elements are not connected. 
	 * */
	public boolean query(int a, int b) throws Exception {
		if (! this.numeroExiste(a)) { 
			throw new Exception("Numero " + a + " não encontrado.");
		}
		if (! this.numeroExiste(b)) {
			throw new Exception("Numero " + b + " não encontrado.");
		}
		
		return this.conexaoExiste(a, b);
	}

}
