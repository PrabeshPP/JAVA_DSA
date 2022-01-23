package inheritance;

public class BaseClass {
    int number;
    String name;
    int age;
    BaseClass(){
        this.number=-1;
        this.name=null;
        this.age=-1;
    }
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



