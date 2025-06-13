package ex_07_Userinput;

public class Lab068_UserInput_CLI {
    public static void main(String[] args) {

        String age_string =args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age_string);
        String canIVote = age >= 25? "Yes": "No";
        System.out.println(canIVote);
    }
}
