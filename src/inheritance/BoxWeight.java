package inheritance;



public class BoxWeight extends Box {
    double weight;

    BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(int length,int breadth,int width,double weight){
        super(length,breadth,width); // calling the constructor of the parent class
        this.weight=weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight= other.weight;
    }



}
