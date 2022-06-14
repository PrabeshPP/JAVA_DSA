package inheritance.multiple_inheritance;
/*
* Note in Java,We can not achieve multiple inheritance through classes.
*Rather,it can be achieved with the help of interfaces
* */


interface One{
    public void printOne();
}

interface Two{
    public void printTwo();
}


interface Three extends  One,Two{
    public void printThree();
}

class Child implements Three {


    @Override
    public void printOne() {
        System.out.println("Hi from interface one");
    }

    @Override
    public void printTwo() {
        System.out.println("Hi from Interface two");
    }

    @Override
    public void printThree() {
        System.out.println("Hi from Interface Three");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child1=new Child();
        child1.printOne();
        child1.printTwo();
        child1.printThree();
    }

}
