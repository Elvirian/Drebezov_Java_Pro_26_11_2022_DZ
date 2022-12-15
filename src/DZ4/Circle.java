package DZ4;

public class Circle implements Geometry {
    private final double a;

    public Circle(double a) {
        this.a = a;
    }


    @Override
    public double getAria() {
        return Math.PI * (a * a);
    }
}
