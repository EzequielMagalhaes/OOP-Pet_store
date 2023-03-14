public class Cobra extends AnimalSelvagem{
	public int obterGrauPerigo() {
		return 6;
	}
	
	private int qtdRatos;
		
		public void enviarAlimento(int qtdAlimento) {
			this.qtdRatos = qtdAlimento;
		}
		
		public void emitirSom() {
			System.out.println("Sssss" + qtdRatos);
		}
		
		public void regurgitar() {
			System.out.println("cuspiu fora...");
		}
}