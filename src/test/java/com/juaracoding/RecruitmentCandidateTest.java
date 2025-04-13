package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentCandidatePage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RecruitmentCandidateTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static RecruitmentCandidatePage recruitmentCandidatePage = new RecruitmentCandidatePage();

    public RecruitmentCandidateTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("I enter a username and password")
    public void I_enter_a_username_and_password(){
        loginPage.loginUsernamePassword("Admin","admin123");
        loginPage.setLoginBtn();
        extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }
    @And("Admin go to menu Recruitment")
    public void admin_go_to_menu_recruitment(){
        recruitmentCandidatePage.setMenuRecruitment();
        extentTest.log(LogStatus.PASS,"Admin go to menu Recruitment");
    }

    @When("Admin click button Add")
    public void admin_click_button_add(){
        recruitmentCandidatePage.setAddBtn();
        extentTest.log(LogStatus.PASS,"Admin click button Add");
    }

    @And("Admin enter firstname")
    public void admin_enter_firstname(){
        recruitmentCandidatePage.setFirstName();
        extentTest.log(LogStatus.PASS,"Admin enter firstname");
    }
    @And("Admin enter lastname")
    public void admin_enter_lastname(){
        recruitmentCandidatePage.setLastName();
        extentTest.log(LogStatus.PASS,"Admin enter lastname");
    }
    @And("Admin enter email")
    public void admin_enter_email(){
        recruitmentCandidatePage.setEmail();
        extentTest.log(LogStatus.PASS,"Admin enter email");
    }

    @And("Admin click button save")
    public void admin_click_button_save(){
        recruitmentCandidatePage.setBtnSave();
        extentTest.log(LogStatus.PASS,"Admin click button save");
    }
}
