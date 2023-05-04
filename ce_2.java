package ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ce_2 {
	@Test
	public void test1() {
		EdgeOptions co = new EdgeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(co);
        driver.manage().window().maximize() ;
		driver.get ("https://www.amazon.in/");
		
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		txtBoxl.sendKeys("macbook");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		String txt1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt1);
		String txt2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt2);
		String txt3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt3);
		String txt4=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt4);
		String txt5=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt5);
		//filter
//		driver.findElement(By.xpath("//*[@id=\"p_36/7252032031\"]/span/a/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"p_n_pattern_browse-bin/1464446031\"]/span/a/span")).click();
		
		WebElement filter = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));
		filter.click();
		WebElement filter1 = driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_4\"]"));
		filter1.click();
//		String f1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
//		System.out.println(f1);
//		String f2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
//		System.out.println(f2);
//		String f3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
//		System.out.println(f3);
//		String f4=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
//		System.out.println(f4);
//		String f5=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
//		System.out.println(f5);
//		
	}
}
