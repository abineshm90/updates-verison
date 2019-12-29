package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.LibGlobal;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * 
 * @author Srilekha D
 * @author have method to take screenshot 
 * @date 29/12/2019
 *
 */
public class Hooks extends LibGlobal {

	@Before

	public void beforescenario() {
		getDriver();
		loadUrl(getConfig("url"));
	}

	@After

	public void afterscenario(Scenario sc) {
		System.out.println("after execution");

		if (sc.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] b = tk.getScreenshotAs(OutputType.BYTES);
			System.out.println(b[0]);
			System.out.println("failed");
			sc.embed(b, "failed.png");

		} else {

			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] c = tk.getScreenshotAs(OutputType.BYTES);
			System.out.println(c[0]);
			System.out.println("pass");
			sc.embed(c, "pass.png");

		}
	}

}