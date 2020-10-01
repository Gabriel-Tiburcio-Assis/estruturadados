public class ListaDuplaCircular {
	private CaixinhaDupla inicio;
	
	public ListaDUplaCircular() {
		this.inicio = null;
	}
	
	public boolean isEmpty() {
		return(this.inicio == null);
	}
	
	public void inserir(int elemento) {
		 CaixinhaDupla novo = new CaixinhaDupla();
		 novo.setElemento(elemento);
		 
		 if (isEmpty) {
		 	novo.setProximo(novo);
		 	novo.setAnterior(novo);
		 	inicio = novo;
		 }
		 else {
		 	CaixinhaDupla tmp = inicio; //percorrer a lista  e posicionar o ponteiro na ultima posição da lista para ser inserido.
		 	while(tmp.getProximo() != inicio) {
		 		tmp = tmp.getProximo();
		 	}
		 	tmp.setProximo(novo);
		 	novo.setAnterior(tmp);
		 	novo.setProximo(inicio); 
		 	
		 }
	}
	
	public void exibirNaOrdem() t
		CaixinhaDupla tmp;
		tmp = inicio;
		do {
			System.out.println("Elemento da Lista = " + tmp.getElemento());
		} while (tmp.getProximo() != inicio);
		
	}
}
