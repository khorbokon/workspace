package Task84;

import Task81.Calc81;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass84 {
@Test
    public void test1 () {
        int result = Calc81.sum(10, 15);
        System.out.println(result);
        Assert.assertEquals(result, 25, "Sum Failed ");
    }
@Parameters({"valA","valB"})
@Test
    public void test2 (int valA, int valB) {
        int result = Calc81.vid(valA, valB);
        System.out.println(result);
        Assert.assertEquals(result, 99, "Vid Failed ");
    }

@Test
    public void test3 () {
        int result = Calc81.mno(10, 15);
        System.out.println(result);
        Assert.assertEquals(result, 150, "Mno Failed ");
    }

@Test (enabled = false)
    public void test4 () {
        float result1 = Calc81.dil(9, 7);
        float exp_result1 = result1;
        System.out.println();
        Assert.assertEquals(result1, exp_result1, "DIV failed");

    }

@Test
    public void test5 () {
        int result = Calc81.sum(10, 15);
        System.out.println(result);
        Assert.assertEquals(result, 25, "Sum Failed ");
    }


}
