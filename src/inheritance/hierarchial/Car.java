package inheritance.hierarchial;

public class Car {
    //
    String name;
    String color;
    String wheels;
    int price;
    int safety_rating;

    Car(){
        this.color=null;
        this.wheels=null;
        this.price=-1;
        this.safety_rating=-1;
        this.name=null;
    }
    Car(String Color,String wheels,int price,int rating,String name){
        this.color=Color;
        this.wheels=wheels;
        this.price=price;
        this.safety_rating=rating;
        this.name=name;
    }

}
