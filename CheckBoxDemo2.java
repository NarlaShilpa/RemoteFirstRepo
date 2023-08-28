package SeleniumBatch33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2 {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement checkBox=driver.findElement(By.xpath("(//span[@class='cbmark'])[1]"));
		//WebElement checkBox=driver.findElement(By.xpath("//input[@id='ContentHolder_lbFeatures_VI']"));

		boolean actualCheckBoxDispalyed=checkBox.isDisplayed();
		boolean ExpectedCheckBoxDispalyed=true;
		System.out.println(" checkBox is dispalyeing :"+ actualCheckBoxDispalyed);
		if(actualCheckBoxDispalyed== ExpectedCheckBoxDispalyed) 
		{
			System.out.println(" checkBox is isDisplayed"); 

		}
		else 
		{
			System.out.println(" checkBox is not isDisplayed"); 

		}
		boolean actualCheckBoxEnabled=checkBox.isEnabled();
		boolean ExpectedCheckBoxEnabled=true;
		System.out.println(" checkBox is enabled :"+ actualCheckBoxEnabled);
		if(actualCheckBoxEnabled== ExpectedCheckBoxEnabled) 
		{
			System.out.println(" checkBox is is Enabled"); 

		}
		else 
		{
			System.out.println(" checkBox is not isEnabled"); 

		}
		WebElement selectedCheckbox=driver.findElement(By.xpath("//input[@id='caddoptional' ] "));
		boolean actualCheckBoxSelected=selectedCheckbox.isSelected();
		boolean ExpectedCheckBoxSelected=true;
		System.out.println(" checkBox is isSelected :"+ actualCheckBoxSelected);
		if(actualCheckBoxSelected== ExpectedCheckBoxSelected) 
		{
			System.out.println(" checkBox is  Selected"); 

		}
		else 
		{
			System.out.println(" checkBox is  not Selected"); 

		}
		checkBox.click();

		boolean afterCheckBoxSelected=selectedCheckbox.isSelected();
		boolean afterExpectedCheckBoxSelected=false;
		System.out.println("After click checkBox is isSelected :"+ afterCheckBoxSelected);
		if(afterCheckBoxSelected== afterExpectedCheckBoxSelected) 
		{
			System.out.println("After click checkBox is not Selected :"); 

		}
		else 
		{
			System.out.println("After click checkBox  is Selected :"); 

		}
		
		
		


	
	}

}
