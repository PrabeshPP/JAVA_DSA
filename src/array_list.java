import java.util.ArrayList;

public class array_list {
    
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(39);

        number.set(0, 229);
        number.remove(2);
        number.clear();
        for(int i=0;i<number.size();++i){
            System.out.println(number.get(i));
        }
    }
}
