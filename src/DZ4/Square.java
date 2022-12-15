package DZ4;

public class Square implements Geometry {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getAria() {
        return a*a;
    }
}
