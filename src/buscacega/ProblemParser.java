
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProblemParser {

    private String filename;
    private JSONObject problem;

    public ProblemParser(String filename) {
        this.filename = filename;
        this.problem = parseProblem(filename);
    }

    public JSONObject getProblem() {
        return this.problem;
    }

    public JSONArray getStates() {
        return (JSONArray) this.problem.get("estados");
    }

    public JSONObject getState(Object id) {
        Iterator<JSONObject> iterator = getStates().iterator();
        JSONObject state;
        while (iterator.hasNext()) {
            state = iterator.next();
            if (state.get("id").equals(id)) return state;
        }
        return null;
    }

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

    public static void main(String[] args) {
        ProblemParser parser = new ProblemParser("missionarios_canibais.json");
        JSONObject problem = parser.getProblem();
        System.out.println(problem);
        System.out.println(parser.getState("1"));
    }

}
