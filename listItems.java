public class listItems {
    private String name;
    private double value;
    private Integer qtd;

    public listItems(){

    }
    public listItems(String name, double value, Integer qtd){
        super();
        this.name = name;
        this.value = value;
        this.qtd = qtd;
    }

    public String getNome() {
        return name;
    }

    public double getValor() {
        return value;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        double timeValue = value * qtd;
        return name + " - R$" + value + " - Qtd: " + qtd + " - to be paid: R$" + timeValue;
    }

    public double valueQtd(){
        return value * qtd;
    }
}
