import java.util.ArrayList;

public class array_list {
    
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(39);
        // set() method sets the value at index 0 "229"
        number.set(0, 229);
        // remove() methods remove the element from the given index
        number.remove(2);
        // It removes all the elements from the list
        number.clear();
        for(int i=0;i<number.size();++i){
            System.out.println(number.get(i));
        }
    }
}
