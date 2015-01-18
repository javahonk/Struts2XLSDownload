package com.javahonk.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;


public class Struts2XLSDownloadAction{

	@Action(value = "/downloadXLSFileAction")
	public void downloadCSVFileAction() throws Exception {

	    HttpServletResponse response = ServletActionContext.getResponse();
	    try {
			response.setContentType("application/vnd.ms-excel");
			String reportName = "JavaHonk_Struts2_XLS_Report_.xls";
			response.setHeader("Content-disposition", "attachment; filename=" + reportName);
			ArrayList<String> rows = new ArrayList<String>();
			rows.add("First Name");
			rows.add("\t");
			rows.add("Last name");
			rows.add("\t");
			rows.add("Test");
			rows.add("\n");
 
			for (int i = 0; i < 5; i++) {
				rows.add("Java");
				rows.add("\t");
				rows.add("Honk");
				rows.add("\t");
				rows.add("Success");
				rows.add("\n");
			}
			Iterator<String> iter = rows.iterator();
			while (iter.hasNext()) {
				String outputString = (String) iter.next();
				response.getOutputStream().print(outputString);
			}
			
			response.getOutputStream().flush();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
