package exceptionAula;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testGetNome() {
		Pessoa p = new Pessoa("Hiago", 28);
		assertEquals("Hiago", p.getNome());
	}

	@Test
	public void testGetIdade() {
		Pessoa p = new Pessoa("Hiago", 10);
		assertEquals(10, p.getIdade());
	}

	@Test
	public void testSetNome() {
		Pessoa p = new Pessoa("Hiago", 10);
		p.setNome("Carlos");
		assertEquals("Carlos", p.getNome());
	}

}
