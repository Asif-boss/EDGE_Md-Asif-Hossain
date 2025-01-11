package oko_biscuit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Md_Asif_Hossain_Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://okobiscuit-admin.vercel.app/register");
		
//		for better understanding add some time
		Thread.sleep(1000);
		
		driver.findElement(By.id("name")).sendKeys("Ayon");
		driver.findElement(By.id("email")).sendKeys("ayon1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123asif12");
		driver.findElement(By.cssSelector("button.ant-btn.css-1e3s98s.ant-btn-primary.ant-btn-block")).click();
		
		Thread.sleep(2000);
		String current = driver.getCurrentUrl();
		String desired = "https://okobiscuit-admin.vercel.app/login";
		
		if (current.equals(desired))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
//		for closing driver --> generally done
		driver.close();
		driver.quit();

	}

}
