package br.com.MotoTrack;

import java.util.HashMap;
import java.util.Map;

public class EstoqueService {
    private Map<String, Integer> estoque = new HashMap<>();

    public void adicionarPeca(String codigo, int quantidade) {
        estoque.put(codigo, estoque.getOrDefault(codigo, 0) + quantidade);
    }

    public boolean retirarPeca(String codigo, int quantidade) {
        if (!estoque.containsKey(codigo) || estoque.get(codigo) < quantidade) return false;
        estoque.put(codigo, estoque.get(codigo) - quantidade);
        return true;
    }

    public int consultarQuantidade(String codigo) {
        return estoque.getOrDefault(codigo, 0);
    }
}
