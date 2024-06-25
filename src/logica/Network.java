package logica;

// Autor: Flávio da Silva
// Data: 2024

public class Network {
	
	private int[][] arr_connexoes = { {}, {} };
	private int[] arr_numeros = {};	

	// Construtor da Classe
	public Network(int total_numeros) {
		if (total_numeros < 2) {
			throw new ArrayIndexOutOfBoundsException("A quantidade de elementos deve ser maior do que 1.");
		}
		if (total_numeros > 100) {
			throw new ArrayIndexOutOfBoundsException("Lista de elementos muito longa, o máximo permitido é 100.");
		}
		this.arr_numeros = new int[total_numeros];
	}

	/* Will take two integers indicating the elements to connect. This method should throw
	 * exceptions as appropriate 
	 * */
	public boolean connect(int a, int b) {
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
