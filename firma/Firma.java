package firma;

import angajati.Angajat;

import java.util.HashSet;
import java.util.Set;

public class Firma {
    private Set<Angajat> angajati = new HashSet<>();

    public boolean angajeaza(Angajat angajat) {
        return angajati.add(angajat);
    }

    public double salariuMediu() {
        if (!angajati.isEmpty()) {
            double total = 0;
            for (Angajat a : angajati) {
                total += a.calculSalar();
            }
            return total / angajati.size();
        }
        else {
            return 0;
        }
    }
}
