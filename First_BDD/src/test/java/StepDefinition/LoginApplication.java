package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginApplication {
	
	WebDriver driver;
	


		@Given("User navigates to demo application login page")
		public void Invokebrowser() {
			System.setProperty("webdriver.chrome.driver", "D:\\Rest_assured_jars\\docs\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.demo.guru99.com/v4");
		   System.out.println("Navigate");
		}


		@Then("^User eneter the username as (.*)$")
		public void Enteruname(String username) {
			driver.findElement(By.name("uid")).sendKeys(username);
		   System.out.println("Enter Uname");
		}
		@Then("^User enters the pwd as (.*)$")
				public void Enterpwd(String password) {
			driver.findElement(By.name("password")).sendKeys(password);
		    System.out.println("Enter PWd");
		}
		@And("user clicks login button")
		public void clicklogin() {
			driver.findElement(By.name("btnLogin")).click();
		    System.out.println("Click login");
		}
		@Then("the User login is sucessful")
		public void the_user_login_is_sucessful() {
		    System.out.println("Login sucess");
		    driver.close();
		}




}
