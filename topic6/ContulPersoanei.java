package topic6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ContulPersoanei {
    private String numePersoana;
    private int id;
    private double sumaCurenta;

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumaCurenta(double sumaCurenta) {
        if (sumaCurenta > 0)
            this.sumaCurenta = sumaCurenta;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public int getId() {
        return id;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public double sustragereDeBani(double sumaExtrasa) {
        if (sumaExtrasa > sumaCurenta) {
            return (sumaCurenta - sumaExtrasa);
        }
        return sumaExtrasa;
    }

    public int imparteSolsulLaNPersoane(int numarDePersoane) {
        int result = 0;
        try {
            result = (int) sumaCurenta / numarDePersoane;
        } catch (ArithmeticException exceptionObiect) {
            System.out.println("Ai introdus valoarea 0, respectiv returnam 0! ");
        }
        return result;
    }

    public void transferCatreOPersoanaAlCareiDateSuntIntrunFisierAruncare(String directoriulCuFisierulDat) throws FileNotFoundException {
        File datelePentruTransfer2020 = new File(directoriulCuFisierulDat);
        FileReader fileReader2020 = new FileReader(datelePentruTransfer2020);
    }

    public void transferCatreOPersoanaAlCareiDateSuntIntrunFisierTratare(String directoriulCuFisierulDat) {
        File datelePentruTransfer2020 = new File(directoriulCuFisierulDat);
        try {
            FileReader fileReader2020 = new FileReader(datelePentruTransfer2020);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }

    }
}

