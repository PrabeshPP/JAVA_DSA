package leetCode;

public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        int[] ans=new int[len];
        int in=0;
        for(int i=0;i<n;++i){
            int num1=nums[i];
            int num2=nums[i+n];
            int val1=i+in;
            int val2=i+1+in;

//            System.out.println("val :"+val1);

            for(int j=val1;j<=val2;++j){


                if(j%2==0){
                    ans[j]=num1;
                }else{
                    ans[j]=num2;
                }




            }
            in+=1;
//            System.out.println(in);
        }
        return ans;
    }
}
