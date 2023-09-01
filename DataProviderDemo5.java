package batch33.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo5 {
	@Test(dataProvider = "setData")
	public void funA(String userName,String passWord) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		Thread.sleep(3000);
		WebElement userName1=driver.findElement(By.xpath("//input[@name='username']"));
		userName1.sendKeys(userName);
		WebElement passWord1=driver.findElement(By.xpath("//input[@name='password']"));
		passWord1.sendKeys(passWord);
		
		
		
	}
	@DataProvider
	public Object[][] setData()
	{
		Object[][]o1=new Object[3][2];
		o1[0][0]="Shilpa";
		o1[0][1]="Mounika";
		
		o1[1][0]="Jyothi";
		o1[1][1]="Reddy";
		
		o1[2][0]="Raghu";
		o1[2][1]="Sangeetha";
		
		return o1;
		
	}
	

}
