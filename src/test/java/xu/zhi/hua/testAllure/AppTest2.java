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

public class AppTest2 {
	private App2 app;

	@Before
	public void setUp() {
		app = new App2();
	}

	
	@Test
	public void method111() throws InterruptedException {
		int a = 1;
		int b = 2;
		int result = app.add(a, b);
		Assert.assertEquals(3, result);
	}

	
	@Test
	public void method211() throws InterruptedException {
		int a = 1;
		int b = 2;
		int result = app.subtract(a, b);
		Assert.assertEquals(a - b, result);
	}


}
