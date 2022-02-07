package DSA.Searching.BinarySearch;

public class Mountain {

    int findMinIndex(int[] arr,int target){
        int[] list=new int[2];
        int peakIndex=findPeakIndex(arr);
        int index1=binarySearch(arr,3,0,peakIndex,true);
        int index2=binarySearch(arr,3,peakIndex+1, arr.length,false );

        if(index1<index2){
            return  index1;
        }else{
            return  index2;
        }


    }

    int findPeakIndex(int[]arr){
        int start=0;
        int end=arr.length-1;
        //[0,1,3,5,2,3,1]
        while(start<end){
            int  mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }

        return start;
    }


    int binarySearch(int[] arr,int target,int start,int end,boolean isAscending){


        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAscending){
             if(arr[mid]<target){
                    start=mid+1;

                }else{
                    end=mid-1;
                }

            }else{
                if(arr[mid]<target){
                    end=mid-1;

                }else{
                  start=mid+1;
                }


            }


        }
        return  -1;

    }
}
