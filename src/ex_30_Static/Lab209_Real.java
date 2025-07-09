package ex_30_Static;

public class Lab209_Real {
    public static void main(String[] args) {

    }
}

class ATB{

    static {
        System.out.println(" Load the class?, I will execute");
    }
    {
        System.out.println("IIB -- this is called when object is created");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    static String courseName = "ATB13x";
    static String mentorName = "Pramod";

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass() {
        System.out.println("Class Joined");
    }
    void howTheyDoAssignment(){
        System.out.println("It is different");
    }
}
