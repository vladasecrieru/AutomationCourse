package topic5;

public class Cerc extends FiguraGeometrica{

    private final double pi = 3.14;
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double getPi() {
        return pi;
    }

    public double getRaza() {
        return raza;
    }

    @java.lang.Override
    double returneazaAria() {
        if (raza < 0) {
            return  0;
        }
        return pi * (raza * raza);
    }

    @java.lang.Override
    double returneazaPerimetru() {
        if (raza < 0) {
            return 0;
        }
        return 2 * pi * raza;
    }
}
