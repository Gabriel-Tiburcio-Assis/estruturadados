public class ClasseQueUsaTV{
	public static void main (String[] args) {
		Televisao t = new Televisao();
		t.defineMarca("Samsung");
		t.defineVolume(10);
		t.ligar();
		t.defineCanal(4);
		t.avancaCanal();
		t.retrocedeCanal();
		t.aumentaVolume();
		t.desligar();
	}
}
