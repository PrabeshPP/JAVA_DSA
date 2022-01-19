package staticExample;

public class Human {
    static int population=7;
    int age;
    String name;
    int salary;
    boolean married;
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
    }

    void greetings(){
        System.out.println("Hello!"+name
        );
    }
}
