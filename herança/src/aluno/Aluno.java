package aluno;

public abstract class Aluno {

	private String nome;
	private int idade;
	private double cra;

	public Aluno(String nome, int idade, double cra) {
		this.nome = nome;
		this.idade = idade;
		this.cra = cra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getCra() {
		return cra;
	}

	public void setCra(double cra) {
		this.cra = cra;
	}

	public abstract double calculaCRA();

}
