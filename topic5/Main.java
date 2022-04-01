package topic5;

public class Main {
    public static void main(String[] args) {
        Patrat patrat = new Patrat(10);
        System.out.println("Patrat aria: " + patrat.returneazaAria());
        System.out.println("Patrat perimetru: " + patrat.returneazaPerimetru());

        Cerc cerc = new Cerc(5);
        System.out.println("Aria cercului este: " + cerc.returneazaAria());
        System.out.println("Aria cercului este: " + cerc.returneazaPerimetru());

        Romb romb = new Romb(5, 3);
        System.out.println("Aria rombului este: " + romb.returneazaAria());
        System.out.println("Aria rombului este: " + romb.returneazaPerimetru());
    }
}
