import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepositorioCarroTest {

    private RepositorioCarro repositorioCarro;

    @BeforeEach
    public void setUp() {
       
        repositorioCarro = new RepositorioCarro();
    }

    @Test
    public void testCria() {
        Carro carro = new Carro("Marca1", "Modelo1", 2020, "ABC123");
        assertTrue(repositorioCarro.cria(carro));
    }
    @Test
    public void testAtualiza() {
        Carro carro = new Carro("Marca1", "Modelo1", 2020, "ABC123");
        repositorioCarro.cria(carro);

        String novaPlaca = "XYZ789";
        assertTrue(repositorioCarro.atualiza("ABC123", novaPlaca));
    }

    @Test
    public void testRetornaLista() {
        Carro carro1 = new Carro("Marca1", "Modelo1", 2020, "ABC123");
        Carro carro2 = new Carro("Marca2", "Modelo2", 2021, "XYZ789");
        repositorioCarro.cria(carro1);
        repositorioCarro.cria(carro2);

        assertEquals(2, repositorioCarro.retornaLista().size());
    }

    @Test
    public void testDeleta() {
        Carro carro = new Carro("Marca1", "Modelo1", 2020, "ABC123");
        repositorioCarro.cria(carro);

        assertTrue(repositorioCarro.deleta("ABC123"));
    }
}