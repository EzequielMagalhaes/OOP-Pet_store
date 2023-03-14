public class Login{
	public static void main(String[] args) {
		//Nasce na Classe
		Login login = new Login();
		login.chamarSistema();
	}
	
	private void chamarSistema() {
		//Nasce com o objeto
		System.out.println("Entrei no sistema");
		PetStore petStore = new PetStore();
		petStore.entrarNaLoja();
	}
}