package strategy;

public class Animal {
	
	private TipoAnimal tipoAnimal; 

	public Animal() {
		tipoAnimal = new Mamifero(); 
	}

	public void dorme() {
		tipoAnimal.dorme();
	}

	public void anda() {
		tipoAnimal.anda();
	}
	
	public void setTipoAnimal(TipoAnimal t) {
		this.tipoAnimal = t; 
	}

}
