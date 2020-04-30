package xu.zhi.hua.testAllure;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

/**
 * Unit test for simple App.
 */
@Epic("测试Allure的step功能")
@Feature("step测试")
public class StepTest {
	private App app;

	@Before
	public void setUp() {
		app = new App();
	}

	@Test
	public void someTest() throws Exception {
	    //Some code...
	    //stepLogic();
	    //Some more assertions...
		User user = new User();
		user.setName("xuzh");
		user.setPassword("123456");
		step1Logic(user);
		step2Logic();
		step3Logic();
	}

	@Step("Type {user.name} / {user.password}.")
	private void step1Logic(User user) {
	    // Step1 implementation
	} 

	@Step("This is step 2")
	private void step2Logic() {
	    // Step2 implementation
	}
	@Step()
	private void step3Logic() {
	    // Step2 implementation
	}
	@After
	public void tearDown() throws Exception {
	}

	
}
