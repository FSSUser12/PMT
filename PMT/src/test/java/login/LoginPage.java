package login;

import org.testng.annotations.Test;

import util.Log;

public class LoginPage {

	@Test
	public void TC_001() {
		Log.info("LoginPage TC_001");
	}
	
	@Test
	public void TC_002() {
		Log.debug("LoginPage TC_002");
	}
	
	@Test
	public void TC_003() {
		Log.warn("LoginPage TC_003");
	}
}
