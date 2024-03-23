package testngPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizePractice {

    @Test(priority = 1)
    public void launchURL(){
        System.out.println("User launched website");
    }

    @Test
    @Parameters({"Username"})
    public void userLogin(String strUsername){
        System.out.println("username : "+strUsername);
    }

    @Test(priority = 3)
    @Parameters({"password"})
    public void userEnterPassword(String strPassword){
        System.out.println("password : "+strPassword);
    }
}
