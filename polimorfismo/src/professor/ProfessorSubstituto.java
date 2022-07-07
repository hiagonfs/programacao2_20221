package professor;

public class ProfessorSubstituto extends Professor {
	
	public static double TAXA_SUBSTITUTO = 0.7;

	public ProfessorSubstituto(String nome, String cpf, int idade, double salario) {
		super(nome, cpf, idade, salario);
	}
	
	@Override
	public double calculaSalarioLiquido() {
		return getSalario() * TAXA_SUBSTITUTO;
	}
	
}
