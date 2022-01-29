package DSA;

public class MiniNum {
    int FindMin(int[] list){
        int minNum=list[0];
        int n=1;
        while(n<list.length){
            if(minNum>list[n]){
                minNum=list[n];
            }
            ++n;

        }
        return  minNum;
    }
}
