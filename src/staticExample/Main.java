package staticExample;

public class Main {
    public static void main(String[] args) {
         Human prabesh=new Human(20, "Prabesh Bista", 10000,false);
         Human carlo=new Human(41, "carlo", 30000,true);
         System.out.println(prabesh.name);
         System.out.println(carlo.name);
         System.out.println(Human.population);

         //static method can be called without any reference
        //Whereas non-static method should be call using the instance of the function();
         prabesh.greetings();
    }
    
}
