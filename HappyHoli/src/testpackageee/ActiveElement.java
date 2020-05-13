package testpackageee;

public class ActiveElement extends BaseClass {
public static void main(String[] args) {
	driver.get("https://www.google.com");
	driver.switchTo().activeElement().sendKeys("all are matured");
}
}
