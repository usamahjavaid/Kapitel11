package Training;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }
    public void displayStudent(){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);

    }
}
