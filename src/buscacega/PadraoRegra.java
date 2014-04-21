package buscacega;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Raissa2
 */
public class PadraoRegra {

    private Expression padrao;
    private String regra;

    public PadraoRegra(String r) {
        regra = r;
        padrao = new Expression(regra);
    }

    public boolean avaliar(HashMap<String, BigDecimal> parametros) {
        BigDecimal valor;
        for (String chave : parametros.keySet()) {
            valor = parametros.get(chave);
            padrao.setVariable(chave, valor);
        }
        return eval();
    }

    public String getRegra() {
        return regra;
    }

    private boolean eval() {
        return (padrao.eval().equals(new BigDecimal(1)));
    }
}
