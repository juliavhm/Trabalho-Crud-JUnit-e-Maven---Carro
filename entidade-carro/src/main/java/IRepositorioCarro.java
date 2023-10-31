import java.util.List;

public interface IRepositorioCarro {
	public boolean cria(Carro carro);

	public boolean atualiza(String placa, String novaPlaca);

	public List<Carro> retornaLista();

	public boolean deleta(String placa);

}
