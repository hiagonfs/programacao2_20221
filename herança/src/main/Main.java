package aluno;

public class Main {
	
	public static void main(String[] args) {
		
		Aluno carlos = new Normal("Carlos", 20, 8.7);
		
		Aluno sara = new Estrangeiro("Sara", 20, 8.7);
		
		System.out.println(carlos.getNome());
		System.out.println(carlos.calculaCRA());
		
		System.out.println("---------");
		
		System.out.println(sara.getNome());
		System.out.println(sara.calculaCRA());
		
	}

}
