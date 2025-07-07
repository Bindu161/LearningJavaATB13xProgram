package ex_21_OOPS_Constructor;

public class Lab179_PC {
    public static void main(String[] args) {
            BabyA b1 = new BabyA();
            BabyA b2= new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);

        BabyA b3= new BabyA("chinna", "45362497", 2025,07,07);
        BabyA b4= new BabyA("Sindhu", "896845", 2025,07,04);
        System.out.println(b3.name);
        System.out.println(b4.name);
    }
}

class BabyA {

    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    BabyA() {
        name = "chinna";
        aadhar_number = "0000";
        year = 1971;
        month = 07;
        day = 01;

    }

    BabyA(String name_user, String aadhar_number_user, int year_user, int month_user, int day_user) {
        this.name = name_user;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;
    }
}



