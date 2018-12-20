package Test_Project.Testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class element extends superc
{
	WebDriver driver;
	public element(WebDriver wb)
	{
		this.driver=wb;
	}
	
	By search1=By.xpath("//input[@title='Search']");

	public void search() throws Exception
	{
		//WebElement search1=driver.findElement(By.xpath("//input[@title='Search']"));
		driver.findElement(search1).sendKeys("joy");
		Thread.sleep(3000);
		driver.close();
	}
	

}

