package inheritance;

public class BaseClass {
    int number;
    String name;
    int age;
    BaseClass(int marks,String name,int age){
        this.number=marks;
        this.name=name;
        this.age=age;
    }

    void prinT(){
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("You have obtained "+number+"in math!");
    }
}

public  class ChildClass implements BaseClass{
    @Override
    void prinT() {
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("You have obtained "+number+"in math!");
    }
}
