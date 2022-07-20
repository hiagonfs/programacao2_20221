package exceptionAula;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

	private List<Pessoa> pessoas;

	public Cadastro() {
		this.pessoas = new ArrayList<Pessoa>();
	}

	public int getQtdPessoasNaLista() {
		return this.pessoas.size();
	}

	public void adicionaPessoa(Pessoa p) {
		pessoas.add(p);
	}

	public void adicionaPessoa(String nome, int idade) {
		Pessoa p = null;
		try {
			// tentar executar a linha de codigo que lanca exception
			p = new Pessoa(nome, idade);
		} catch (Exception ex) {
			// capturar a exception // trata ela
			System.out.println(ex.getMessage());
		}

		pessoas.add(p);
	}

	public void adicionaPessoa2(String nome, int idade) throws Exception {

		if (nome == null) {
			throw new Exception("Nome está nulo!");
		}
		if (nome.isEmpty()) {
			throw new Exception("Nome da pessoa está vazio!");
		}
		if (idade < 0) {
			throw new Exception("Idade invalida!");
		}

		Pessoa p = new Pessoa(nome, idade);

		pessoas.add(p);

	}

}
