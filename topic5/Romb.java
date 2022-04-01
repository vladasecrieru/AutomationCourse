package topic5;

public class Romb extends FiguraGeometrica{

    private double inaltimea;
    private double lungimeaBazei;

    public Romb(double inaltimea, double lungimeaBazei) {
        this.inaltimea = inaltimea;
        this.lungimeaBazei = lungimeaBazei;
    }

    public double getInaltimea() {
        return inaltimea;
    }

    public double getLungimeaBazei() {
        return lungimeaBazei;
    }

    public void setInaltimea(double inaltimea) {
        this.inaltimea = inaltimea;
    }

    public void setLungimeaBazei(double lungimeaBazei) {
        this.lungimeaBazei = lungimeaBazei;
    }

    @Override
    double returneazaAria() {
        if (inaltimea < 0 || lungimeaBazei < 0) {
            return 0;
        }
        return inaltimea * lungimeaBazei;
    }

    @Override
    double returneazaPerimetru() {
        if (lungimeaBazei < 0) {
            return 0;
        }
        return lungimeaBazei * 4;
    }
}
