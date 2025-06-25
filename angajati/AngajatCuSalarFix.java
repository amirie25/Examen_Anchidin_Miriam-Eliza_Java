package angajati;

public class AngajatCuSalarFix extends Angajat{

    private double salarFix;

    public AngajatCuSalarFix(String nume, double salarFix) {
        super(nume);
        this.salarFix = salarFix;
    }

    public void schimbaSalarFix(double nouSalarFix) {
        this.salarFix = nouSalarFix;
    }

    @Override
    public double calculSalar() {
        return salarFix;
    }

    public double getSalarFix() {
        return salarFix;
    }
}
