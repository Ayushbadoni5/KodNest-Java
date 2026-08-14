package track.oops.classes.August14;

public class Student {

    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    Student(String name) {
        this.name = name;
    }

    Student() {
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

}
