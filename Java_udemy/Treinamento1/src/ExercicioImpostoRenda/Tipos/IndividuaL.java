package ExercicioImpostoRenda.Tipos;

public class IndividuaL extends TaxPager {
    private Double healthExpendures;

    public IndividuaL(String name, Double anualIncome, Double healthExpendures) {
        super(name, anualIncome);
        this.healthExpendures = healthExpendures;
    }

    public Double getHealthExpendures() {
        return healthExpendures;
    }

    public void setHealthExpendures(Double healthExpendures) {
        this.healthExpendures = healthExpendures;
    }

    @Override
    public double tax() {
        double basicTax = getAnualIncome() < 20000.0 ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
        basicTax -= getHealthExpendures() * 0.5;
        if (basicTax < 0.0) basicTax = 0.0;
        return basicTax;
    }
}
