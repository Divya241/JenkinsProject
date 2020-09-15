package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jsonFile) {
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting");
		Configuration config=new Configuration(f,"Adactin Hotel automation");
		config.addClassifications("sprint", "5");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Environment", "UAT");
		config.addClassifications("OS", "WIN-10");
		List<String>jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder= new ReportBuilder(jsonFiles,config);
		builder.generateReports();
		

	}

}
