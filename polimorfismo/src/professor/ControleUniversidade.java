package professor;

import java.util.ArrayList;

public class ControleUniversidade {

	private ArrayList<Professor> professores;

	public ControleUniversidade() {
		this.professores = new ArrayList<Professor>();
	}

	public void adicionaProfessor(Professor p) {
		professores.add(p);
	}

	public double calculaTotalGasto() {
		double gastoTotal = 0.0;
		for (Professor professor : professores) {
			gastoTotal += professor.calculaSalarioLiquido();
		}
		return gastoTotal;
	}

}
