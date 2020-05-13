package testpackageee;

import java.util.Set;

public class WindowHandleDemo  extends BaseClass{
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		String ParentWH = driver.getWindowHandle();
		System.out.println( ParentWH);
		//Print the total no of browser window
		Set<String> allWH = driver.getWindowHandles();
		System.out.println(allWH.size());
		for (String WH:allWH) {
			driver.switchTo().window("WH");
			String aTitle = driver.getTitle();
			System.out.println(WH+ ":" +aTitle);
			//Close the all child window.
			//if (WH.equals(ParentWH));
			//Close the all window expect parent
			if (!WH.equals(ParentWH));
			driver.close();
		}
		driver.quit();	
	}
}
