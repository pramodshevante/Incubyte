package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ComposeClass {
	
	WebDriver driver;
	@Given("User logging in to Gamil page")
	public void user_logging_in_to_gamil_page() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("shevantepramod17@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Pramodshevante137@");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();

	}





	@Given("User click on Compose button")
	public void user_click_on_compose_button() {
		
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div")).click();
	}
	@When("User enter the recipient email address")
	public void user_enter_the_recipient_email_address() {
		
		driver.findElement(By.xpath("//*[@id=\":tq\"]")).sendKeys("xyz.com");
	}
	@When("User enter the subject line")
	public void user_enter_the_subject_line() {
		
		driver.findElement(By.xpath("//*[@id=\":pt\"]")).sendKeys("Incubyte assessment");
	}
	@When("User enter the email body")
	public void user_enter_the_email_body() {
		
		driver.findElement(By.xpath("//*[@id=\":r2\"]")).sendKeys("Automation QA");
	}
	@Then("User click on send button")
	public void user_click_on_send_button() {
		
		driver.findElement(By.xpath("//*[@id=\":pj\"]")).click();
	 }


}
