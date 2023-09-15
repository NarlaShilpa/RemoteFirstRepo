package SeleniumBatch33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
<<<<<<< HEAD
		driver.get("https://www.facebook.com/");

=======
				driver.get("https://www.facebook.com/");

               driver.manage().window().maximize();
>>>>>>> c6e1c39d14a01f8bea17174dbe02649235a19c3f
		WebElement loginButton= driver.findElement(By.xpath("//button[@name='login']"));
		boolean actualButtonDispaly= loginButton.isDisplayed();
		System.out.println(" actualButton is dispalyeing :"+ actualButtonDispaly);
		boolean expectedButtonDispaly=true;
		if(actualButtonDispaly== expectedButtonDispaly) 
		{
			System.out.println(" loginButton is isDisplayed"); 

		}
		else 
		{
			System.out.println(" loginButton is not isDisplayed"); 

		}
		boolean actualButtonEnabled= loginButton.isEnabled();
		System.out.println(" actualButton is isEnabled :"+ actualButtonEnabled);
		boolean expectedButtonEnabled=true;
		if(actualButtonEnabled== expectedButtonEnabled) 
		{
			System.out.println(" loginButton is isEnabled"); 

		}
		else 
		{
			System.out.println(" loginButton is not isEnabled"); 

		}
		String actualbuttonName=loginButton.getText();
		System.out.println("ButtonName is :"+actualbuttonName);
		String expectedbuttonName="Log In";
		if(actualbuttonName.equals(expectedbuttonName))
		{
			System.out.println("Button Name is correctly "); 
		}
		else
		{
			System.out.println("Button Name is not correctly "); 

		}

		loginButton.click();




	}

}
//button anede labele mida or attribute gane untade here we take the lable value 
