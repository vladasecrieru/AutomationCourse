package topic6;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ContulPersoanei contul2020 = new ContulPersoanei();
        contul2020.setId(4538549);
        contul2020.setNumePersoana("Elvira Gutu");
        contul2020.setSumaCurenta(3000.25);

        System.out.println("Introduceti numarul de persoane: ");

        Scanner cititor = new Scanner(System.in);
        int numarDePersoane = cititor.nextInt();
        System.out.println("Soldul curent impartit la " + numarDePersoane + " persoane + " + contul2020.imparteSolsulLaNPersoane(numarDePersoane));

        contul2020.transferCatreOPersoanaAlCareiDateSuntIntrunFisierTratare("directoriuInixestent");

        contul2020.transferCatreOPersoanaAlCareiDateSuntIntrunFisierAruncare("ddd");
    }


}
