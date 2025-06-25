package angajati;

public class AngajatCuOra extends Angajat{

    private int nrOre;
    private double salarOra;
    private int oreSuplimentare = 0;

    public AngajatCuOra(String nume, int nrOre, double salarOra) {
        super(nume);
        this.nrOre = nrOre;
        this.salarOra = salarOra;
    }

    public void adaugaOre(int orePlus){
            this.oreSuplimentare += orePlus;
    }

    public void schimbaSalarPeOra(double nouSalarOra) {
        this.salarOra = nouSalarOra;
    }

    @Override
    public double calculSalar() {
        return (getNrOre() + getOreSuplimentare() ) * getSalarOra() ;
    }

    public int getNrOre() {
        return nrOre;
    }

    public int getOreSuplimentare() {
        return oreSuplimentare;
    }

    public double getSalarOra() {
        return salarOra;
    }
}
