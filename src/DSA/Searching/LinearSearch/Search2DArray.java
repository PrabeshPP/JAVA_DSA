package DSA.Searching.LinearSearch;

public class Search2DArray {
    int[] search(int[][] arr,int target){
        int[] list=new int[2];
        int length1=arr.length;
        int length2=arr.length;
        for(int i=0;i<length1;++i){
            for( int j=0;j<length2;++j){
                if(arr[i][j]==target){
                    list[0]=i;
                    list[1]=j;
                }else{
                    list[0]=-1;
                    list[1]=-1;
                }
            }
        }

    return  list;
    }
}
