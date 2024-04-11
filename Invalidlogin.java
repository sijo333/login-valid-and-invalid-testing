package shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Invalidlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\selenium\\edge web driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://campus.sicsglobal.co.in/Project/tripplanner");
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/a/i")).click();
		driver.findElement(By.name("username")).sendKeys("sijo454@gamil.com");
		driver.findElement(By.name("password")).sendKeys("sss123@");
		driver.findElement(By.name("login")).click();
		driver.switchTo().alert().accept();


	}

}
