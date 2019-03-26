package ant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbaidu {
	static WebDriver driver;
	static String URL="http://www.baidu.com";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\jiabao\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(URL);
		 driver.findElement(By.className("s_ipt")).sendKeys("selenium");
		 driver.findElement(By.id("su")).click();
	}

	}


