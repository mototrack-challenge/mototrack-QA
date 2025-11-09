package br.com.TesteMotoTrack;

import br.com.MotoTrack.ColaboradorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorServiceTest {

    @Test
    void deveCadastrarColaboradorComSucesso() {
        ColaboradorService service = new ColaboradorService();
        assertTrue(service.cadastrarColaborador("Carlos", "Mecânico"));
    }

    @Test
    void naoDeveCadastrarColaboradorSemCargo() {
        ColaboradorService service = new ColaboradorService();
        assertFalse(service.cadastrarColaborador("João", ""));
    }
}
