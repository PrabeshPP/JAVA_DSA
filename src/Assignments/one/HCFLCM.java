package Assignments.one;

public class HCFLCM {
    int findHCF(int num1,int num2){
        int temp1=num1;
        int temp2=num2;
        while(temp2!=0){
            int temp=temp2;
             temp2=temp1%temp2;
             temp1=temp;
        }

        return temp1;

    }

    int findLCM(int num1,int num2){
        int diff;
        if(num2>num1){
            diff=num2-num1;
        }else{
            diff=num1-num2;

        }

        return (num1*num2)/diff;
    }
}
