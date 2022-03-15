package topic1;

public class Angajat {
    String nume;
    int varsta;
    double salariu;
    String gen;

    public Angajat(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    void seteazaSalariul(double salary){
        this.salariu = salary;

        System.out.println("Salariul angajatului " + nume + " este: " + salariu);
    }

    void seteazaGen(String g){
        this.gen = g;

        System.out.println("Genul angajatului " + nume + " este: " + gen);
    }
}
