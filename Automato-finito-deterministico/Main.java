import java.util.Scanner;

public class Main {

    int count;
    char fita[];

    public static void main(String args[]) {

        String palavra;
        Scanner ENTRADA = new Scanner(System.in);
        System.out.println("coloque os valores");
        palavra = ENTRADA.nextLine();

        Turing maquina = new Turing();
        maquina.iniciar();

        Main AUTOMATO = new Main();
        AUTOMATO.fita = palavra.toCharArray();
        AUTOMATO.iniciar();
    }

    public void iniciar() {
        count = 0;
        q0();
    }

    public void q0() {
        if (count < fita.length) {
            if (fita[count] == 'a') {
                count++;
                q1();
            } else if (fita[count] == 'c') {
                qf();
            } else {
                qerror();
            }
        } else {
            qerror();
        }
    }

    public void q1() {
        if (count < fita.length) {
            if (fita[count] == 'b') {
                count++;
                q2();
            } else {
                qerror();
            }
        } else {
            qerror();
        }
    }

    public void q2() {
        if (count < fita.length) {
            if (fita[count] == 'b') {
                count++;
                q0();
            } else {
                qerror();
            }
        } else {
            qerror();
        }
    }

    public void qf() {
        System.out.println("fita aceita pelo automato");
    }

    public void qerror() {
        System.out.println("fita rejeitada pelo automato");

    }
}