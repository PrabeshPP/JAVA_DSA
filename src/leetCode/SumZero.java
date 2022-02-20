package leetCode;

public class SumZero {
    public int[] sumZero(int n) {
        int[] arr=new int[n];

        for(int i=1;i<=n/2;i++){
            if(i==1){
                arr[i-1]=i;
                arr[i]=-i;
            }else{
                arr[i]=i;
                arr[i+1]=-i;
            }
        }

        if(n%2!=0){
          arr[n-1]=0;
        }

        return arr;
    }
}
