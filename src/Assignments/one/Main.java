package Assignments.one;

public class Main {
    public static void main(String[] args) {
        HCFLCM hcflcm=new HCFLCM();
        int value=hcflcm.findHCF(20,40);
        int lcmValue=hcflcm.findLCM(20,40);

        System.out.println(value);
        System.out.println(lcmValue);
    }


}
