package inheritance.hierarchial;

public class BMW extends Car{
    //

    BMW(){
        super();
    }

    double weight;
    BMW(double weight,String wheels,String color,String name,int price,int rat){
        super(color,wheels,price,rat,name);
        this.weight=weight;

    }
}
