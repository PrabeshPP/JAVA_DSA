package inheritance.singleinheritance;



class One{
    public void greet(){
        System.out.println("Hi From class one");
    }
}

//class two is inheriting class one only,so it's the case of single inheritance
class Two extends  One{
    public void greet2(){
        System.out.println("HI from class Two");
    }

}


public class Main {
    public static void main(String[] args) {
        Two two=new Two();
        two.greet();
        two.greet2();

    }
}
