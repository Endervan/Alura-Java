package InterfaceWithClass;

public class Circle extends ShapeClassAbstract {

    private Double radius;

    public Circle(ColorEnum color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius;
    }
}
