package MetodosAbstract.Entites;


import MetodosAbstract.enums.Color;

public class Circle extends Sharpe {

    private Double radius;


    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
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
