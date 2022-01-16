public class Main {
    public static void main(String[] args) {
            // Object = an instance of a class that may contain attributes and methods
            // example: (phone,desk,computer,coffee,cup)

        // Creating Instance of the car
        Car myCar=new Car("ford","mustang",2020,"red",50000);
        Car myCar1=new Car("ferrari","2020",2021,"red",100000);
        System.out.println(myCar.model);
        System.out.println(myCar1.model);
        myCar.model();
        myCar1.model();


    }
    
}


