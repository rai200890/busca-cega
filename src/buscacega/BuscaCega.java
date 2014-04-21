package buscacega;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Raissa2
 */
public class BuscaCega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Regra 1
        BaseConhecimento kb = new BaseConhecimento();
        HashMap<String, String> transicao = new HashMap<String, String>();
        transicao.put("x", "y+1");
        transicao.put("y", "x+2");
        Transicao t = new Transicao(transicao);
        kb.addRegra("r1", new PadraoRegra("(x<y) && (x>1)"), t);
        HashMap<String, BigDecimal> estado = new HashMap<String, BigDecimal>();
        estado.put("x", new BigDecimal(2));
        estado.put("y", new BigDecimal(3));
        HashMap<String, BigDecimal> resultado = new HashMap<String, BigDecimal>();
        resultado = t.resultado(estado);
        ArrayList<Regra> filtro = kb.getRegras(estado);
        for (Regra regra : filtro) {
            System.out.println(regra.getId());
            System.out.println(regra.getTransicao().resultado(estado));
        }
    }
}
