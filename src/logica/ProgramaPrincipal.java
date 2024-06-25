package logica;

/*
 * Teste de Lógica de Programação em Java
 * Data: 25/06/2024 
 * 
 * */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Network n = new Network(8);
		try {
			n.connect(1, 2);		
			n.connect(1, 6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
