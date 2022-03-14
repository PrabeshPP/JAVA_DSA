package DSA.Sorting;

public class InsertionSort {
    int[] insertionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=arr[i];
                }else{
                    break;
                }
            }
        }
        return  arr;
    }

}
