package topic1;

public class TestAngajat {
    public static void main(String[] args) {
        Angajat angajat1 = new Angajat("Alex", 42);
        Angajat angajat2 = new Angajat("Victoria", 25);

        angajat1.seteazaGen("Masculin");
        angajat2.seteazaGen("Feminin");

        angajat1.seteazaSalariul(21000);
        angajat2.seteazaSalariul(15000);
    }
}
