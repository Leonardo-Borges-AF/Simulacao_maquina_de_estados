public class Turing extends Main {

    public void inciar(String SENTENCA) {
        count = 0;
        fita = SENTENCA.toCharArray();
        q0();
    }

    public void q0() {
        if (count < fita.length) {
            if (fita[count] == 'T') {
                fita[count] = 'T';
                count++;
                qf();
            } 
            else if (fita[count] == 'B') {
                fita[count] = 'T';
                count++;
                q3();
            } 
            else if (fita[count] == 'a') {
                fita[count] = 'A';
                count++;
                q1();
            } 
            else {
                qerror();
            }
        } 
        else {
            qerror();
        }
    }

    public void q1() {
        if (count < fita.length) {
            if (fita[count] == 'a') {
                fita[count] = 'a';
                count++;
                q1();
            } 
            else if (fita[count] == 'B') {
                fita[count] = 'B';
                count++;
                q1();
            } 
            else if (fita[count] == 'b') {
                fita[count] = 'B';
                count--;
                q2();
            } 
            else {
                qerror();
            }
        } 
        else {
            qerror();
        }
    }

    public void q2() {
        if (count < fita.length) {
            if (fita[count] == 'a') {
                fita[count] = 'a';
                count--;
                q2();
            } 
            else if (fita[count] == 'B') {
                fita[count] = 'B';
                count--;
                q2();
            } 
            else if (fita[count] == 'A') {
                fita[count] = 'A';
                count++;
                q0();
            } 
            else {
                qerror();
            }
        } 
        else {
            qerror();
        }
    }

    public void q3() {
        if (count < fita.length) {
            if (fita[count] == 'B') {
                fita[count] = 'B';
                count++;
                q3();
            }
            else if (fita[count] == 'T') {
                fita[count] = 'A';
                count++;
                q1();
            } 
            else {
                qerror();
            }
        } 
        else {
            qerror();
        }
    }
}
