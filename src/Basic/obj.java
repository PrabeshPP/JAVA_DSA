package Basic;

public class obj {
    public static void main(String[] args) {
        Student prabesh;
        Student carlo;

        // prabesh is a reference to an object
        prabesh=new Student(12,"Prabesh Bista",97.1f);
        carlo=new Student(20, "Rocky", 99.99f);
        /* Since we are using toString() method in our class,
        we can print all the properties of our class by calling reference variable of our obj */
        System.out.println(prabesh);
        System.out.println(carlo);

        Student rocky=new Student();
        System.out.println(rocky.name);
        
    }
    
}

class Student{
    int rno;
    String name;
    float marks;

    //Constructor of the class
    Student(int rno,String name,float marks){
        // this is represents point to the reference objects of our classs
        this.rno=rno;
        this.name=name;
        this.marks=marks;

    }

    Student(){
        // call the constructor
        this(13, "default person", 89.99f);
    }
    // overiding the toString() method 
    public String toString(){
        String p="Student name is "+name+"roll no. is " +rno+"and he has obtained "+marks+"in physics.";
       return p;
}
}

