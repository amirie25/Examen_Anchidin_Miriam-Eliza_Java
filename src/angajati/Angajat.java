package angajati;

public abstract class Angajat {

    private String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    public abstract double calculSalar();

    public String getNume() {
        return nume;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Angajat) {
            Angajat altul = (Angajat) obj;
            return this.nume.equalsIgnoreCase(altul.nume);
        }
        else {
            return false;
        }
    }
}
