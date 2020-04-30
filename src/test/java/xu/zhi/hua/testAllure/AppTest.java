package xu.zhi.hua.testAllure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import io.qameta.allure.junit4.DisplayName;

/**
 * Unit test for simple App.
 */
@Epic("通用功能测试")
@Feature("组件1测试")
public class AppTest {
	private App app;

	@Before
	public void setUp() {
		app = new App();
	}

	@Issue("TIANPING-19")
	@Severity(SeverityLevel.BLOCKER)
	@DisplayName("Human-readable test name")
	@Description("Some detailed test description")
	@Story("登陆场景-正常登陆")
	@Test
	public void method1() throws InterruptedException {
		int a = 1;
		int b = 2;
		int result = app.add(a, b);
		Assert.assertEquals(3, result);
	}

	@Issue("TIANPING-19")
	@Severity(SeverityLevel.NORMAL)
	@Story("登陆场景-正常登陆")
	@Test
	public void method2() throws InterruptedException {
		int a = 1;
		int b = 2;
		int result = app.subtract(a, b);
		Assert.assertEquals(a - b, result);
	}

//	@TmsLink("TIANPING-19")
//	@Issue("TIANPING-19")
//	@Severity(SeverityLevel.TRIVIAL)
//	@Story("登陆场景-异常登陆")
//	@Test
//	public void method3() throws InterruptedException {
//
//		FileInputStream fis;
//		try {
//			fis = new FileInputStream(new File("/Users/ofo/Desktop/ab流程图.png"));
//			
//
//			byte[] read = new byte[1024*1024];
//			fis.read(read);
//			//this.saveScreenshot(read);
//			fis.close();
//		
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		int a = 1;
//		int b = 2;
//		int result = app.subtract(a, b);
//		//Assert.assertEquals(a - b, result);
//	}

	@After
	public void tearDown() throws Exception {
	}

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshot(byte[] screenShot) {
		return screenShot;
	}
}
