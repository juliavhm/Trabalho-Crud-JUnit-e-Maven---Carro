import java.util.ArrayList;
import java.util.List;

public class RepositorioCarro implements IRepositorioCarro {
	List<Carro> carros = new ArrayList<Carro>();

	public boolean cria(Carro carro) {
		carros.add(carro);
		return true;
	}

	public boolean atualiza(String placa, String novaPlaca) {
		for (int i = 0; i < carros.size(); i++) {
			if (carros.get(i).getPlaca().equals(placa)) {
				carros.get(i).setPlaca(novaPlaca);
				System.out.println("Lista atualizada: ");

				return true;
			}

		}
		return false;
	}

	public List<Carro> retornaLista() {
		return carros;
	}

	public boolean deleta(String placa) {
		for (int i = 0; i < carros.size(); i++) {
			if (carros.get(i).getPlaca().equals(placa)) {
				carros.remove(i);
				System.out.println("Carro removido com sucesso!");
				return true;
			}

		}
		return false;
	}

}