/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacega;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Raissa2
 */

public class BaseConhecimento {

    ArrayList<Regra> regras;

    public BaseConhecimento() {
        regras = new ArrayList<Regra>();
    }

    public void addRegra(String id, PadraoRegra p, Transicao o) {
        regras.add(new Regra(id, p, o));
    }

    public ArrayList<Regra> getRegras(HashMap<String, BigDecimal> estado) {
        ArrayList<Regra> selecao = new ArrayList<Regra>();
        for (Regra regra : regras) {
            if (regra.getPadraoRegra().avaliar(estado)) {
                selecao.add(regra);
            }
        }
        return selecao;
    }
}
