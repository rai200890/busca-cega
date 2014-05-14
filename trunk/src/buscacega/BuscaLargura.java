package buscacega;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author raissa
 */
public class BuscaLargura {

    public static void buscar(Problem p) {
        LinkedList<String> open, closed;
        open = new LinkedList();
        closed = new LinkedList();
        String id;
        JSONObject estado;
        JSONArray sucessores;
        open.add(p.getInitialState());
        while (!open.isEmpty()) {
            id = open.pollFirst();
            closed.add(id);
            estado = p.getState(id);
            System.out.println(">> Estado Atual = " + estado.get("representacao"));
            sucessores = (JSONArray) estado.get("sucessores");
            Iterator<String> iterator = sucessores.iterator();
            String stateId;
            while (iterator.hasNext()) {
                stateId = iterator.next();
                if (p.belongsToFinalStates(stateId)) {
                    System.out.println("#########################################");
                    System.out.println(">> Estado Final = " + p.getState(stateId).get("representacao"));
                    System.out.println("#########################################");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    return;
                }
                if (!closed.contains(stateId) && !open.contains(stateId)) {
                    open.addLast(stateId);
                }
            }
            System.out.println("open = " + open);
            System.out.println("closed = "+ closed);
        }
        if (open.isEmpty()) {
            System.out.println("Não há solução.");
        }
    }

    public static void main(String[] args) {
        Problem p = new Problem("torre_hanoi.json");
        System.out.println("Busca Largura");
        buscar(p);
    }
}
