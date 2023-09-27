package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustBtn;
	
	@FindBy(xpath="//input[@class = 'inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustNametbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptiontbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompanytxt;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCust;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectBtn;
	
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterProjectNameTbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customerDD;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='AAA_001']")
	private WebElement customerName;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescription;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualProject;
	
	
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskBtn;
	
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/div[@class='components_combobox cpCombobox']/div[@class='comboboxButton']/div[@class='selectedItem']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='AAA_001']")
	private WebElement enterCustomer;
	
	@FindBy(xpath="//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']/div")
	private WebElement selectProjectDD;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='AAA_001']")
	private WebElement enterProjectName;
	
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'])[4]")
	private WebElement enterTaskName;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTaskBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualTask;
	
	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getEnterCustomer() {
		return enterCustomer;
	}

	public WebElement getSelectProjectDD() {
		return selectProjectDD;
	}

	public WebElement getEnterProjectName() {
		return enterProjectName;
	}

	public WebElement getEnterTaskName() {
		return enterTaskName;
	}

	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}

	public WebElement getActualTask() {
		return actualTask;
	}

	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public void getNewProjectBtn(WebElement newProjectBtn) {
		this.newProjectBtn = newProjectBtn;
	}

	public WebElement getEnterProjectNameTbx() {
		return enterProjectNameTbx;
	}

	public WebElement getCustomerDD() {
		return customerDD;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getProjectDescription() {
		return projectDescription;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getActualProject() {
		return actualProject;
	}

	

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustBtn() {
		return newCustBtn;
	}

	public WebElement getEnterCustNametbx() {
		return enterCustNametbx;
	}

	public WebElement getDescriptiontbx() {
		return descriptiontbx;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getBigBangCompanytxt() {
		return bigBangCompanytxt;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
	
	public WebElement getActualCust() {
		return actualCust;
	}

}
