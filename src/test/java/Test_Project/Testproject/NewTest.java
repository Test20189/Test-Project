package Test_Project.Testproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() 
  {
	  System.out.println("Joy");
  }
  @Test
  public void f1() 
  {
	  System.out.println("Kishore");
  }
  @Test
  public void f2() 
  {
	  System.out.println("Muni");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Dip");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Bhattacharjee");
  }

}
