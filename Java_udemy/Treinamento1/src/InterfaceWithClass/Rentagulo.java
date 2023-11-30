package InterfaceWithClass;

public class Rentagulo extends ShapeClassAbstract {


private Double altura;
private Double base;

    public Rentagulo(ColorEnum color, Double altura, Double base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return base * altura;
    }
}
