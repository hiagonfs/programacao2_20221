package professor;

import java.util.Objects;

public abstract class Professor {

	private String nome;
	private String cpf;
	private int idade;
	private double salario;

	public Professor(String nome, String cpf, int idade, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, idade, nome, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(cpf, other.cpf) && idade == other.idade && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", salario=" + salario + "]";
	}

	public abstract double calculaSalarioLiquido();

}
