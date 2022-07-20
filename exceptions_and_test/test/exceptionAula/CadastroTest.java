package exceptionAula;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CadastroTest {

	private Pessoa p;
	private Pessoa p1;

	@Before // executado SEMPRE antes de cada método de teste
	public void inicia() throws Exception {
		p = new Pessoa("Hiago", 10);
		p1 = new Pessoa("Carlos", 20);
	}

	@Test
	public void testAdicionaPessoa() {
		Cadastro c = new Cadastro();
		c.adicionaPessoa(p);
		c.adicionaPessoa(p1);
		assertEquals(2, c.getQtdPessoasNaLista());
	}

	@Test
	public void testListaVazia() {
		Cadastro c = new Cadastro();
		assertEquals(0, c.getQtdPessoasNaLista());
	}

}
