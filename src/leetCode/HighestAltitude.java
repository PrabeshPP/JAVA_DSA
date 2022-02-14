package leetCode;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        arr[1]=1;
        int b=0;
        for(int i=2;i<=gain.length;i++){
            if(i!=gain.length){
                 b=gain[i]-gain[i-1];
            }

            arr[i]=b;
        }

        int highest=gain[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
        }

        return  highest;
    }
}
