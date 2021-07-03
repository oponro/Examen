package TestSelenium;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
	
	private ChromeDriver driver;
	
  @Test
  public void f() {
	  
WebElement cuadroBusqueda = driver.findElement(By.name("q"));
	  
	  cuadroBusqueda.sendKeys("pagina Clinica Pet Smile");
	  cuadroBusqueda.click();
	  
	  cuadroBusqueda.submit();
	  
	   
	  assertEquals("pagina Clinica Pet Smile - Google search ", driver.getTitle());
  }
  
  @BeforeTest
  public void beforeTest( ) {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Ingenieria en informatica\\Evaluaciones\\02_Integracion Continua\\Examen\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
  
  @AfterTest
  public void afterTest( ) throws InterruptedException {
	  driver.wait();  
	  
	  
	  
  }
}
