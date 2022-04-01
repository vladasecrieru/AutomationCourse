package topic5;

public class Patrat extends FiguraGeometrica {

    private double lungimeLatura;

    public Patrat(double lungimeLatura) {
        this.lungimeLatura = lungimeLatura;
    }

    public double getLungimeLatura() {
        return lungimeLatura;
    }

    public void setLungimeLatura(double lungimeLatura) {
        this.lungimeLatura = lungimeLatura;
    }

    @Override
    double returneazaAria() {
        if (lungimeLatura < 0) {
            return 0;
        }
        return lungimeLatura * lungimeLatura;
    }

    @Override
    double returneazaPerimetru() {
        if (lungimeLatura < 0) {
            return 0;
        }
        return lungimeLatura * 4;
    }
}
