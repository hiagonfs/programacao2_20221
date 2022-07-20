package exceptionAula;

public class Main {

	public static void main(String[] args) {

		Cadastro c = new Cadastro();

		try {
			c.adicionaPessoa2("Hiago", -4);
			c.adicionaPessoa2(null, 2);
			c.adicionaPessoa2("", 4);
			System.out.println("Opa, deu certo!");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("Eita, caiu na exception!");
		}

	}

}
