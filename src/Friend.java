public class Friend {
    String name;
    //Implementing a static variable
     static int numberofFriends;
    Friend(String name){
        this.name=name;
        numberofFriends++;

    }

    //Implementing a static method
    static void displayFriends(){
        System.out.println("You have "+numberofFriends+" friends.");
    }
    
}
