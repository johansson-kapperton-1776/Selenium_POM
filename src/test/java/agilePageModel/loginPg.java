package agilePageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPg {

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailLG;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordLG;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginLG;

	@FindBy(xpath = "//span[normalize-space()='×']")
	WebElement close;

	@FindBy(xpath = "//i[@class='flaticon-graduation-cap']")
	WebElement course;

	@FindBy(xpath = "//a[@href='https://agileteach.com/portal/course-details/automation-testing-selenium']")
	WebElement autocourse;

	@FindBy(xpath = "//a[normalize-space()='Class Videos']")
	WebElement classvideo;
	
	@FindBy(xpath = "//a[contains(text(),'Ongoing SQA_ October')]")
	WebElement octbatch;
	
	@FindBy(xpath = "//a[contains(text(),'Class 06 OOP, Class and Object, Encapsulation, Get')]")
	WebElement class06;
	
	@FindBy(xpath = "//video[@oncontextmenu='return false;']")
	WebElement videoplay;
	
	@FindBy(xpath = "//video[@oncontextmenu='return false;']")
	WebElement videoelement;

	WebDriver lgpg;

	public loginPg(WebDriver lgpg) {
		this.lgpg = lgpg;
		PageFactory.initElements(lgpg, this);
	}

	void enterUn(String username) {
		emailLG.sendKeys("rohankapur2012@gmail.com");
	}

	void enterP(String password) {
		passwordLG.sendKeys("656f97bc9b146");
	}

	void clickLg() {
		loginLG.click();
	}

	void clickx() {
		close.click();
	}

	void clickC() {
		course.click();
	}

	void clickA() {
		autocourse.click();
	}

	void clickV() {
		classvideo.click();
	}
	
	void clickOct()  {
		octbatch.click();
	}
	
	void clickClass()  {
		class06.click();
	}
	
	void clickVideo()  {
		videoplay.click();
		
	}
	
	void clickVideoE()  {
		String time = videoelement.getAttribute("currentTime");
		System.out.println("the time is " + time);
		
		if(time != "0")  {
			System.out.println("Video is playing");
		}  else {
			System.out.println("Video is not playing");
		}
			
	
	}

}
