package track.oops.classes.August14;

public class StudentApplication {
    public static void main(String[] args) {

        Student s2 = new Student();
        s2.display();

        Student s3 = new Student("Rahul");
        s3.display();

        Student s1 = new Student("Ayush", 19, 5.8);
        s1.display();

    }

}
