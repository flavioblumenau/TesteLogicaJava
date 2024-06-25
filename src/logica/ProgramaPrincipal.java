package logica;

/*
 * Teste de Lógica de Programação em Java
 * Data: 25/06/2024 
 * 
 * */

public class ProgramaPrincipal {
	
	private static void relatorio(Network n, int a, int b) throws Exception {
		if (n.query(a, b)) { 
			System.out.println(a + " e " + b + " conectados: Sim"); 
		} 
		else { 
			System.out.println(a + " e " + b + " conectados: Não"); 
		}
	}

	public static void main(String[] args) {
		
		Network n = new Network(8);
		try {
			n.connect(1, 2);		
			n.connect(1, 6);
			n.connect(2, 6);
			n.connect(2, 4);
			n.connect(5, 8);
			
			System.out.println("RELATÓRIO FINAL");
			
			relatorio(n, 1, 2);
			relatorio(n, 1, 6);			
			relatorio(n, 2, 4);
			relatorio(n, 1, 4);
			relatorio(n, 5, 1);
			relatorio(n, 2, 6);
			relatorio(n, 2, 4);			
			relatorio(n, 5, 8);
			relatorio(n, 2, 9);
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
