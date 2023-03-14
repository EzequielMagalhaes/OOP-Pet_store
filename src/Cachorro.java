public class Cachorro implements Pet{
	private int qtdOsso;
	
	public void enviarAlimento(int qtdAlimento) {
		this.qtdOsso = qtdAlimento;
	}
	
	public void emitirSom() {
		System.out.println("Auau" + qtdOsso);
	}
	
	public void cavar() {
		System.out.println("Enterrei!");
	}
}