package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * @author Srilekha D
 * @author for executing steps
 * @date 29/12/2019
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/feature" }, glue = "com.stepdefinition", dryRun = false, tags = {
		"@Regression" }, plugin = { "pretty", "json:\\src\\test\\resources\\report\\abi.json",
				"rerun:src\\test\\resources\\feature\\failed.txt" }, monochrome = true, strict = true, snippets = SnippetType.CAMELCASE)
public class TestRunnerClass {

	@AfterClass
	
	

	public static void afterclass() {

		JvmReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\report\\abi.json");

	}

}
