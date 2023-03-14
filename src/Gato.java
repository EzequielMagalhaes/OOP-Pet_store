public class Gato implements Pet{
	private int qtdRacao;
	
	public void enviarAlimento(int qtdAlimento) {
		this.qtdRacao = qtdAlimento; //this se refere ao qtdRacao de fora;
	}
	
	public void emitirSom() {
		System.out.println("miau,miau" + qtdRacao);
	}
	
	public void arranhar() {
		System.out.println("Acabei com o sofa");
	}
}