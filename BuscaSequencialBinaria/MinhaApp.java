public class MinhaApp {
	public static void main(String args[]) {
	Colecao colecao = new Colecao();
	System.out.println("------------Busca Sequencial------------");
	System.out.println("Posição do Elemento 23 = " + colecao.buscaSequencial(23));
	System.out.println("Posição do Elemento 12 = " + colecao.buscaSequencial(12));
	System.out.println("Posição do Elemento 76 = " + colecao.buscaSequencial(76));
	System.out.println("Posição do Elemento 99 = " + colecao.buscaSequencial(99));
	System.out.println("\n \n");
	System.out.println("-----------Busca Binária---------------");
	System.out.println("Posição do Elemento 23 = " + colecao.buscaBinaria(23));
	System.out.println("Posição do Elemento 12 = " + colecao.buscaBinaria(12));
	System.out.println("Posição do Elemento 76 = " + colecao.buscaBinaria(76));
	System.out.println("Posição do Elemento 99 = " + colecao.buscaBinaria(99));
	
	}

}
