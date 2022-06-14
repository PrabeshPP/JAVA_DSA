package inheritance.mulitlevel_inheritance;


/*
* In Java,Multilevel inheritance means base class acting as super class
* for another base class.
*Note:In Java we cannot access GrandParents member directly.
*Whereas in c++,members of grandparent's can be accessed with the scope(::)
*In Java,we can only access the grandparent's members only through the Parent's class
*  */
class One{
  public  void print1(){
        System.out.println("Hi! From Class One.");
    }
}


class Two extends  One{
   public void print2(){
       super.print1();
        System.out.println("Hi!From Class Two");
    }
}

class  Three extends Two{
    public void print3(){
        super.print2();
        System.out.println("Hi!From class Three");
    }


}
public class Main {
    public static void main(String[] args) {
        Three three=new Three();
        three.print3();



    }



}
