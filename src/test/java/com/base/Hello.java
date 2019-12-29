package com.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Srilekha D
 * @author Steps for reading properties file
 * @date 29/12/2019
 * @modified by abinesh
 * @date 29/12/2019
 *
 */

public class Hello {

	public static void main(String[] args) throws IOException {

		FileReader r = new FileReader("C:\\Users\\srile\\Videos\\Cucumber\\src\\test\\resources\\config\\config.properties");

		Properties p = new Properties();

		p.load(r);
		
		Object o = p.get("password");
		
		System.out.println(o);

	}

}
