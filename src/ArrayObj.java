public class ArrayObj {
    public static void main(String[] args) {
        Food food1=new Food("pizza");
        Food food2=new Food("hotdog");
        Food food3=new Food("Burger");
        Food[] fridge={food1,food2,food3};

        System.out.println(fridge[1].name);
        System.out.println(fridge[0].name);
        System.out.println(fridge[2].name);

        
    }
    
}
