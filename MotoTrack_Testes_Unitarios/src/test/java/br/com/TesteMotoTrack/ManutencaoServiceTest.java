package br.com.TesteMotoTrack;

import br.com.MotoTrack.ManutencaoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManutencaoServiceTest {

    @Test
    void deveRegistrarManutencao() {
        ManutencaoService service = new ManutencaoService();
        assertTrue(service.registrarManutencao("Troca de óleo"));
    }

    @Test
    void naoDeveRegistrarManutencaoVazia() {
        ManutencaoService service = new ManutencaoService();
        assertFalse(service.registrarManutencao(""));
    }
}

