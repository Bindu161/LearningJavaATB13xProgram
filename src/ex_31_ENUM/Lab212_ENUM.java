package ex_31_ENUM;

public class Lab212_ENUM {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());

        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());

        System.out.println(APIURLS.vwo.getUrl());
        System.out.println(APIURLS.google.getUrl());
        System.out.println(APIURLS.katalon.getUrl());
    }
}
