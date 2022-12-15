package DZ4;

public class Triangle implements Geometry {
    private final double a;
    private final double b;
    private final double c;

    public Triangle( double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getAria() {
        return (((a+b+c)/2.0)*((a+b+c)/2.0-a)*((a+b+c)/2.0-b)*((a+b+c)/2.0-c));
    }


}
