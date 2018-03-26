package mcaProtect;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {
	static WebDriver driver;
	static FileInputStream f;
	static Properties prop;
	
	
	public void openBrowser() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AL1694\\Desktop\\SampleData\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		f = new FileInputStream("C:\\Users\\AL1694\\eclipse-workspace\\SampleProject\\src\\mcaProtect\\objectRepository.properties");
		prop = new Properties();
		prop.load(f);
	}
	public void navigate(String data) {
		driver.get(data);
	}
	public void input(String data,String objectName)throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
		
	}
	public void inputPhoneNo() {
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9786543210");
	}
	
	public void click(String objectName)throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
	}

}
