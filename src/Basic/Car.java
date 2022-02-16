package Basic;

public class Car {
    // Blue-Print of the Car

   final String make;
   final String model;
   final int year;
   final String color;
   final double price;

   public Car(String make,String model,int year,String color,double price){
       this.make=make;
       this.model=model;
       this.year=year;
       this.color=color;
       this.price=price;
   }

   void model(){
       System.out.println(this.model+" is the model of the "+this.make);
   }
 

    void drive(){
        System.out.println("You drive the car!");
    }

    void brake(){
        System.out.println("You pressed the brake of the car!");
    }
}
