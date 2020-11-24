package Opgave11_2;

public class Student extends Person {

    private int status;
    private final static int freshman = 1;
    private final static int sophomore = 2;
    private final static int junior = 3;
    private final static int senior = 4;


    public Student(String name, String address, String phoneNumber, String email, int status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {

        switch (status) {
            case 1:
                return "freshman";
            case 2:
                return "sophomore";
            case 3:
                return "junior";
            case 4:
                return "senior";
            default : return "unknown";
        }


    }

    @Override
    public String toString() {
        return super.toString() + "Status: " + getStatus();
    }
}
