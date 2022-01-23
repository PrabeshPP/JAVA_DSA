package inheritance;



public class BoxWeight extends BaseClass {

    double weight;
    BoxWeight(){

        this.weight=-1;

    }

    BoxWeight(int number,String name,int age,double weight){
        super(number,name,age); // calling the constructor of the parent class
        this.weight=weight;
    }

}
