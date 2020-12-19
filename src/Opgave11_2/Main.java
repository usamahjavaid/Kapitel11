package Opgave11_2;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Jens","cumvej12", "12121212","jegelskerdig@hotmail.dk");
        Student student = new Student("Mikkel", "cumvej 14",
                "13131313", "Jeghaderjer@hotmail.com", 1);
        Employee employee = new Employee("Frederik", "Cumvej15",
                "69420696", "JegelskerSpil@hotmail.com", "Salesman ", 30000);
        Faculty faculty = new Faculty("Enemark", "cumvej11",
                "8548943", "Loveme@hotmail.dk", "memeMaker",
                15000, "8-16","Senior" );
        Staff staff = new Staff("Lasse", "IHateWaifu@hotmail.dk",
                "3213213", "Whateber@hotmail.com","ArtDesign", 18000, "undegrad");

        System.out.println("Person " + person.toString());
        System.out.println("Student " + student.toString());
        System.out.println("Employee " + employee.toString());
        System.out.println("Faculty " + faculty.toString());
        System.out.println("Staff " + staff.toString());


    }
}
