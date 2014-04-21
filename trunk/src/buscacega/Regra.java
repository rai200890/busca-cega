package buscacega;

import java.math.BigDecimal;

/**
 *
 * @author Raissa2
 */
public class Regra {

    private String id;
    private PadraoRegra padrao;
    private Operacao operacao;

    public Regra(String id, PadraoRegra padrao, Operacao operacao) {
        this.id = id;
        this.padrao = padrao;
        this.operacao = operacao;
    }

    public PadraoRegra getPadraoRegra() {
        return this.padrao;
    }

    public Operacao getOperacao() {
        return this.operacao;
    }

    public String getId() {
        return this.id;
    }
}
