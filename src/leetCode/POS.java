package leetCode;

public class POS {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n!=0){
            int one_value=n%10;
            sum+=one_value;
            product=one_value*product;
            n=n/10;



        }
        System.out.println(sum);
        System.out.println(product);

        return product-sum;

    }
}
