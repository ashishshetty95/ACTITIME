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
public class TaskModule extends BaseClass {
	@Test
	public void testCreateTask() throws EncryptedDocumentException, IOException {
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewTaskBtn().click();
		t.getSelectCustomerDD().click();
		t.getEnterCustomer().click();
		t.getSelectProjectDD().click();
		t.getEnterProjectName().click();
		FileLib f=new FileLib();
		String taskName = f.getExcelData("CreateCustomer", 3, 6);
		t.getEnterTaskName().sendKeys(taskName);
		t.getCreateTaskBtn().click();
		String actualTaskName = t.getActualTask().getText();
		Assert.assertEquals(actualTaskName, taskName);
	}

}
