public class nonP {
    public static void main(String[] args){
        //Strings are immutable

        //Non -Primitive types
        String name="Prabesh";
        // returns the length of the String
        System.out.println(name.length());
        //concat() method joins another string to the existing string
        System.out.println(name.concat(" Bista"));
        //CharAt() returns the character at the given index
        System.out.println(name.charAt(2));
        // replace() method replace the given char
        System.out.println(name.replace("P", "S"));
        //Substring returns the string from certain index to certain index
        System.out.println(name.substring(0, 3));


        //Arrays

        int[] arr=new int[12];
        arr[0]=1000;
        arr[1]=2000;
        arr[2]=3000;
        System.out.println(arr[10]);
        System.out.println(arr.length);
        






    }
}
