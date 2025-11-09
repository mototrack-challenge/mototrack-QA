package br.com.MotoTrack;

import java.util.HashSet;
import java.util.Set;

public class MotoService {
    private Set<String> motos = new HashSet<>();

    public boolean cadastrarMoto(String placa) {
        if (placa == null || placa.isBlank()) return false;
        return motos.add(placa.toUpperCase());
    }

    public boolean excluirMoto(String placa) {
        return motos.remove(placa.toUpperCase());
    }

    public int contarMotos() {
        return motos.size();
    }

    public boolean verificarDuplicidade(String placa) {
        return motos.contains(placa.toUpperCase());
    }
}

