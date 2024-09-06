package entity;

public class Student {
    public  String fullname;
    public int age;
    public double gpa;

    public Student(String fullname, int age, double gpa) {
        this.fullname = fullname;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Entity.Student{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }



}
