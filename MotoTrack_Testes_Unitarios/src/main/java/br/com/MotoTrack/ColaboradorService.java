package br.com.MotoTrack;

import java.util.HashMap;
import java.util.Map;

public class ColaboradorService {
    private Map<String, String> colaboradores = new HashMap<>();

    public boolean cadastrarColaborador(String nome, String cargo) {
        if (nome == null || nome.isBlank() || cargo == null || cargo.isBlank()) return false;
        colaboradores.put(nome.toUpperCase(), cargo);
        return true;
    }

    public boolean verificarColaborador(String nome) {
        return colaboradores.containsKey(nome.toUpperCase());
    }

    public int totalColaboradores() {
        return colaboradores.size();
    }
}
