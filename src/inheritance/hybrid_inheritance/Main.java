package inheritance.hybrid_inheritance;

/*
* Hybrid Inheritance means mix of all types of inheritance
* For now ,I will be using single level inheritance and hierarchical inheritance
* to demonstrate hybrid inheritance
*/

class One{
    public void greet1(){
        System.out.println("Hi From Class One");
    }
}

class Two extends One{
    public void greet2(){
        System.out.println("Hi From Class Two");
    }
}

class  Three extends  One{
    public void greet3(){
        System.out.println("Hi From Class Three");
    }
}

class Four extends  Two{

    public void greet4(){
        //accessing the GrandParent's element
        super.greet1();
        super.greet2();
        System.out.println("Hi From Class Four");
    }

}



public class Main {
    public static void main(String[] args) {
        Four four=new Four();
        four.greet4();
    }

}
