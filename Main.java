import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String specsPath = args[0];
        String inputPath = args[1];
        String outputPath = args[2];
        Leitor l = new Leitor();
        l.lerArquivo(specsPath);
        switch (l.getMaquina()) {
            case "F": {
                AFD machine = new AFD(l.getEstadoInicial(), l.getEstadoFinal(), l.getConditions(), inputPath);
                machine.verificarCondicao(outputPath, inputPath);
                break;
            }
            case "P": {
                Pilha machine = new Pilha(l.getEstadoInicial(), l.getEstadoFinal(), l.getConditions(), inputPath);
                machine.verificarCondicao(outputPath, inputPath);
                break;
            }
            case "T": {
                Turing machine = new Turing(l.getEstadoInicial(), l.getEstadoFinal(), l.getConditions(), inputPath);
                machine.verificarCondicao(outputPath);
                break;
            }
            default: {
                System.out.println("maquina inexistente");
                break;
            }
        }
    }
}