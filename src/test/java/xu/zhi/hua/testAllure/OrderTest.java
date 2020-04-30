package xu.zhi.hua.testAllure;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;



/**
 * Unit test for simple App.
 */
@Epic("订单功能测试")
@Feature("订单接口测试")
public class OrderTest 
{
	 private App app;
	    @Before
	    public void setUp() {
	        app = new App();
	    }
	    @Severity(SeverityLevel.CRITICAL)
	    @Story("下订单")
	    @Test
	    public void method4() throws InterruptedException {
	        int a = 1;
	        int b = 2;
	        int result = app.add(a, b);
	        //Assert.assertEquals(4, result);
	    }
	    @Severity(SeverityLevel.CRITICAL)
	    @Story("结束订单")
	    @Test
	    public void method5() throws InterruptedException {
	        int a = 1;
	        int b = 2;
	        int result = app.subtract(a, b);
	        Assert.assertEquals(a - b, result);
	    }
	    @Severity(SeverityLevel.BLOCKER)
	    @Story("删除订单")
	    @Test
	    public void method6() throws InterruptedException {
	        int a = 1;
	        int b = 2;
	        int result = app.subtract(a, b);
	        Assert.assertEquals(a - b, result);
	    }
	    @After
	    public void tearDown() throws Exception {
	    }
}
