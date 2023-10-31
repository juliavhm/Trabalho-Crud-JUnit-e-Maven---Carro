public class TesteCarro {

	public static void main(String[] args) {
		RepositorioCarro repCarro = new RepositorioCarro();

// Criação de carro
		Carro carro1 = new Carro("Renault", "Clio", 2001, "KWZ-2003");
		repCarro.cria(carro1);
		System.out.println("Carro adicionado ao repositório: " + carro1);

// Att. carro

		repCarro.atualiza("KWZ-2003", "LOV-3333");
		System.out.println(repCarro.retornaLista());

// Del. carro
		repCarro.deleta("LOV-3333");

	}

}
