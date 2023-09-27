package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass {
		@Test
		public void testCreateProject() throws EncryptedDocumentException, IOException {
			EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
			e.setTaskTab();
			TaskListPage t=new TaskListPage(driver);
			t.getAddNewBtn().click();
			t.getNewProjectBtn().click();
			FileLib f=new FileLib();
			String projectName = f.getExcelData("CreateCustomer", 2, 4);
			t.getEnterProjectNameTbx().sendKeys(projectName);
			t.getCustomerDD().click();
			t.getCustomerName().click();
			String projectDesc = f.getExcelData("CreateCustomer", 2, 5);
			t.getProjectDescription().sendKeys(projectDesc);
			t.getCreateProjectBtn().click();
			String actualProjectText = t.getActualProject().getText();
			Assert.assertEquals(actualProjectText, projectName);
		}
		

}
