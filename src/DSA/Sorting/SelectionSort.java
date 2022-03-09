package DSA.Sorting;

/* This algorithm is only suitable for the small list
,since using this algorithm in large list would require large computational power

*/
public class SelectionSort {
    int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the maximum number with the index and swap it
            int lastIndex=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,lastIndex);
            int temp=arr[maxIndex];
             arr[maxIndex]=arr[lastIndex];
             arr[lastIndex]=temp;

        }

        return arr;
    }

    int getMaxIndex(int[] arr,int lastIndex){
        int maxIndex=0;
        for(int i=0;i<=lastIndex;i++){
            if(arr[maxIndex]<arr[i]){
                maxIndex=i;
            }
        }
        return  maxIndex;
    }


}
