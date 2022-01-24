package inheritance.hierarchial;

public class Main {
    public static void main(String[] args) {
        // hierarchical inheritance
        // BMW inheriting the Car Class;
        BMW bmw=new BMW(120.68,"4","red","BMW A-Series",200000,4);
        // Audi class inheriting the Car Class;
        Audi audi=new Audi(200.99,"10","black","B-=Series",450000,6);

        System.out.println(audi.price);
        System.out.println(bmw.price);



    }
}
