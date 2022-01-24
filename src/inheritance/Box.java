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
        super();
        this.number=marks;
        this.name=name;
        this.age=age;
    }

    BaseClass(BaseClass baseClass){
        this.number=baseClass.number;
        this.age=baseClass.age;
        this.name= baseClass.name;
    }

    void prinT(){
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("You have obtained "+number+"in math!");
    }
}



