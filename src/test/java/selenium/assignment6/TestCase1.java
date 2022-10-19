package selenium.assignment6;

import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;

public class TestCase1 {

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClassTest(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethodTest(){
        System.out.println("Before Method");
    }


    @Test
    public void addTwoNumber1(){
        int Sum;

        Sum = 15 + 30;

        System.out.println("Test-1");

        Assert.assertEquals(Sum, 45);
    }

    @Test(groups = "smoke")
    public void addTwoNumber2(){
        int Sum;

        Sum = 16 + 30;

        System.out.println("Test-2");

        Assert.assertEquals(Sum, 46);
    }

    @Test
    public void addTwoNumber3(){
        int Sum;

        Sum = 17 + 30;

        System.out.println("Test-3");

        Assert.assertEquals(Sum, 47);
    }

    @Test(groups = "smoke")
    public void addTwoNumber4(){
        int Sum;

        Sum = 18 + 30;

        System.out.println("Test-4");

        Assert.assertEquals(Sum, 48);
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterClass
    public void afterClassTest(){
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethodTest(){
        System.out.println("After Method");
    }



}
