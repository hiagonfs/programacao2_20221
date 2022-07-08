package strategy;

public class Mamifero implements TipoAnimal {

	@Override
	public void dorme() {
		System.out.println("Mamifero dorme");
	}

	@Override
	public void anda() {
		System.out.println("MAmifero anda");
	}

}
