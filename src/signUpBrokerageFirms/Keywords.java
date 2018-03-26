package signUpBrokerageFirms;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
//import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Keywords {
	static WebDriver driver;
	static FileInputStream f;
	static Properties prop;
	static WebElement wb;
	
	
	public void openBrowser()throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\AL1694\\Desktop\\SampleData\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	f = new FileInputStream("C:\\Users\\AL1694\\eclipse-workspace\\SampleProject\\src\\signUpBrokerageFirms\\objectRepository.properties");
	prop = new Properties();
	prop.load(f);
}
	public void navigate(String data) {
	driver.get(data);
}
	public void input(String data,String objectName)throws Exception {
	Thread.sleep(3000);
	 driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
	 }
public void click(String objectName)throws Exception {
	Thread.sleep(3000);
	driver.findElement(By.xpath(prop.getProperty(objectName))).click();
}
public void inputPhoneNo()throws Exception {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876543210");
	
	
}
public void select(String data, String objectName) {
	// TODO Auto-generated method stub
	
}



}
