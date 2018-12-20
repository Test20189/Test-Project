package Test_Project.Testproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testpack extends superc
{

	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("https://www.google.com/");
		Driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception
	{
		start();
		//element el=PageFactory.initElements(Driver, element.class);
		element el=new element(Driver);
		el.search();
		
	}
	
}
