package br.com.TesteMotoTrack;

import br.com.MotoTrack.MotoService;
import org.junit.Test;
import static org.junit.Assert.*;


public class MotoServiceTest {

    @Test
    public void deveCadastrarMotoComSucesso() {
        MotoService service = new MotoService();
        assertTrue(service.cadastrarMoto("ABC123"));
    }

    @Test
    public void naoDevePermitirMotoDuplicada() {
        MotoService service = new MotoService();
        service.cadastrarMoto("ABC123");
        assertFalse(service.cadastrarMoto("ABC123"));
    }

    @Test
    public void deveExcluirMotoExistente() {
        MotoService service = new MotoService();
        service.cadastrarMoto("ABC123");
        assertTrue(service.excluirMoto("ABC123"));
    }

    @Test
    public void deveContarMotosCorretamente() {
        MotoService service = new MotoService();
        service.cadastrarMoto("ABC456");
        service.cadastrarMoto("ABC123");
        assertEquals(2, service.contarMotos());
    }
}