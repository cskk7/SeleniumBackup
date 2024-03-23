package testngPractice;

import org.testng.annotations.Test;

public class PageTest {

    @Test(description = "launch browser")
    public void launchURL(){
        System.out.println("User launched website");
    }

    @Test
    public void userLogin(){
        System.out.println("User login ");
    }

    @Test   
    public void userEnterPassword(){
        System.out.println("User enters password");
    }

    @Test(dependsOnMethods = {"launchURL","userLogin","userEnterPassword"})
    public void userWriteEmail(){
        System.out.println("User write email");
    }

    @Test(dependsOnMethods = "userWriteEmail")
    public void userSendEmail(){
        System.out.println("User send email");
    }

    @Test(priority = 1)
    public void settingsButton(){
        System.out.println("Settings Button");
    }

    @Test(priority = 2)
    public void logoutButton(){
        System.out.println("Log Out");
    }


}
