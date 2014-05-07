package buscacega;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author raissa
 */
public class BuscaProfundidade {

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
                    System.out.println(">> Estado Final = " + p.getState(stateId).get("representacao"));
                    return;
                }
                if (!closed.contains(stateId) && !open.contains(stateId)) {
                    open.addFirst(stateId);
                }
            }
            System.out.println(">> Lista Open:");
            System.out.println(open);
            System.out.println(">> Lista Closed:");
            System.out.println(closed);
        }
        if (open.isEmpty()) {
            System.out.println("Não há solução.");
        }
    }

    public static void main(String[] args) {
        Problem p = new Problem("torre_hanoi.json");
        System.out.println("Busca Profundidade");
        buscar(p);
    }
}
