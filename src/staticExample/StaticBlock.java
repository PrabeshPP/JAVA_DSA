package staticExample;

// outside class cannot be static
public class StaticBlock {
    static  int a=4;
    static  int b;
// initialisation of the static block
    static{
        System.out.println("I am in static block.");
        b=a*5;
    }

    public static void main(String[] args){
        System.out.println(StaticBlock.a +" "+StaticBlock.b);
    }


}
