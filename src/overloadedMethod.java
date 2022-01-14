public class overloadedMethod {
    public static void main(String[] args) {
        int sum=add(1, 2);
        System.out.println(sum);
        sum=add(10, 20, 30);
        System.out.println(sum);
        sum=add(10, 20, 30, 40);
        System.out.println(sum);


    }

    static int add(int x,int y){
        System.out.println("This is overloaded method #1");
        return x+y;
    }

    static int add(int x,int y,int z){
        System.out.println("This is Overloaded method #2");
        return x+y+z;
    }
    static int add(int x,int y ,int z ,int a){
        System.out.println("This is Overloaded method #3");
        return x+y+z+a;

    }

    
}
