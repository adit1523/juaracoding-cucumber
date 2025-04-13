package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentCandidatePage {
    private WebDriver driver;

    public RecruitmentCandidatePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    private WebElement menuRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addBtn;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[contains(@class, 'oxd-input')]")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;


    public void setMenuRecruitment(){
        menuRecruitment.click();
    }

    public void setAddBtn(){
        addBtn.click();
    }
    public void setFirstName(){
        firstName.sendKeys("Test");
    }
    public void setLastName(){
        lastName.sendKeys("123");
    }
    public void setEmail(){
        email.sendKeys("admin@test123.com");
    }

    public void setBtnSave(){
        btnSave.click();
    }
}
