package SeleniumBatch33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo2 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		//WebElement button=driver.findElement(By.className("ui-button ui-widget ui-corner-all"));
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		//WebElement button=driver.findElement(By.xpath("/html/body/input"));
		boolean actualButtonDispaly= button.isDisplayed();
		System.out.println(" actualButton is dispalyeing :"+ actualButtonDispaly);
		boolean expectedButtonDispaly=true;
		if(actualButtonDispaly== expectedButtonDispaly) 
		{
			System.out.println(" button is isDisplayed"); 

		}
		else 
		{
			System.out.println(" button is not isDisplayed"); 

		}
		boolean actualButtonEnabled= button.isEnabled();
		System.out.println(" actualButton is isEnabled :"+ actualButtonEnabled);
		boolean expectedButtonEnabled=true;
		if(actualButtonEnabled== expectedButtonEnabled) 
		{
			System.out.println(" button is isEnabled"); 

		}
		else 
		{
			System.out.println(" button is not isEnabled"); 

		}
		String actualbuttonName=button.getText();
	//	System.out.println("ButtonName is :"+actualbuttonName);
		String expectedbuttonName="A submit button";
		if(actualbuttonName==expectedbuttonName)
		{
			System.out.println("Button Name is correctly "); 
		}
		else
		{
			System.out.println("Button Name is not correctly "); 

		}

		button.click();




	}
		/*WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/button");
	WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
	boolean actualbuttonDisplay=button.isDisplayed();
	System.out.println("buttonDispaly information: "+actualbuttonDisplay);
	boolean expectedbuttonDisplay=true;
	if(actualbuttonDisplay==expectedbuttonDisplay)
	{
		System.out.println("botton is Displayed");
	}
	else
	{
		System.out.println("button is not Displayed");
	}
	boolean actualbuttonEnabled=button.isEnabled();

	System.out.println("buttonEnabled: "+actualbuttonEnabled);
	boolean expectedbuttonEnabled=true;

	if(actualbuttonEnabled==expectedbuttonEnabled)
	{

		System.out.println("button is Enabled");
	}

	else
	{
		System.out.println("button is disabled");
	}
	String actualButtonName=button.getText();
	String expectedButtonName="A submit button";
	if(actualButtonName==expectedButtonName)
	{
		System.out.println("buttonName displayed correctly");

	}
	else
	{
		System.out.println("buttonName displayed correctly");
	}


}*/

}


