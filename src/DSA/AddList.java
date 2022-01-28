package DSA;

public class AddList {

    int[] add(int[]nums,int target){
        int[] list=new int[2];
        int n=0;
        while(n<nums.length){
            for(int i=0;i<nums.length;++i){
                if(n==i && i!=nums.length-1){
                    int x1=nums[n];
                    int y1=nums[i+1];
                    if(x1+y1==target){
                        list[0]=x1;
                        list[1]=y1;
                    }
                }else if(n==i){
                    int x1=nums[n];
                    int y1=nums[i];
                    if(x1+y1==target){
                        list[0]=x1;
                        list[1]=y1;
                    }

                }else{
                    int x1=nums[n];
                    int y1=nums[i];
                    if(x1+y1==target){
                        list[0]=x1;
                        list[1]=y1;
                    }

                }
            }
            ++n;

        }


        return  list;
    }
}
