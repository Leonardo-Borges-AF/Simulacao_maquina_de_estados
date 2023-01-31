import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

//classe usada para ler arquivos
public class Leitor {

    private String maquina;
    private String estadoInicial;
    private String[] estadoFinal;
    private List<String[]> conditions = new ArrayList<String[]>();

    // getters
    public String geteMaquina() {
        return maquina;
    }

    public String getEstadoInicial() {
        return estadoInicial;
    }

    public String[] getEstadoFinal() {
        return estadoFinal;
    }

    public List<String[]> getConditions() {
        return conditions;
    }

    // setters

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public void setEstadoInicial(String estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public void setEstadoFinal(String[] estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public void setConditions(List<String[]> conditions) {
        this.conditions = conditions;
    }

    // functions

    // ler
    public void ler(String path) throws IOException {
        Path arquivo = Paths.get(path);

        System.out.println("Nã o existe");
    }

    List<String> linhas = Files.readAllLines(arquivo);

    // tipo da maquina
    setMaquina(linhas.get(0));

        // estado inicial
        setEstadoInicial(linhas.get(1));

        // estado final
        setEstadoFinal(linhas.get(2).split(","));


        List<String[]> aux = new ArrayList<String[]>();
        for(int i = 3; i <= linhas.size() -1; i++){
            aux.add(linhas.get(i).split(","));
        }

        setConditions(aux);
        
    }

    public void escreverArquivo(String path, List<String> message) throws IOException {
        Path arquivo = Paths.get(path);
        Files.write(arquivo, message);
    }
}
