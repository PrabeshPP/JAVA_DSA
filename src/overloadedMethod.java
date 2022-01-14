public class overloadedMethod {
    public static void main(String[] args) {
        
    }

    static int add(int x,int y){
        System.out.println("This is overloaded method #1");
        return x+y;
    }

    static int add(int x,int y,int z){
        return x+y+z;
    }
    static int add(int x,int y ,int z ,int a){
        return x+y+z+a;

    }

    
}
