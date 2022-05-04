package Collections;

import java.util.Objects;

public class Student implements  Comparable<Student>{
    private String name;
    private int rollNO;

    public Student(String name, int rollNO) {
        this.name = name;
        this.rollNO = rollNO;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNO=" + rollNO +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rollNO == student.rollNO;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNO);
    }



    @Override
    public int compareTo(Student o) {
        return this.rollNO-o.rollNO;
    }
}
