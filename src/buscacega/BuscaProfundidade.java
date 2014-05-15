package buscacega;

import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JTextArea;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author raissa
 */
public class BuscaProfundidade {

    public static String buscar(Problem p) {
        String output = "Busca Profundidade \n";
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
            output += ">> Estado Atual = " + estado.get("representacao") + "\n";
            sucessores = (JSONArray) estado.get("sucessores");
            Iterator<String> iterator = sucessores.iterator();
            String stateId;
            while (iterator.hasNext()) {
                stateId = iterator.next();
                if (p.belongsToFinalStates(stateId)) {
                    output += "######################################### \n";
                    output += ">> Estado Final = " + p.getState(stateId).get("representacao") + "\n";
                    output +="######################################### \n";
                    return output;
                }
                if (!closed.contains(stateId) && !open.contains(stateId)) {
                    open.addFirst(stateId);
                }
            }
            output += ">> Lista Open:"+ "\n";
            output += open.toString() + "\n";
            output += ">> Lista Closed: \n";
            output += closed.toString() + "\n";
        }
        if (open.isEmpty()) {
            output += "Não há solução.";
        }
        return output;
    }
}
