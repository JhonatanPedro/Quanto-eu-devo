import javafx.scene.control.TextField;

public class getersSeters {
    private String name;
    private double value;
    private int qtd;

    private String nameT;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getValue(){
        return value;
    }
    public void setValue(double num){
        this.value = num;
    }

    public int getQtd(){return qtd;}
    public void setQtd(int qtd){this.qtd = qtd;}

    public String getNameT(){return nameT;}
    public void setNameT(String nameT){this.nameT = nameT;}
}
