package buscacega;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class BuscaProfundidade {

    public static String buscar(Problem p) {
        //Declaração e inicialização da variaveis open, closed, id, estado e sucessores.
        String output = "Busca Profundidade \n";
        LinkedList<String> open, closed;
        open = new LinkedList();
        closed = new LinkedList();
        String id;
        JSONObject estado;
        JSONArray sucessores;
        //Adiciona a lista de abertos o estado inicial
        open.add(p.getInitialState());
        //Se a lista de abertos não for vazia
        while (!open.isEmpty()) {
            //Pega o id do primeiro elemento da lista
            id = open.pollFirst();
            //Adiciona o id do estado a lista de fechados
            closed.add(id);
            //Pega o estado
            estado = p.getState(id);
            output += ">> Estado Atual = " + estado.get("representacao") + "\n";
            //Pega os estados sucessores
            sucessores = (JSONArray) estado.get("sucessores");
            Iterator<String> iterator = sucessores.iterator();
            String stateId;
            //Para cada estado sucessor
            while (iterator.hasNext()) {
                stateId = iterator.next();
                //Verificamos se o estado pertence ao estados finais
                if (p.belongsToFinalStates(stateId)) {
                    output += "######################################### \n";
                    output += ">> Estado Final = " + p.getState(stateId).get("representacao") + "\n";
                    output +="######################################### \n";
                    return output;
                }
                //Verificamos se a lista de fechados e abertos tem o estado
                if (!closed.contains(stateId) && !open.contains(stateId)) {
                    //Adiciona o estado no inicio da lista de abertos
                    //Pilha
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
