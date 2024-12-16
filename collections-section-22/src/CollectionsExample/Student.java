package CollectionsExample;


import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student that) {
        return that.name.compareTo(this.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}