
package ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ce_1 
{
	@Test
    public static void main( String[] args ) throws InterruptedException
    {
    	EdgeOptions co = new EdgeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(co);
        
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ASUS-15-6-inch-GeForce-Windows-FA506IHRZ-HN111W/dp/B0B5DZTNZQ?ref_=Oct_DLandingS_D_6c1a28b8_61");
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
  	  signIn.click();
  	  WebElement mail = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
  	  WebElement login1 = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
  	  mail.sendKeys("jegatheeswaranmk2002@gmail.com");
  	  login1.click();
  	  try {
  			Thread.sleep(500);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  	  WebElement pass = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
  	  pass.sendKeys("#Amazon2002");
  	  WebElement login2 = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
  	  login2.click();
  	  try {
  			Thread.sleep(500);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  	  
//  	  WebElement pass2 = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
//  	  pass2.sendKeys("#Amazon2002");
//  	  try {
//  			Thread.sleep(10000);
//  		} catch (InterruptedException e) {
//  			// TODO Auto-generated catch block
//  			e.printStackTrace();
//  		}
//  	  WebElement login3 = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
//  	  login3.click();
//  	  
////  	  WebElement phone_img = driver.findElement(By.xpath("//*[@id=\"CardInstance5K2bpoDClbj3N1MmkCFRWg\"]/div[2]/div/a[1]/div/img"));
////  	  phone_img.click();
//  	  try {
//  		Thread.sleep(5000);
//  	} catch (InterruptedException e) {
//  		// TODO Auto-generated catch block
//  		e.printStackTrace();
//  	}
//  	driver.get("https://www.amazon.in");
        String a_title = driver.getTitle();
        String e_title = "ASUS TUF Gaming A15, 15.6-inch (39.62 cms) FHD 144Hz, AMD Ryzen 5 4600H, 4GB NVIDIA GeForce GTX 1650, Gaming Laptop (8GB/512GB SSD/Windows 11/Black/2.3 Kg), FA506IHRZ-HN111W : Amazon.in: Computers & Accessories";
        System.out.println(a_title);
        if(a_title.equals(e_title)) {
        	System.out.println("Title is matching");
        }
        else {
        	System.out.println("Title Mismatch");
        }
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 
        Boolean present = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
//        System.out.println("Is item added to cart:" + present);
        if(present) {
        	System.out.println("Added to cart Successfully");
        }
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        Thread.sleep(2000);
        String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
        String extext = "Your Amazon Cart is empty.";
        if(removeText.equals(extext)) {
        	System.out.println("Removed");
        }
        driver.get("https://www.amazon.in/ASUS-15-6-inch-GeForce-Windows-FA506IHRZ-HN111W/dp/B0B5DZTNZQ?ref_=Oct_DLandingS_D_6c1a28b8_61");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"] "));
        Thread.sleep(1000);
        String sign = driver.getTitle();
        WebElement proceed = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
        proceed.click();
        String amount = driver.findElement(By.xpath("//*[@id=\"subtotals-marketplace-table\"]/tbody/tr[4]/td[2]")).getText();
        System.out.println(amount);
        
//        System.out.println(sign);
//        String esign = "Amazon Sign In";
//        if(sign.equals(esign)) {
//        	System.out.println("Success");
//        }
//        else {
//        	System.out.println("Failure");
//        }
    }}

