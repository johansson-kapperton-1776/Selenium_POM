package agilePageModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Agile {

	public static void main(String[] args) throws InterruptedException {

		WebDriver lgpg = new ChromeDriver();

		lgpg.get("https://agileteach.com/portal/login");

		lgpg.manage().window().maximize();
		lgpg.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		loginPg lpg = new loginPg(lgpg);

		lpg.enterUn("rohankapur2012@gmail.com");
		Thread.sleep(1000);

		lpg.enterP("656f97bc9b146");
		Thread.sleep(2000);

		lpg.clickLg();
		Thread.sleep(2000);

		lpg.clickx();
		Thread.sleep(2000);

		lpg.clickC();
		Thread.sleep(2000);

		lpg.clickA();
		Thread.sleep(2000);
		
		lpg.clickV();
		Thread.sleep(2000);
		
		lpg.clickOct();
		Thread.sleep(2000);
		
		lpg.clickClass();
		Thread.sleep(2000);
		
		lpg.clickVideo();
		Thread.sleep(2000);
		
		lpg.clickVideoE();
		Thread.sleep(100000);
		

	}

}
