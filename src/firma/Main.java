package firma;

import angajati.AngajatCuOra;
import angajati.AngajatCuSalarFix;

public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma();

        AngajatCuSalarFix a1 = new AngajatCuSalarFix("Popescu Ion", 4000);
        AngajatCuSalarFix a2 = new AngajatCuSalarFix("Ionescu Maria", 5000);

        AngajatCuOra a3 = new AngajatCuOra("Georgescu Mihai", 160, 25);
        AngajatCuOra a4 = new AngajatCuOra("Dumitrescu Ana", 150, 30);

        a3.adaugaOre(10); // 160 + 10 = 170 ore

        System.out.println("Angajare a1: " + firma.angajeaza(a1));
        System.out.println("Angajare a2: " + firma.angajeaza(a2));
        System.out.println("Angajare a3: " + firma.angajeaza(a3));
        System.out.println("Angajare a4: " + firma.angajeaza(a4) + "\n");

        System.out.println("Salariu mediu : " + firma.salariuMediu() + "\n");

        System.out.println("Reangajare a1: " + firma.angajeaza(a1) + "\n");

        a1.schimbaSalarFix(6000);
        a4.schimbaSalarPeOra(35);

        System.out.println("Salariu mediu (dupa modificari): " + firma.salariuMediu());
    }
}