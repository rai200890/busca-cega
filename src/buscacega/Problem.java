package buscacega;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Problem {

    private String filename;
    private JSONObject problem;

    //Inicializa as variaveis filename e problem da classe.
    public Problem(String filename) {
        this.filename = filename;
        this.problem = parseProblem(filename);
    }

    public JSONObject getProblem() {
        return this.problem;
    }
    
     public String getNome() {
        return (String) this.problem.get("nome");
    }
    
    public String getInitialState() {
       return (String) this.problem.get("estado_inicial");
    }
    
    public JSONArray getFinalStates() {
       return (JSONArray) this.problem.get("estados_finais");
    }
    
    public JSONArray getStates() {
        return (JSONArray) this.problem.get("estados");
    }

    public JSONObject getState(String id) {
        Iterator<JSONObject> iterator = getStates().iterator();
        JSONObject state;
        while (iterator.hasNext()) {
            state = iterator.next();
            if (state.get("id").equals(id)) return state;
        }
        return null;
    }
    
    public boolean belongsToFinalStates(String stateId) {
        Iterator<String> iterator = getFinalStates().iterator();
        String state;
        while (iterator.hasNext()) {
            state = iterator.next();
            if (state.equals(stateId)) return true;
        }
        return false;
    }
    
    //Leitura do arquivo JSON do problema
    private JSONObject parseProblem(String filename) {
        JSONObject problem = null;
        JSONParser parser = new JSONParser();
        try {
            String path = new File("").getAbsolutePath();
            path += "/problems/";
            Object obj = parser.parse(new FileReader(path + filename));
            problem = (JSONObject) obj;
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não existe!");
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo!");
        } catch (ParseException e) {
            System.out.println("O arquivo está em um formato inválido!");
        }
        return problem;
    }

}
