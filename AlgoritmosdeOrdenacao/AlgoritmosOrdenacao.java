public class AlgoritmosOrdenacao {
	private int vetor[] = {25,57,38,37,12,92,33};
	
	public void bubbleSort() {
		int it; // numero de iterações
		int pos; // sempre uso a posicao atual
		int tmp; // variavel para a troca
		
		for (it = 0;it < vetor.length - 1;it++) {
			for(pos = 0;pos < vetor.length - 1;pos++) { // comparo o elemento da posicao com seu proximo
				if(vetor[pos] > vetor[pos + 1]) {
					tmp = vetor[pos];
					vetor[pos] = vetor[pos + 1];
					vetor[pos + 1] = tmp;
				}
			
			}
			System.out.println("------->Final da iteração " + it);
			mostraVetor();	
		} 
	}
	
	public void mostraVetor() {
		for (int i = 0;i < vetor.length;i++) {
			System.out.print(vetor[i] + "  ");
			System.out.print("");
		}
		System.out.println("");
	}
}
