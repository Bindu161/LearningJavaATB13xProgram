package ex_24_OOPS_Encapsulation;

public class Lab192_Encap_Demo {
    public static void main(String[] args) {

        class VWOLogin {

            public String username;
            public String password;


            public VWOLogin(String username, String password) {
                this.password = password;
                this.username = username;
            }
        }

        class GoodVWOLogin {
            // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
            private String username;
            private String password;

            // PC
            public GoodVWOLogin(String usr, String pwd) {
                this.username = usr;
                this.password = pwd;
            }

            String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password, boolean isAdmin) {
                if (isAdmin) {
                    this.password = password;
                } else {
                    System.out.println("Can't change the password!");
                }
            }
        }
    }
}



