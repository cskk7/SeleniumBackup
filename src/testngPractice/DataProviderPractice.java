package testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

//    Single Data Provider
    public int count = 1;

    @DataProvider(name = "Computer-Brands")
    public Object[] dataProviderMethod() {
        return new Object[]{"Asus", "Dell","HP","Apple","Acer","Lenovo","MSI"};
    }
    @Test(dataProvider = "Computer-Brands")
    public void testDataProviderConcept(String strData) {
        System.out.println("\n >> Name "+(count++)+": " + strData);
    }
//  Multiple Data Provider
    @DataProvider(name = "Software-Testing")
    public Object[][] dataProidedMultiple(){
        return new Object[][] {{1,"Selenium" ,"Web Testing"},
                {2,"Appium" ,"Mobile Testing"},
                {3,"Cucumber" ,"BDD Framework"},
                {4,"TestNG" ,"Automation"},
                {5,"Jenkins" ,"CI/CD"},
                {6,"GitHub" ,"Version control"},
                {7,"PostMan" ,"API Testing"},
                {8,"JMeter" ,"Performance Testing"}};
    }
    @Test(dataProvider = "Software-Testing")
    public void testMethod(int sno, String value2, String value3) {
        System.out.println("\n >> S.NO: "+sno+"| "+value2+"| Uses: "+value3);
    }
}

