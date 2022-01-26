package inheritance.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes=new Shapes();
        Shapes square=new Square();
        Shapes circle=new Circle();
       Shapes triangle=new Triangle();
       triangle.area();

    }
}
