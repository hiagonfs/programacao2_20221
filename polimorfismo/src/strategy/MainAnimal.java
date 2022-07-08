package strategy;

public class MainAnimal {

	public static void main(String[] args) {

		Animal a = new Animal();

		a.anda();
		a.dorme();

		TipoAnimal tReptil = new Reptil();

		a.setTipoAnimal(tReptil);

		a.anda();
		a.dorme();

		a.setTipoAnimal(new Ave());

		a.anda();
		a.dorme();

	}

}
