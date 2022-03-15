package topic2;

public class Main {
    public static void main(String[] args) {
        Persoana marinel = new Persoana();

        marinel.greutate = 70.2;
        marinel.gen = "Masculin";
        marinel.varsta = 17;

        marinel.setNume("Babii");
        System.out.println("Nume: " + marinel.getNume());

        marinel.setPrenume("Marinel");
        System.out.println("Prenume: " + marinel.getPrenume());
    }
}
