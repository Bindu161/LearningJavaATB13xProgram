package ex_23_OOPS_Polymorphism.methodoverlding;

public class Lab191_MethodOverriding_Automation {
    public static void main(String[] args) {

        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();


        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3= new Firefox();
        c3.openBrowser();
    }

}

class CommonToAll{

    void  openBrowser(){
        System.out.println("Starting a IE Browser!!");
    }
}

class ChromeTC extends CommonToAll {

    @Override
    void openBrowser() {
        System.out.println("Starting a Chrome Browser!!");

    }
}

class Firefox extends  CommonToAll{

    @Override
    void openBrowser() {
        System.out.println("Starting a Firefox Browser!!");
    }
}