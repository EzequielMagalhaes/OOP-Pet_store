public class PetStore {
	public void entrarNaLoja() {
		Cachorro theo = new Cachorro();
		theo.enviarAlimento(3);
		Gato bichento = new Gato();
		bichento.enviarAlimento(3);
		Cobra cc = new Cobra();
		cc.setNumSeloIbama("348934");
		
		Pet ze = new Cachorro(); //novo pet com 'caracteristicas' de cachorro;
		Pet jo = new Gato();
		Pet pi = new Cobra();
		
		Animal z3 = new Cachorro();
		
		theo.cavar();
		ze.emitirSom();
		z3.emitirSom();
	}
}