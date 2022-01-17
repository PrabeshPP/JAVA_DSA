public class obj {
    public static void main(String[] args) {
        Student prabesh;

        // prabesh is a reference to an object
        prabesh=new Student(12,"Prabesh Bista",97.1f);
        
        System.out.println(prabesh);
        
    }
    
}

class Student{
    int rno;
    String name;
    float marks;

    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;

    }
public String toString(){
        String p="Student name is "+name+"roll no. is " +rno+"and he has obtained "+marks+"in physics.";
       return p;
}
}
