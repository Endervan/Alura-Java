package MetodosAbstract.Entites;

import MetodosAbstract.enums.Color;

public abstract class Sharpe {
    private Color color;

    public Sharpe() {
    }

    public Sharpe(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
