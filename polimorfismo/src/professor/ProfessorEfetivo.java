package professor;

public class ProfessorEfetivo extends Professor {

	public static final double TAXA_EFETIVO = 1.1;

	public ProfessorEfetivo(String nome, String cpf, int idade, double salario) {
		super(nome, cpf, idade, salario);
	}

	@Override
	public double calculaSalarioLiquido() {
		return getSalario() * TAXA_EFETIVO;
	}

}
