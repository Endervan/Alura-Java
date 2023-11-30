package InterfaceWithClass;

public class Program {
    public static void main(String[] args) {

        ShapeClassAbstract s1 = new Circle(ColorEnum.BLUE, 111.0);
        ShapeClassAbstract s2 = new Rentagulo(ColorEnum.RED, 200.0, 233.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle Area: " + String.format("%.2f", s1.area()));

        System.out.println("Retangulo color: " + s2.getColor());
        System.out.println("Retangulo Area: " + String.format("%.2f", s2.area()));

    }
}
