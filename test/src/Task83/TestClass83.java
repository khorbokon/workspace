package Task83;

import Task81.Calc81;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass83 {

@DataProvider(name = "dataP")

    public Object[][] testData (){
        return new Object[][]{
                {10,15,25},
                {2,3,5},
                {5,5,10}};
    }

@Test (dataProvider = "dataP")

    public void test1 (int valA, int valB, int result) {
        int result_act = Calc81.sum(valA, valB);
        System.out.println(result);
        Assert.assertEquals(result_act, result, "Sum Failed ");
    }
}
