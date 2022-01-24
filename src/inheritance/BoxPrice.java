package inheritance;

public class BoxPrice extends  BoxWeight{
    double price;
    BoxPrice(){
        super();
        price=-1;

    }
    BoxPrice(BoxPrice other){
        super(other);
        price=other.price;
    }
}
