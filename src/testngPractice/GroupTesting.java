package testngPractice;

import org.testng.annotations.Test;

public class GroupTesting {
    @Test(groups = {"Regression"})
    public void launchURL(){
        System.out.println("User launched website");
    }

    @Test(groups = {"smoke"})
    public void userLogin(){
        System.out.println("User login ");
    }

    @Test(groups = {"Regression"})
    public void userEnterPassword(){
        System.out.println("User enters password");
    }

    @Test(groups = {"smoke"})
    public void userWriteEmail(){
        System.out.println("User write email");
    }

    @Test(groups = {"Regression"})
    public void userSendEmail(){
        System.out.println("User send email");
    }
}
