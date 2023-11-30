package InterfaceWithClass;

public abstract class ShapeClassAbstract implements ShapeInterface {
    private ColorEnum color;

    public ShapeClassAbstract(ColorEnum color) {
        this.color = color;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }
}
