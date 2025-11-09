package br.com.MotoTrack;

import java.util.ArrayList;
import java.util.List;

public class ManutencaoService {
    private List<String> manutencoes = new ArrayList<>();

    public boolean registrarManutencao(String descricao) {
        if (descricao == null || descricao.isBlank()) return false;
        manutencoes.add(descricao);
        return true;
    }

    public int totalManutencoes() {
        return manutencoes.size();
    }

    public boolean contemManutencao(String descricao) {
        return manutencoes.contains(descricao);
    }
}

