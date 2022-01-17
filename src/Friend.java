public class Friend {
    String name;
    public static int numberofFriends;
    Friend(String name){
        this.name=name;
        numberofFriends++;

    }

   public static void displayFriends(){
        System.out.println("You have "+numberofFriends+" friends.");
    }
    
}
