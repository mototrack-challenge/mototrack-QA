package br.com.TesteMotoTrack;

import br.com.MotoTrack.EstoqueService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueServiceTest {

    @Test
    void deveAdicionarEConsultarPeca() {
        EstoqueService service = new EstoqueService();
        service.adicionarPeca("P001", 10);
        assertEquals(10, service.consultarQuantidade("P001"));
    }

    @Test
    void deveRetirarPecaComSucesso() {
        EstoqueService service = new EstoqueService();
        service.adicionarPeca("P002", 5);
        assertTrue(service.retirarPeca("P002", 3));
    }
}

