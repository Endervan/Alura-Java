package TrabalhandoComArquivos.csv;

public class Product {
    private String name;
    private Double price;
    private Integer quant;

    public Product() {
    }

    public Product(String name, Double price, Integer quant) {
        this.name = name;
        this.price = price;
        this.quant = quant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    public double total(){
         return price * quant;
    }
}
