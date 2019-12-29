package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


/**
 * 
 * @author Srilekha D
 * @author To generate JVM report
 * @date 29/12/2019
 *
 */


public class JvmReport {
	
	public static void generateJVMReport(String jsonLoc) {
				
		Configuration com = new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\report\\"), "AbiCucumber");
				
		List<String>lstjvm= new  ArrayList<String>();
		lstjvm.add(jsonLoc);
		
		ReportBuilder builder = new ReportBuilder(lstjvm, com);
		
		builder.generateReports();
		
		
		
		

	}

}
