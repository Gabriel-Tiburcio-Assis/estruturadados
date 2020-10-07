import java.lang.Math;
public class GeradorDeValores {
	static int vetor[];
	
	public static boolean pertence(int valor,int tam) {
		for (int i = 0; i < tam;i++) {
			if(vetor[i] == valor) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		vetor = new int[Integer.parseInt(args[0])];
		//System.out.println("Criei um vetor de tamanho " + vetor.length);
		
		
		int valor;
		int pos;
		// gerei valores aleatorios
		pos = 0;
		for (pos = 0;pos < vetor.length;pos++) {
			do{
			valor =(int) (Math.random() * 1000000) % 1000000;
			} while (pertence(valor,pos));
			vetor[pos] = valor;
		}
		
		// imprimir estes caras
		for (pos = 0;pos < vetor.length;pos++) {
			System.out.println(vetor[pos]);
		}
	}
}
