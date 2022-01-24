package inheritance.hierarchial;

public class Audi extends  Car{
    //
    double weight;

    Audi(){
        super();
    }
    Audi(double weight,String wheels,String color,String name,int price,int rat){
        super(color,wheels,price,rat,name);
        this.weight=weight;


    }
}
