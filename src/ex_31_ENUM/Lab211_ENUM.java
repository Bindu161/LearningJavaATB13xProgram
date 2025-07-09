package ex_31_ENUM;

public class Lab211_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.THURSDAY);
        System.out.println(PROJECT_NAMES.katalon);
    }

}

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

enum PROJECT_NAMES{
    google,restassured,katalon, vwo
}