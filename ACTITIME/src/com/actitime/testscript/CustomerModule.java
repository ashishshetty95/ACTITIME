package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Create Customer", true);
		FileLib f=new FileLib();
		String cusName = f.getExcelData("CreateCustomer", 1, 2);
		String cusDesc = f.getExcelData("CreateCustomer", 1, 3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustBtn().click();
		t.getEnterCustNametbx().sendKeys(cusName);
		t.getDescriptiontbx().sendKeys(cusDesc);
		t.getSelectCustDD().click();
		t.getBigBangCompanytxt().click();
		t.getCreateCustBtn().click();
		Thread.sleep(5000);
		String actualCustomerText = t.getActualCust().getText();
		Assert.assertEquals(actualCustomerText, cusName);
	}

}
