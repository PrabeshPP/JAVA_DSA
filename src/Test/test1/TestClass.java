package Test.test1;

class Box{
    int length;
    int breadth;
    int height;

    Box(int l,int b ,int h){
        this.length=l;
        this.breadth=b;
        this.height=h;

    }

    //methods
    public int volume(){
        return length*height*breadth;
    }

    public int sum(){
        return length+height+breadth;
    }


}



public class TestClass {
    public static void main(String[] args) {
        Box box=new Box(10,20,30);
        int vol=box.volume();
        System.out.println(vol);
    }
}
