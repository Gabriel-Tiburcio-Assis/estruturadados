public class Televisao{
	String marca;
	boolean ligado;
	int volume;
	int canal;
	public Televisao() {
		ligado = false;
		
	}
	
	public void ligar() {
		ligado = true;
		System.out.println("TV " + marca + " ligada!");
	}
	
	public void desligar() {
		ligado = false;
		System.out.println("desligando TV da marca " + marca);
	}
	
	public void defineMarca(String m) {
		this.marca = m;
		System.out.println("TV=Marca Definida" + marca);
	}
	
	public void defineVolume(int vol) {
		if (ligado == true){
			volume = vol;
			System.out.println("TV" + marca + " volume definido para " + vol);
		}	
		else{
			System.out.println("Por favor,ligue antes a TV " + marca);
		}	
	}
	
	public void defineCanal(int canal) {
		if(ligado == true) {
			this.canal = canal;
			System.out.println("TV " + marca + " com canal definido para " + canal);
		}
		else{
			System.out.println("ligue a tv " + marca + " antes de definir o canal");
		}
	}
	
	public void aumentaVolume() {
		if (ligado == true) {
			volume++;
			System.out.println("TV " + marca + ": volume atual " + volume);
		}
		else {
			System.out.println("TV " + marca + " está desligada");
		}
	}
	public void avancaCanal() {
		if (ligado == true) {
			canal++;
			System.out.println("TV " + marca + " está no canal " + canal);
		}
		else{
			System.out.println("TV " + marca + " está desligada");
		}
	}
	
	public void retrocedeCanal() {
		if (ligado == true) {
			canal--;
			System.out.println("TV " + marca + " está no canal " + canal);
		}
		else {
			System.out.println("TV " + marca + "está desligada");
		}
	}
}
