package testngPractice.excel1;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.util.Iterator;

public class DataProviderPrac {
    public static class staticProviderClass{
    @DataProvider(name = "AmazonProduct", parallel = false)
    public static Iterator<Object[]> getDeviceName() {
        String strWorkBookPath = new StringBuilder().append(System.getProperty("user.dir")).append(File.separator)
                .append("resources\\testdata").append(File.separator).append("testdata").append(".xlsx").toString();

        Iterator<Object[]> testData = ExcelPrac.getTestData("F:\\1.Projects\\1. Github\\50-days-challenge\\SeleniumTopicsWise\\DataProvidesUsingExcel\\NewRelease.xlsx", "Mobiles");
        return testData;
    }
}
}
