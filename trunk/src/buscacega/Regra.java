package buscacega;

import java.math.BigDecimal;

/**
 *
 * @author Raissa2
 */
public class Regra {

    private String id;
    private PadraoRegra padrao;
    private Transicao transicao;

    public Regra(String id, PadraoRegra padrao, Transicao Transicao) {
        this.id = id;
        this.padrao = padrao;
        this.transicao = Transicao;
    }

    public PadraoRegra getPadraoRegra() {
        return this.padrao;
    }

    public Transicao getTransicao() {
        return this.transicao;
    }

    public String getId() {
        return this.id;
    }
}
