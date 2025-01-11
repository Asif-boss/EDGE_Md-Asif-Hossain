package oko_biscuit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Md_Asif_Hossain_Test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://okobiscuit-admin.vercel.app/login");
		
//		for better understanding add some time
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("superAdmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("superAdmin00@11");
		driver.findElement(By.cssSelector("button.ant-btn.css-1e3s98s.ant-btn-primary.ant-btn-block")).click();
		
		
		Thread.sleep(2000);
		driver.get("https://okobiscuit-admin.vercel.app/superAdmin/seller-request");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.ant-btn.ant-btn-default:nth-of-type(2)")).click();
		Thread.sleep(2000);
		
		try {
			driver.findElement(By.cssSelector("button.ant-btn.css-1e3s98s.ant-btn-primary.ant-btn-sm")).click();
			Thread.sleep(2000);
			System.out.println("Pass");
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
//		for closing driver --> generally done
		driver.close();
		driver.quit();

	}

}
