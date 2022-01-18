package staticExample;

public class Main {
    public static void main(String[] args) {
        Human prabesh=new Human(20, "Prabesh Bista", 10000, false);
        Human carlo=new Human(41, "carlo", 30000,true);
        System.out.println(prabesh.name);
        System.out.println(carlo.name);
    }
    
}
