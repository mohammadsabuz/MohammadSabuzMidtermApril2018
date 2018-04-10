package design;

import org.testng.Assert;
public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {

        //Write Unit Test for all the methods has been implemented in this package.

        // EmployeeInfo refVar = new EmployeeInfo(101);
        Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus(9500,10),950);
        Assert.assertEquals(EmployeeInfo.calculateEmployeePension(8500),2000.0);
        Assert.assertEquals(100,100);
    }
}