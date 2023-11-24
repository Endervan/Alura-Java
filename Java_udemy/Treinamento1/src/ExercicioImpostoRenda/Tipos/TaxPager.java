package ExercicioImpostoRenda.Tipos;

public abstract class TaxPager {

    private String name;
    private Double anualIncome;

    public TaxPager() {
    }

    public TaxPager(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double tax();
}
