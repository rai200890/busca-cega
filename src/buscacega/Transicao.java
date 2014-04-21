package buscacega;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class Transicao {

    private HashMap<String, Expression> transicao;

    public Transicao(HashMap<String, String> t) {
        transicao = new HashMap<String, Expression>();
        for (String variavel : t.keySet()) {
            String regra = t.get(variavel);
            transicao.put(variavel, new Expression(regra));
        }
    }

    public HashMap<String, BigDecimal> resultado(HashMap<String, BigDecimal> parametros) {
        HashMap<String, BigDecimal> resposta = new HashMap<String, BigDecimal>();
        Expression expressao;
        for (String variavel : transicao.keySet()) {
            expressao = transicao.get(variavel);
            for (String parametro : parametros.keySet()) {
                expressao.setVariable(parametro, parametros.get(parametro));
            }
            resposta.put(variavel, transicao.get(variavel).eval());
        }
        return resposta;
    }
}
