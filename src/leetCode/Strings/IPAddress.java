package leetCode.Strings;

public class IPAddress {
    public String defangIPaddr(String address) {
        address.replaceAll(".","[.]");


        return address;

    }
}
