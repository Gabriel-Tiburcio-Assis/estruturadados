public class Conversor {
	public static void main(String args[]) {
		int numero = Integer.parseInt(args[0]);
		Pilha p = new Pilha();
		// fase 1 = empilhamento dos restos
		int resto;
		while(numero != 0) {
			resto = numero % 2; //pego o resto da divisao desse número por 2 (vale 0 ou 1)
			p.push(resto); //armazeno na pilha
			numero = numero /2; //gero um número,resultado da divisão por 2
		}
		// fase 2 = exibicao dos restos
		while(!p.isEmpty()){
			resto = p.pop(); //remove da pilha (Sempre o cara que está no tpo)
			System.out.print(resto);
		}
		System.out.println("\n fim do programa");
		
	}

}
	
