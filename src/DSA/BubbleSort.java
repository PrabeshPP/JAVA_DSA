package DSA;

public class BubbleSort {

    int[]  bubblesort(int[] list){
        for(int i=0;i< list.length-1;++i){
            for(int j=0;j< list.length-1;++j){
                int temp;
                if(list[j]>list[j+1]){
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        return list;
    }

}
