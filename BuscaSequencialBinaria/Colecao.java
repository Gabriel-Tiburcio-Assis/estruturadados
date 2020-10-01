public class Colecao {
	private int valores[] = {11,12,23,27,33,43,56,76,87,96};
	
	
	public int buscaSequencial(int val) {
		int pos;
		int iteracoes = 0;
		for(pos = 0;pos < valores.length;pos++) {
			if (val == valores[pos]) {
				System.out.println("Iteracoes = " + iteracoes);
				return pos; // retorno a localização onde o elemento se encontra
			}
			iteracoes++;
		}
		System.out.println("Iteracoes = " + iteracoes);
		return -1; //indicando posição invalida(ou seja,não encontrei o elemento)
	
	}
	
	public int buscaBinaria(int val) {
		int meio,inicio,fim;
		inicio = 0;
		int iteracoes = 0;
		fim = valores.length-1;
		
		while (inicio <=  fim) {
			iteracoes++;
		
			meio = (inicio + fim)/2;
			if (val == valores[meio]) {
				System.out.println("Iteracoes = " + iteracoes);
				return meio;
			}
			else if(val > valores[meio]) {
				inicio = meio+1;
			}
			else {
				fim = meio - 1;
			}
			
		}
		System.out.println("Iteracoes = " + iteracoes);
		return -1;
	
	
	}
	
	
}
