package main;

import professor.ControleUniversidade;
import professor.Professor;
import professor.ProfessorEfetivo;
import professor.ProfessorSubstituto;

public class Main {

	public static void main(String[] args) {

		Professor a = new ProfessorEfetivo("Carlos", "085555", 20, 3200);
		Professor b = new ProfessorSubstituto("Andre", "085555", 21, 3200);

		ControleUniversidade controle = new ControleUniversidade();

		controle.adicionaProfessor(a);
		controle.adicionaProfessor(b);

		System.out.println(controle.calculaTotalGasto());

	}

}
