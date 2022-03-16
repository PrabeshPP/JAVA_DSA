package DSA.Sorting;


//Cyclic Sort Algorithm
public class CyclicSort {
    int[] cyclicSort(int[] nums){
        int i=0;
        while(i<nums.length){
            if(i+1!=nums[i]){
                int temp=nums[i];
                 nums[i]=nums[temp-1];
                 nums[temp-1]=temp;

            }else{
                i++;
            }
        }

        return nums;
    }


}
