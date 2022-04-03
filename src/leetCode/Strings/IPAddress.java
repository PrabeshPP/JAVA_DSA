package leetCode.Strings;

public class IPAddress {
    public String defangIPaddr(String address) {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<address.length();i++){

            if(address.charAt(i)=='.'){
                stringBuilder.append("[.]");

            }else{
                stringBuilder.append(address.charAt(i));
            }
        }


        return stringBuilder.toString();
    }
}
