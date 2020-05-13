package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty9.util.security.Password;

public class GmailTest extends BaseClass{
	

	public static void main(String[] args) throws InterruptedException {
 driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
  WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
email.sendKeys("neelamadhaba96@gmail.com");
 WebElement Next =  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content"));
 Next.click();
WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
 password.sendKeys("neela@345");
 
	}

}
